package org.docksidestage.mysql.dbflute.resola.allcommon;

import org.dbflute.bhv.core.context.ConditionBeanContext;
import org.dbflute.dbway.DBDef;
import org.dbflute.hook.PrologueHook;
import org.dbflute.system.DBFluteSystem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author DBFlute(AutoGenerator)
 */
public class ResolaDBFluteInitializer {

    // ===================================================================================
    //                                                                          Definition
    //                                                                          ==========
    /** The logger instance for this class. (NotNull) */
    private static final Logger _log = LoggerFactory.getLogger(ResolaDBFluteInitializer.class);

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    // -----------------------------------------------------
    //                                                Option
    //                                                ------
    protected PrologueHook _prologueHook; // null allowed

    // ===================================================================================
    //                                                                         Constructor
    //                                                                         ===========
    /**
     * Constructor, which initializes various components.
     */
    public ResolaDBFluteInitializer() {
        announce();
        prologue();
        standBy();
    }

    /**
     * Hook the prologue process as you like it. <br>
     * (basically for your original DBFluteConfig settings)
     * @param prologueHook The hook interface of prologue process. (NotNull)
     * @return this. (NotNull)
     */
    public ResolaDBFluteInitializer hookPrologue(PrologueHook prologueHook) {
        if (prologueHook == null) {
            String msg = "The argument 'prologueHook' should not be null!";
            throw new IllegalArgumentException(msg);
        }
        _prologueHook = prologueHook;
        return this;
    }

    // ===================================================================================
    //                                                                             Curtain
    //                                                                             =======
    /**
     * DBFlute will begin in just a few second.
     */
    protected void announce() {
        _log.info("...Initializing DBFlute components");
    }

    /**
     * This is the story for ... <br>
     * You can override this to set your DBFluteConfig settings
     * with calling super.prologue() in it.
     */
    protected void prologue() {
        if (_prologueHook != null) {
            _prologueHook.hookBefore();
        }
        loadCoolClasses();
        adjustDBFluteSystem();
    }

    /**
     * Enjoy your DBFlute life.
     */
    protected void standBy() {
        if (!ResolaDBFluteConfig.getInstance().isLocked()) {
            ResolaDBFluteConfig.getInstance().lock();
        }
        if (!DBFluteSystem.isLocked()) {
            DBFluteSystem.lock();
        }
    }

    // ===================================================================================
    //                                                                            Contents
    //                                                                            ========
    protected void loadCoolClasses() { // for S2Container
        ConditionBeanContext.loadCoolClasses(); // against the ClassLoader Headache!
    }

    /**
     * Adjust DBFlute system if it needs.
     */
    protected void adjustDBFluteSystem() {
    }

    // ===================================================================================
    //                                                                       Assist Helper
    //                                                                       =============
    protected boolean isCurrentDBDef(DBDef currentDBDef) {
        return ResolaDBCurrent.getInstance().isCurrentDBDef(currentDBDef);
    }

    // ===================================================================================
    //                                                                      General Helper
    //                                                                      ==============
    protected String ln() {
        return DBFluteSystem.ln();
    }
}
