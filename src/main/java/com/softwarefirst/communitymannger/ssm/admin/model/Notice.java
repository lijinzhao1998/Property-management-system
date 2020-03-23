package com.softwarefirst.communitymannger.ssm.admin.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Notice implements Serializable {
    private String noNumber;

    private String admNumber;

    private String noTitle;

    private String noDetails;

    private Date noPtime;

    private String noLogin;

    private Date noLogintime;

    private String noUpdate;

    private Date noUpdatetime;

    private static final long serialVersionUID = 1L;

    public String getNoNumber() {
        return noNumber;
    }

    public void setNoNumber(String noNumber) {
        this.noNumber = noNumber;
    }

    public String getAdmNumber() {
        return admNumber;
    }

    public void setAdmNumber(String admNumber) {
        this.admNumber = admNumber;
    }

    public String getNoTitle() {
        return noTitle;
    }

    public void setNoTitle(String noTitle) {
        this.noTitle = noTitle;
    }

    public String getNoDetails() {
        return noDetails;
    }

    public void setNoDetails(String noDetails) {
        this.noDetails = noDetails;
    }

    public Date getNoPtime() {
        return noPtime;
    }

    public void setNoPtime(Date noPtime) {
        this.noPtime = noPtime;
    }

    public String getNoLogin() {
        return noLogin;
    }

    public void setNoLogin(String noLogin) {
        this.noLogin = noLogin;
    }

    public Date getNoLogintime() {
        return noLogintime;
    }

    public void setNoLogintime(Date noLogintime) {
        this.noLogintime = noLogintime;
    }

    public String getNoUpdate() {
        return noUpdate;
    }

    public void setNoUpdate(String noUpdate) {
        this.noUpdate = noUpdate;
    }

    public Date getNoUpdatetime() {
        return noUpdatetime;
    }

    public void setNoUpdatetime(Date noUpdatetime) {
        this.noUpdatetime = noUpdatetime;
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
        Notice other = (Notice) that;
        return (this.getNoNumber() == null ? other.getNoNumber() == null : this.getNoNumber().equals(other.getNoNumber()))
            && (this.getAdmNumber() == null ? other.getAdmNumber() == null : this.getAdmNumber().equals(other.getAdmNumber()))
            && (this.getNoTitle() == null ? other.getNoTitle() == null : this.getNoTitle().equals(other.getNoTitle()))
            && (this.getNoDetails() == null ? other.getNoDetails() == null : this.getNoDetails().equals(other.getNoDetails()))
            && (this.getNoPtime() == null ? other.getNoPtime() == null : this.getNoPtime().equals(other.getNoPtime()))
            && (this.getNoLogin() == null ? other.getNoLogin() == null : this.getNoLogin().equals(other.getNoLogin()))
            && (this.getNoLogintime() == null ? other.getNoLogintime() == null : this.getNoLogintime().equals(other.getNoLogintime()))
            && (this.getNoUpdate() == null ? other.getNoUpdate() == null : this.getNoUpdate().equals(other.getNoUpdate()))
            && (this.getNoUpdatetime() == null ? other.getNoUpdatetime() == null : this.getNoUpdatetime().equals(other.getNoUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getNoNumber() == null) ? 0 : getNoNumber().hashCode());
        result = prime * result + ((getAdmNumber() == null) ? 0 : getAdmNumber().hashCode());
        result = prime * result + ((getNoTitle() == null) ? 0 : getNoTitle().hashCode());
        result = prime * result + ((getNoDetails() == null) ? 0 : getNoDetails().hashCode());
        result = prime * result + ((getNoPtime() == null) ? 0 : getNoPtime().hashCode());
        result = prime * result + ((getNoLogin() == null) ? 0 : getNoLogin().hashCode());
        result = prime * result + ((getNoLogintime() == null) ? 0 : getNoLogintime().hashCode());
        result = prime * result + ((getNoUpdate() == null) ? 0 : getNoUpdate().hashCode());
        result = prime * result + ((getNoUpdatetime() == null) ? 0 : getNoUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", noNumber=").append(noNumber);
        sb.append(", admNumber=").append(admNumber);
        sb.append(", noTitle=").append(noTitle);
        sb.append(", noDetails=").append(noDetails);
        sb.append(", noPtime=").append(noPtime);
        sb.append(", noLogin=").append(noLogin);
        sb.append(", noLogintime=").append(noLogintime);
        sb.append(", noUpdate=").append(noUpdate);
        sb.append(", noUpdatetime=").append(noUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}