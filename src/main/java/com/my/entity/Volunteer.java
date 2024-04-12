package com.my.entity;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import javax.annotation.Generated;

public class Volunteer {
    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer vtId;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private Integer vtIntegralCount;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vtAvatar;

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    private String vtName;



    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getVtId() {
        return vtId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVtId(Integer vtId) {
        this.vtId = vtId;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public Integer getVtIntegralCount() {
        return vtIntegralCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVtIntegralCount(Integer vtIntegralCount) {
        this.vtIntegralCount = vtIntegralCount;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getVtAvatar() {
        return vtAvatar;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVtAvatar(String vtAvatar) {
        this.vtAvatar = vtAvatar == null ? null : vtAvatar.trim();
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public String getVtName() {
        return vtName;
    }

    @Generated("org.mybatis.generator.api.MyBatisGenerator")
    public void setVtName(String vtName) {
        this.vtName = vtName == null ? null : vtName.trim();
    }






}