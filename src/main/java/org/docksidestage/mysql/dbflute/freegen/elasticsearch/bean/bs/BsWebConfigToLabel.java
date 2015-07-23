package org.docksidestage.mysql.dbflute.freegen.elasticsearch.bean.bs;

import java.io.Serializable;

/**
 * ${table.comment}
 * @author FreeGen
 */
public class BsWebConfigToLabel implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** id */
    protected String id;

    /** labelTypeId */
    protected String labelTypeId;

    /** webConfigId */
    protected String webConfigId;

    // [Referrers] *comment only

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }

    public String getLabelTypeId() {
        return labelTypeId;
    }

    public void setLabelTypeId(String value) {
        labelTypeId = value;
    }

    public String getWebConfigId() {
        return webConfigId;
    }

    public void setWebConfigId(String value) {
        webConfigId = value;
    }

}
