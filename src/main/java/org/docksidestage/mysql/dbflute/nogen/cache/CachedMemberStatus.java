package org.docksidestage.mysql.dbflute.nogen.cache;

import java.util.Map;

import org.dbflute.Entity;
import org.dbflute.helper.StringKeyMap;
import org.dbflute.optional.OptionalEntity;
import org.docksidestage.mysql.dbflute.exentity.MemberStatus;

/**
 * @author jflute
 * @since 0.9.9.1B (2011/11/13 Thursday)
 */
public class CachedMemberStatus {

    protected static final Map<String, MemberStatus> _memberStatusMap = StringKeyMap.createAsCaseInsensitiveConcurrent();

    public static OptionalEntity<MemberStatus> get(Entity entity, String foreignPropertyName, String memberStatusCode) {
        final MemberStatus status = _memberStatusMap.get(memberStatusCode);
        if (status != null) {
            return OptionalEntity.of(status);
        } else {
            return OptionalEntity.relationEmpty(entity, foreignPropertyName);
        }
    }

    public static void put(MemberStatus status) {
        _memberStatusMap.put(status.getMemberStatusCode(), status);
    }

    public static void clear() {
        _memberStatusMap.clear();
    }
}
