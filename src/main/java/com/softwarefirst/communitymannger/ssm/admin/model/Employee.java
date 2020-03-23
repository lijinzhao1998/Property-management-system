package com.softwarefirst.communitymannger.ssm.admin.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Employee implements Serializable {
    private String emNumber;

    private String deNumber;

    private String emSex;

    private String emPhone;

    private String emName;

    private String emPost;

    private String emLogin;

    private Date emLogintime;

    private String emUpdate;

    private Date emUpdatetime;

    private static final long serialVersionUID = 1L;

    public String getEmNumber() {
        return emNumber;
    }

    public void setEmNumber(String emNumber) {
        this.emNumber = emNumber;
    }

    public String getDeNumber() {
        return deNumber;
    }

    public void setDeNumber(String deNumber) {
        this.deNumber = deNumber;
    }

    public String getEmSex() {
        return emSex;
    }

    public void setEmSex(String emSex) {
        this.emSex = emSex;
    }

    public String getEmPhone() {
        return emPhone;
    }

    public void setEmPhone(String emPhone) {
        this.emPhone = emPhone;
    }

    public String getEmName() {
        return emName;
    }

    public void setEmName(String emName) {
        this.emName = emName;
    }

    public String getEmPost() {
        return emPost;
    }

    public void setEmPost(String emPost) {
        this.emPost = emPost;
    }

    public String getEmLogin() {
        return emLogin;
    }

    public void setEmLogin(String emLogin) {
        this.emLogin = emLogin;
    }

    public Date getEmLogintime() {
        return emLogintime;
    }

    public void setEmLogintime(Date emLogintime) {
        this.emLogintime = emLogintime;
    }

    public String getEmUpdate() {
        return emUpdate;
    }

    public void setEmUpdate(String emUpdate) {
        this.emUpdate = emUpdate;
    }

    public Date getEmUpdatetime() {
        return emUpdatetime;
    }

    public void setEmUpdatetime(Date emUpdatetime) {
        this.emUpdatetime = emUpdatetime;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Employee other = (Employee) that;
        return (this.getEmNumber() == null ? other.getEmNumber() == null : this.getEmNumber().equals(other.getEmNumber()))
            && (this.getDeNumber() == null ? other.getDeNumber() == null : this.getDeNumber().equals(other.getDeNumber()))
            && (this.getEmSex() == null ? other.getEmSex() == null : this.getEmSex().equals(other.getEmSex()))
            && (this.getEmPhone() == null ? other.getEmPhone() == null : this.getEmPhone().equals(other.getEmPhone()))
            && (this.getEmName() == null ? other.getEmName() == null : this.getEmName().equals(other.getEmName()))
            && (this.getEmPost() == null ? other.getEmPost() == null : this.getEmPost().equals(other.getEmPost()))
            && (this.getEmLogin() == null ? other.getEmLogin() == null : this.getEmLogin().equals(other.getEmLogin()))
            && (this.getEmLogintime() == null ? other.getEmLogintime() == null : this.getEmLogintime().equals(other.getEmLogintime()))
            && (this.getEmUpdate() == null ? other.getEmUpdate() == null : this.getEmUpdate().equals(other.getEmUpdate()))
            && (this.getEmUpdatetime() == null ? other.getEmUpdatetime() == null : this.getEmUpdatetime().equals(other.getEmUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getEmNumber() == null) ? 0 : getEmNumber().hashCode());
        result = prime * result + ((getDeNumber() == null) ? 0 : getDeNumber().hashCode());
        result = prime * result + ((getEmSex() == null) ? 0 : getEmSex().hashCode());
        result = prime * result + ((getEmPhone() == null) ? 0 : getEmPhone().hashCode());
        result = prime * result + ((getEmName() == null) ? 0 : getEmName().hashCode());
        result = prime * result + ((getEmPost() == null) ? 0 : getEmPost().hashCode());
        result = prime * result + ((getEmLogin() == null) ? 0 : getEmLogin().hashCode());
        result = prime * result + ((getEmLogintime() == null) ? 0 : getEmLogintime().hashCode());
        result = prime * result + ((getEmUpdate() == null) ? 0 : getEmUpdate().hashCode());
        result = prime * result + ((getEmUpdatetime() == null) ? 0 : getEmUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", emNumber=").append(emNumber);
        sb.append(", deNumber=").append(deNumber);
        sb.append(", emSex=").append(emSex);
        sb.append(", emPhone=").append(emPhone);
        sb.append(", emName=").append(emName);
        sb.append(", emPost=").append(emPost);
        sb.append(", emLogin=").append(emLogin);
        sb.append(", emLogintime=").append(emLogintime);
        sb.append(", emUpdate=").append(emUpdate);
        sb.append(", emUpdatetime=").append(emUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}