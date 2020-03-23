package com.softwarefirst.communitymannger.ssm.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Owner implements Serializable {
    private String owNumber;

    private String owName;

    private String owSex;

    private String owPhone;

    private String owLogin;

    private Date owLogintime;

    private String owUpdate;

    private Date owUpdatetime;

    private static final long serialVersionUID = 1L;

    public String getOwNumber() {
        return owNumber;
    }

    public void setOwNumber(String owNumber) {
        this.owNumber = owNumber;
    }

    public String getOwName() {
        return owName;
    }

    public void setOwName(String owName) {
        this.owName = owName;
    }

    public String getOwSex() {
        return owSex;
    }

    public void setOwSex(String owSex) {
        this.owSex = owSex;
    }

    public String getOwPhone() {
        return owPhone;
    }

    public void setOwPhone(String owPhone) {
        this.owPhone = owPhone;
    }

    public String getOwLogin() {
        return owLogin;
    }

    public void setOwLogin(String owLogin) {
        this.owLogin = owLogin;
    }

    public Date getOwLogintime() {
        return owLogintime;
    }

    public void setOwLogintime(Date owLogintime) {
        this.owLogintime = owLogintime;
    }

    public String getOwUpdate() {
        return owUpdate;
    }

    public void setOwUpdate(String owUpdate) {
        this.owUpdate = owUpdate;
    }

    public Date getOwUpdatetime() {
        return owUpdatetime;
    }

    public void setOwUpdatetime(Date owUpdatetime) {
        this.owUpdatetime = owUpdatetime;
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
        Owner other = (Owner) that;
        return (this.getOwNumber() == null ? other.getOwNumber() == null : this.getOwNumber().equals(other.getOwNumber()))
            && (this.getOwName() == null ? other.getOwName() == null : this.getOwName().equals(other.getOwName()))
            && (this.getOwSex() == null ? other.getOwSex() == null : this.getOwSex().equals(other.getOwSex()))
            && (this.getOwPhone() == null ? other.getOwPhone() == null : this.getOwPhone().equals(other.getOwPhone()))
            && (this.getOwLogin() == null ? other.getOwLogin() == null : this.getOwLogin().equals(other.getOwLogin()))
            && (this.getOwLogintime() == null ? other.getOwLogintime() == null : this.getOwLogintime().equals(other.getOwLogintime()))
            && (this.getOwUpdate() == null ? other.getOwUpdate() == null : this.getOwUpdate().equals(other.getOwUpdate()))
            && (this.getOwUpdatetime() == null ? other.getOwUpdatetime() == null : this.getOwUpdatetime().equals(other.getOwUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getOwNumber() == null) ? 0 : getOwNumber().hashCode());
        result = prime * result + ((getOwName() == null) ? 0 : getOwName().hashCode());
        result = prime * result + ((getOwSex() == null) ? 0 : getOwSex().hashCode());
        result = prime * result + ((getOwPhone() == null) ? 0 : getOwPhone().hashCode());
        result = prime * result + ((getOwLogin() == null) ? 0 : getOwLogin().hashCode());
        result = prime * result + ((getOwLogintime() == null) ? 0 : getOwLogintime().hashCode());
        result = prime * result + ((getOwUpdate() == null) ? 0 : getOwUpdate().hashCode());
        result = prime * result + ((getOwUpdatetime() == null) ? 0 : getOwUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", owNumber=").append(owNumber);
        sb.append(", owName=").append(owName);
        sb.append(", owSex=").append(owSex);
        sb.append(", owPhone=").append(owPhone);
        sb.append(", owLogin=").append(owLogin);
        sb.append(", owLogintime=").append(owLogintime);
        sb.append(", owUpdate=").append(owUpdate);
        sb.append(", owUpdatetime=").append(owUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}