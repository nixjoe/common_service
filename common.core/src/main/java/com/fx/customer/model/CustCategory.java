package com.fx.customer.model;

import mybatis.framework.core.model.BaseValueObject;

public class CustCategory extends BaseValueObject {
    private Integer id;

    private String cateName;

    private String status = "((0))";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCateName() {
        return cateName;
    }

    public void setCateName(String cateName) {
        this.cateName = cateName == null ? null : cateName.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}