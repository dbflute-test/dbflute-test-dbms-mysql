package org.docksidestage.mysql.dbflute.nogen.cache;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.dbflute.Entity;
import org.dbflute.bhv.BehaviorSelector;
import org.dbflute.dbmeta.info.ColumnInfo;
import org.docksidestage.mysql.dbflute.bsentity.dbmeta.MemberWithdrawalDbm;
import org.docksidestage.mysql.dbflute.exbhv.MemberWithdrawalBhv;
import org.docksidestage.mysql.dbflute.exentity.MemberWithdrawal;
import org.seasar.framework.container.SingletonS2Container;

/**
 * @author jflute
 * @since 1.1.0 (2014/11/06 Thursday)
 */
public class CachedMemberWithdrawal {

    // #simple_for_example no synchronization
    protected static final Map<Integer, MemberWithdrawal> _cacheMap = new ConcurrentHashMap<Integer, MemberWithdrawal>();

    public static <PROP> PROP get(Entity entity, String columnName, Integer memberId) {
        final MemberWithdrawal status = _cacheMap.get(memberId);
        final ColumnInfo columnInfo = MemberWithdrawalDbm.getInstance().findColumnInfo(columnName);
        if (status != null) {
            return columnInfo.read(status);
        }
        loadCache(entity, columnName, memberId);
        final MemberWithdrawal reloaded = _cacheMap.get(memberId);
        if (reloaded == null) {
            String msg = "Failed to reload cache: " + entity.asTableDbName() + "." + columnName + "::" + memberId;
            throw new IllegalStateException(msg);
        }
        return columnInfo.read(status);
    }

    protected static void loadCache(Entity entity, String columnName, Integer memberId) { // lazy-loaded
        BehaviorSelector selector = SingletonS2Container.getComponent(BehaviorSelector.class);
        MemberWithdrawalBhv withdrawalBhv = selector.select(MemberWithdrawalBhv.class);
        MemberWithdrawal withdrawal = withdrawalBhv.selectEntityWithDeletedCheck(cb -> cb.acceptPK(memberId));
        if (_cacheMap.containsKey(memberId)) {
            return;
        }
        put(memberId, withdrawal);
    }

    public static void put(Integer memberId, MemberWithdrawal withdrawal) {
        _cacheMap.put(withdrawal.getMemberId(), withdrawal);
    }

    public static void clear() {
        _cacheMap.clear();
    }
}
