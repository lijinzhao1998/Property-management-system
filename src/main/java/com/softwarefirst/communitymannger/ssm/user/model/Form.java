package com.softwarefirst.communitymannger.ssm.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Form implements Serializable {
    private String foNumber;

    private String owNumber;

    private String foType;

    private String foState;

    private String foNote;

    private Date foPtime;

    private Date foFtime;

    private String foLogin;

    private Date foLogintime;

    private String foUpdate;

    private Date foUpdatetime;

    private static final long serialVersionUID = 1L;

    public String getFoNumber() {
        return foNumber;
    }

    public void setFoNumber(String foNumber) {
        this.foNumber = foNumber;
    }

    public String getOwNumber() {
        return owNumber;
    }

    public void setOwNumber(String owNumber) {
        this.owNumber = owNumber;
    }

    public String getFoType() {
        return foType;
    }

    public void setFoType(String foType) {
        this.foType = foType;
    }

    public String getFoState() {
        return foState;
    }

    public void setFoState(String foState) {
        this.foState = foState;
    }

    public String getFoNote() {
        return foNote;
    }

    public void setFoNote(String foNote) {
        this.foNote = foNote;
    }

    public Date getFoPtime() {
        return foPtime;
    }

    public void setFoPtime(Date foPtime) {
        this.foPtime = foPtime;
    }

    public Date getFoFtime() {
        return foFtime;
    }

    public void setFoFtime(Date foFtime) {
        this.foFtime = foFtime;
    }

    public String getFoLogin() {
        return foLogin;
    }

    public void setFoLogin(String foLogin) {
        this.foLogin = foLogin;
    }

    public Date getFoLogintime() {
        return foLogintime;
    }

    public void setFoLogintime(Date foLogintime) {
        this.foLogintime = foLogintime;
    }

    public String getFoUpdate() {
        return foUpdate;
    }

    public void setFoUpdate(String foUpdate) {
        this.foUpdate = foUpdate;
    }

    public Date getFoUpdatetime() {
        return foUpdatetime;
    }

    public void setFoUpdatetime(Date foUpdatetime) {
        this.foUpdatetime = foUpdatetime;
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
        Form other = (Form) that;
        return (this.getFoNumber() == null ? other.getFoNumber() == null : this.getFoNumber().equals(other.getFoNumber()))
            && (this.getOwNumber() == null ? other.getOwNumber() == null : this.getOwNumber().equals(other.getOwNumber()))
            && (this.getFoType() == null ? other.getFoType() == null : this.getFoType().equals(other.getFoType()))
            && (this.getFoState() == null ? other.getFoState() == null : this.getFoState().equals(other.getFoState()))
            && (this.getFoNote() == null ? other.getFoNote() == null : this.getFoNote().equals(other.getFoNote()))
            && (this.getFoPtime() == null ? other.getFoPtime() == null : this.getFoPtime().equals(other.getFoPtime()))
            && (this.getFoFtime() == null ? other.getFoFtime() == null : this.getFoFtime().equals(other.getFoFtime()))
            && (this.getFoLogin() == null ? other.getFoLogin() == null : this.getFoLogin().equals(other.getFoLogin()))
            && (this.getFoLogintime() == null ? other.getFoLogintime() == null : this.getFoLogintime().equals(other.getFoLogintime()))
            && (this.getFoUpdate() == null ? other.getFoUpdate() == null : this.getFoUpdate().equals(other.getFoUpdate()))
            && (this.getFoUpdatetime() == null ? other.getFoUpdatetime() == null : this.getFoUpdatetime().equals(other.getFoUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getFoNumber() == null) ? 0 : getFoNumber().hashCode());
        result = prime * result + ((getOwNumber() == null) ? 0 : getOwNumber().hashCode());
        result = prime * result + ((getFoType() == null) ? 0 : getFoType().hashCode());
        result = prime * result + ((getFoState() == null) ? 0 : getFoState().hashCode());
        result = prime * result + ((getFoNote() == null) ? 0 : getFoNote().hashCode());
        result = prime * result + ((getFoPtime() == null) ? 0 : getFoPtime().hashCode());
        result = prime * result + ((getFoFtime() == null) ? 0 : getFoFtime().hashCode());
        result = prime * result + ((getFoLogin() == null) ? 0 : getFoLogin().hashCode());
        result = prime * result + ((getFoLogintime() == null) ? 0 : getFoLogintime().hashCode());
        result = prime * result + ((getFoUpdate() == null) ? 0 : getFoUpdate().hashCode());
        result = prime * result + ((getFoUpdatetime() == null) ? 0 : getFoUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", foNumber=").append(foNumber);
        sb.append(", owNumber=").append(owNumber);
        sb.append(", foType=").append(foType);
        sb.append(", foState=").append(foState);
        sb.append(", foNote=").append(foNote);
        sb.append(", foPtime=").append(foPtime);
        sb.append(", foFtime=").append(foFtime);
        sb.append(", foLogin=").append(foLogin);
        sb.append(", foLogintime=").append(foLogintime);
        sb.append(", foUpdate=").append(foUpdate);
        sb.append(", foUpdatetime=").append(foUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}