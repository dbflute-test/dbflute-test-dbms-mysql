package org.docksidestage.mysql.dbflute.nogen.cache;

import java.util.Map;

import org.dbflute.helper.StringKeyMap;
import org.docksidestage.mysql.dbflute.exentity.MemberStatus;

/**
 * @author jflute
 * @since 0.9.9.1B (2011/11/13 Thursday)
 */
public class CachedMemberStatus {

    protected static final Map<String, MemberStatus> _memberStatusMap = StringKeyMap
            .createAsCaseInsensitiveConcurrent();

    public static MemberStatus get(String memberStatusCode) {
        return _memberStatusMap.get(memberStatusCode);
    }

    public static void put(MemberStatus status) {
        _memberStatusMap.put(status.getMemberStatusCode(), status);
    }

    public static void clear() {
        _memberStatusMap.clear();
    }
}
