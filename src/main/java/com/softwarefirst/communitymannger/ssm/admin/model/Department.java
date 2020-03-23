package com.softwarefirst.communitymannger.ssm.admin.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Department implements Serializable {
    private String deNumber;

    private String admNumber;

    private String deName;

    private String dePhone;

    private String deLogin;

    private Date deLogintime;

    private String deUpdate;

    private Date deUpdatetime;

    private static final long serialVersionUID = 1L;

    public String getDeNumber() {
        return deNumber;
    }

    public void setDeNumber(String deNumber) {
        this.deNumber = deNumber;
    }

    public String getAdmNumber() {
        return admNumber;
    }

    public void setAdmNumber(String admNumber) {
        this.admNumber = admNumber;
    }

    public String getDeName() {
        return deName;
    }

    public void setDeName(String deName) {
        this.deName = deName;
    }

    public String getDePhone() {
        return dePhone;
    }

    public void setDePhone(String dePhone) {
        this.dePhone = dePhone;
    }

    public String getDeLogin() {
        return deLogin;
    }

    public void setDeLogin(String deLogin) {
        this.deLogin = deLogin;
    }

    public Date getDeLogintime() {
        return deLogintime;
    }

    public void setDeLogintime(Date deLogintime) {
        this.deLogintime = deLogintime;
    }

    public String getDeUpdate() {
        return deUpdate;
    }

    public void setDeUpdate(String deUpdate) {
        this.deUpdate = deUpdate;
    }

    public Date getDeUpdatetime() {
        return deUpdatetime;
    }

    public void setDeUpdatetime(Date deUpdatetime) {
        this.deUpdatetime = deUpdatetime;
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
        Department other = (Department) that;
        return (this.getDeNumber() == null ? other.getDeNumber() == null : this.getDeNumber().equals(other.getDeNumber()))
            && (this.getAdmNumber() == null ? other.getAdmNumber() == null : this.getAdmNumber().equals(other.getAdmNumber()))
            && (this.getDeName() == null ? other.getDeName() == null : this.getDeName().equals(other.getDeName()))
            && (this.getDePhone() == null ? other.getDePhone() == null : this.getDePhone().equals(other.getDePhone()))
            && (this.getDeLogin() == null ? other.getDeLogin() == null : this.getDeLogin().equals(other.getDeLogin()))
            && (this.getDeLogintime() == null ? other.getDeLogintime() == null : this.getDeLogintime().equals(other.getDeLogintime()))
            && (this.getDeUpdate() == null ? other.getDeUpdate() == null : this.getDeUpdate().equals(other.getDeUpdate()))
            && (this.getDeUpdatetime() == null ? other.getDeUpdatetime() == null : this.getDeUpdatetime().equals(other.getDeUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getDeNumber() == null) ? 0 : getDeNumber().hashCode());
        result = prime * result + ((getAdmNumber() == null) ? 0 : getAdmNumber().hashCode());
        result = prime * result + ((getDeName() == null) ? 0 : getDeName().hashCode());
        result = prime * result + ((getDePhone() == null) ? 0 : getDePhone().hashCode());
        result = prime * result + ((getDeLogin() == null) ? 0 : getDeLogin().hashCode());
        result = prime * result + ((getDeLogintime() == null) ? 0 : getDeLogintime().hashCode());
        result = prime * result + ((getDeUpdate() == null) ? 0 : getDeUpdate().hashCode());
        result = prime * result + ((getDeUpdatetime() == null) ? 0 : getDeUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", deNumber=").append(deNumber);
        sb.append(", admNumber=").append(admNumber);
        sb.append(", deName=").append(deName);
        sb.append(", dePhone=").append(dePhone);
        sb.append(", deLogin=").append(deLogin);
        sb.append(", deLogintime=").append(deLogintime);
        sb.append(", deUpdate=").append(deUpdate);
        sb.append(", deUpdatetime=").append(deUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}