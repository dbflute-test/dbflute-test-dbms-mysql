package org.docksidestage.mysql.friends.seasar.tricky;

import org.docksidestage.mysql.unit.UnitContainerTestCase;

/**
 * @author jflute
 */
public class TrickyActionTest extends UnitContainerTestCase {

    @Override
    protected boolean isSuppressWebMock() {
        return false;
    }

    public void test_inject_tricky_dependency_requestValid() throws Exception {
        TrickyAction action = new TrickyAction();
        inject(action); // expect no exception
    }
}
