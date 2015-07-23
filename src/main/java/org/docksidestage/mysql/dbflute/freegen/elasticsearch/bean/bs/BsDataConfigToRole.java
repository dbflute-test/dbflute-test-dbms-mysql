package org.docksidestage.mysql.dbflute.freegen.elasticsearch.bean.bs;

import java.io.Serializable;

/**
 * ${table.comment}
 * @author FreeGen
 */
public class BsDataConfigToRole implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** dataConfigId */
    protected String dataConfigId;

    /** id */
    protected String id;

    /** roleTypeId */
    protected String roleTypeId;

    // [Referrers] *comment only

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getDataConfigId() {
        return dataConfigId;
    }

    public void setDataConfigId(String value) {
        dataConfigId = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }

    public String getRoleTypeId() {
        return roleTypeId;
    }

    public void setRoleTypeId(String value) {
        roleTypeId = value;
    }

}
