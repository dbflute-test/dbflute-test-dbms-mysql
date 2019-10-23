package org.docksidestage.mysql.dbflute.whitebox.dfprop;

import java.io.File;
import java.io.FileInputStream;
import java.util.Map;
import java.util.Map.Entry;

import org.dbflute.helper.dfmap.DfMapFile;
import org.dbflute.utflute.core.PlainTestCase;

/**
 * @author jflute
 */
public class WxLReverseTableNameMapTest extends PlainTestCase {

    public void test_getMessage_noArg() throws Exception {
        // ## Arrange ##
        String mapFile = getProjectDir().getCanonicalPath() + "/dbflute_maihamadb/output/doc/data/tableNameMap.dataprop";
        if (!new File(mapFile).exists()) {
            return;
        }

        // ## Act ##
        Map<String, Object> map = new DfMapFile().readMap(new FileInputStream(mapFile));

        // ## Assert ##
        assertFalse(map.isEmpty());
        for (Entry<String, Object> entry : map.entrySet()) {
            log(entry.getKey(), entry.getValue());
        }
    }
}