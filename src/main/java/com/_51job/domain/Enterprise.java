package com._51job.domain;

import java.sql.Timestamp;
import java.util.Objects;

public class Enterprise {
    private int enterpriseId;
    private String name;
    private int domicile;
    private String address;
    private Timestamp foundingTime;
    private int scale;
    private int industry;
    private int type;
    private String description;
    private String userName;
    private String userMobile;

    public int getEnterpriseId() {
        return enterpriseId;
    }

    public void setEnterpriseId(int enterpriseId) {
        this.enterpriseId = enterpriseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDomicile() {
        return domicile;
    }

    public void setDomicile(int domicile) {
        this.domicile = domicile;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Timestamp getFoundingTime() {
        return foundingTime;
    }

    public void setFoundingTime(Timestamp foundingTime) {
        this.foundingTime = foundingTime;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public int getIndustry() {
        return industry;
    }

    public void setIndustry(int industry) {
        this.industry = industry;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Enterprise that = (Enterprise) o;
        return enterpriseId == that.enterpriseId &&
                domicile == that.domicile &&
                scale == that.scale &&
                industry == that.industry &&
                type == that.type &&
                Objects.equals(name, that.name) &&
                Objects.equals(address, that.address) &&
                Objects.equals(foundingTime, that.foundingTime) &&
                Objects.equals(description, that.description) &&
                Objects.equals(userName, that.userName) &&
                Objects.equals(userMobile, that.userMobile);
    }

    @Override
    public int hashCode() {

        return Objects.hash(enterpriseId, name, domicile, address, foundingTime, scale, industry, type, description, userName, userMobile);
    }
}
