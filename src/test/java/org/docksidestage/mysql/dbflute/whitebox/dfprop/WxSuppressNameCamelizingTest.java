package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import java.util.ArrayList;
import java.util.List;

import org.docksidestage.mysql.dbflute.allcommon.CDef;
import org.docksidestage.mysql.dbflute.allcommon.CDef.NamingDefaultCamelizingType;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 * @since 1.1.3 (2017/03/27 Monday)
 */
public class WxSuppressNameCamelizingTest extends UnitContainerTestCase {

    public void test_basic() throws Exception {
        // compile is assert
        final List<NamingDefaultCamelizingType> camelizingList = new ArrayList<CDef.NamingDefaultCamelizingType>();
        camelizingList.add(CDef.NamingDefaultCamelizingType.Sea海mystic);
        camelizingList.add(CDef.NamingDefaultCamelizingType.LAND陸oneman);
        camelizingList.add(CDef.NamingDefaultCamelizingType.PiArI);
        camelizingList.add(CDef.NamingDefaultCamelizingType.Bonvo);
        camelizingList.add(CDef.NamingDefaultCamelizingType.Dstore);
        final List<CDef.NamingNoCamelizingType> noCamelizingList = new ArrayList<CDef.NamingNoCamelizingType>();
        noCamelizingList.add(CDef.NamingNoCamelizingType.SEA海MYSTIC);
        noCamelizingList.add(CDef.NamingNoCamelizingType.LAND陸oneman);
        noCamelizingList.add(CDef.NamingNoCamelizingType.PI_ARI);
        noCamelizingList.add(CDef.NamingNoCamelizingType.Bonvo);
        noCamelizingList.add(CDef.NamingNoCamelizingType.dstore);
    }
}
