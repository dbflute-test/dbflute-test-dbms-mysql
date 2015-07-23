package org.docksidestage.mysql.dbflute.freegen.elasticsearch.bean.bs;

import java.io.Serializable;

/**
 * ${table.comment}
 * @author FreeGen
 */
public class BsUserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** code */
    protected String code;

    /** createdTime */
    protected long createdTime;

    /** id */
    protected String id;

    /** updatedTime */
    protected long updatedTime;

    // [Referrers] *comment only

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getCode() {
        return code;
    }

    public void setCode(String value) {
        code = value;
    }

    public long getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(long value) {
        createdTime = value;
    }

    public String getId() {
        return id;
    }

    public void setId(String value) {
        id = value;
    }

    public long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(long value) {
        updatedTime = value;
    }

}
