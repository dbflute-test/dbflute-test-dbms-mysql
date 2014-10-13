package org.docksidestage.mysql.friends.seasar.enclave.service;

import org.docksidestage.mysql.friends.seasar.enclave.service.EnclaveRefService;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class EnclaveRefServiceTest extends UnitContainerTestCase {

    private EnclaveRefService enclaveRefService;

    public void test_checkIndirectJdbcComponentInjection() throws Exception {
        // ## Arrange ##
        // ## Act ##
        // ## Assert ##
        enclaveRefService.checkIndirectJdbcComponentInjection(); // expect no exception
    }
}
