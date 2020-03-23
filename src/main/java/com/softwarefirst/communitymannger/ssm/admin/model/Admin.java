package com.softwarefirst.communitymannger.ssm.admin.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Admin implements Serializable {
    private String admNumber;

    private String admPassword;

    private String admUsername;

    private String admVname;

    private String admJobnumber;

    private String admRealname;

    private String admSex;

    private String admPhone;

    private String admLogin;

    private Date admLogintime;

    private String admUpdate;

    private Date admUpdatetime;

    private static final long serialVersionUID = 1L;

    public String getAdmNumber() {
        return admNumber;
    }

    public void setAdmNumber(String admNumber) {
        this.admNumber = admNumber;
    }

    public String getAdmPassword() {
        return admPassword;
    }

    public void setAdmPassword(String admPassword) {
        this.admPassword = admPassword;
    }

    public String getAdmUsername() {
        return admUsername;
    }

    public void setAdmUsername(String admUsername) {
        this.admUsername = admUsername;
    }

    public String getAdmVname() {
        return admVname;
    }

    public void setAdmVname(String admVname) {
        this.admVname = admVname;
    }

    public String getAdmJobnumber() {
        return admJobnumber;
    }

    public void setAdmJobnumber(String admJobnumber) {
        this.admJobnumber = admJobnumber;
    }

    public String getAdmRealname() {
        return admRealname;
    }

    public void setAdmRealname(String admRealname) {
        this.admRealname = admRealname;
    }

    public String getAdmSex() {
        return admSex;
    }

    public void setAdmSex(String admSex) {
        this.admSex = admSex;
    }

    public String getAdmPhone() {
        return admPhone;
    }

    public void setAdmPhone(String admPhone) {
        this.admPhone = admPhone;
    }

    public String getAdmLogin() {
        return admLogin;
    }

    public void setAdmLogin(String admLogin) {
        this.admLogin = admLogin;
    }

    public Date getAdmLogintime() {
        return admLogintime;
    }

    public void setAdmLogintime(Date admLogintime) {
        this.admLogintime = admLogintime;
    }

    public String getAdmUpdate() {
        return admUpdate;
    }

    public void setAdmUpdate(String admUpdate) {
        this.admUpdate = admUpdate;
    }

    public Date getAdmUpdatetime() {
        return admUpdatetime;
    }

    public void setAdmUpdatetime(Date admUpdatetime) {
        this.admUpdatetime = admUpdatetime;
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
        Admin other = (Admin) that;
        return (this.getAdmNumber() == null ? other.getAdmNumber() == null : this.getAdmNumber().equals(other.getAdmNumber()))
            && (this.getAdmPassword() == null ? other.getAdmPassword() == null : this.getAdmPassword().equals(other.getAdmPassword()))
            && (this.getAdmUsername() == null ? other.getAdmUsername() == null : this.getAdmUsername().equals(other.getAdmUsername()))
            && (this.getAdmVname() == null ? other.getAdmVname() == null : this.getAdmVname().equals(other.getAdmVname()))
            && (this.getAdmJobnumber() == null ? other.getAdmJobnumber() == null : this.getAdmJobnumber().equals(other.getAdmJobnumber()))
            && (this.getAdmRealname() == null ? other.getAdmRealname() == null : this.getAdmRealname().equals(other.getAdmRealname()))
            && (this.getAdmSex() == null ? other.getAdmSex() == null : this.getAdmSex().equals(other.getAdmSex()))
            && (this.getAdmPhone() == null ? other.getAdmPhone() == null : this.getAdmPhone().equals(other.getAdmPhone()))
            && (this.getAdmLogin() == null ? other.getAdmLogin() == null : this.getAdmLogin().equals(other.getAdmLogin()))
            && (this.getAdmLogintime() == null ? other.getAdmLogintime() == null : this.getAdmLogintime().equals(other.getAdmLogintime()))
            && (this.getAdmUpdate() == null ? other.getAdmUpdate() == null : this.getAdmUpdate().equals(other.getAdmUpdate()))
            && (this.getAdmUpdatetime() == null ? other.getAdmUpdatetime() == null : this.getAdmUpdatetime().equals(other.getAdmUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdmNumber() == null) ? 0 : getAdmNumber().hashCode());
        result = prime * result + ((getAdmPassword() == null) ? 0 : getAdmPassword().hashCode());
        result = prime * result + ((getAdmUsername() == null) ? 0 : getAdmUsername().hashCode());
        result = prime * result + ((getAdmVname() == null) ? 0 : getAdmVname().hashCode());
        result = prime * result + ((getAdmJobnumber() == null) ? 0 : getAdmJobnumber().hashCode());
        result = prime * result + ((getAdmRealname() == null) ? 0 : getAdmRealname().hashCode());
        result = prime * result + ((getAdmSex() == null) ? 0 : getAdmSex().hashCode());
        result = prime * result + ((getAdmPhone() == null) ? 0 : getAdmPhone().hashCode());
        result = prime * result + ((getAdmLogin() == null) ? 0 : getAdmLogin().hashCode());
        result = prime * result + ((getAdmLogintime() == null) ? 0 : getAdmLogintime().hashCode());
        result = prime * result + ((getAdmUpdate() == null) ? 0 : getAdmUpdate().hashCode());
        result = prime * result + ((getAdmUpdatetime() == null) ? 0 : getAdmUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", admNumber=").append(admNumber);
        sb.append(", admPassword=").append(admPassword);
        sb.append(", admUsername=").append(admUsername);
        sb.append(", admVname=").append(admVname);
        sb.append(", admJobnumber=").append(admJobnumber);
        sb.append(", admRealname=").append(admRealname);
        sb.append(", admSex=").append(admSex);
        sb.append(", admPhone=").append(admPhone);
        sb.append(", admLogin=").append(admLogin);
        sb.append(", admLogintime=").append(admLogintime);
        sb.append(", admUpdate=").append(admUpdate);
        sb.append(", admUpdatetime=").append(admUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}