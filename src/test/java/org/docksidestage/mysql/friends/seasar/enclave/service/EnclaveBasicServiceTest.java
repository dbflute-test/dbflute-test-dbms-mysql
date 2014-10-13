package org.docksidestage.mysql.friends.seasar.enclave.service;

import org.docksidestage.mysql.friends.seasar.enclave.service.EnclaveBasicService;
import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class EnclaveBasicServiceTest extends UnitContainerTestCase {

    private EnclaveBasicService enclaveBasicService;

    public void test_checkJdbcComponentInjection() throws Exception {
        // ## Arrange ##
        // ## Act ##
        // ## Assert ##
        enclaveBasicService.checkJdbcComponentInjection(); // expect no exception
    }
}
