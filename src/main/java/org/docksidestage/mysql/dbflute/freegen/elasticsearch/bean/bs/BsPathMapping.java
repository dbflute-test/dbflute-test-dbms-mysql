package org.docksidestage.mysql.dbflute.freegen.elasticsearch.bean.bs;

import java.io.Serializable;

/**
 * ${table.comment}
 * @author FreeGen
 */
public class BsPathMapping implements Serializable {

    private static final long serialVersionUID = 1L;

    // ===================================================================================
    //                                                                           Attribute
    //                                                                           =========
    /** createdBy */
    protected String createdBy;

    /** createdTime */
    protected long createdTime;

    /** id */
    protected String id;

    /** processType */
    protected String processType;

    /** regex */
    protected String regex;

    /** replacement */
    protected String replacement;

    /** sortOrder */
    protected Integer sortOrder;

    /** updatedBy */
    protected String updatedBy;

    /** updatedTime */
    protected long updatedTime;

    // [Referrers] *comment only

    // ===================================================================================
    //                                                                            Accessor
    //                                                                            ========
    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String value) {
        createdBy = value;
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

    public String getProcessType() {
        return processType;
    }

    public void setProcessType(String value) {
        processType = value;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String value) {
        regex = value;
    }

    public String getReplacement() {
        return replacement;
    }

    public void setReplacement(String value) {
        replacement = value;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer value) {
        sortOrder = value;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String value) {
        updatedBy = value;
    }

    public long getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(long value) {
        updatedTime = value;
    }

}
