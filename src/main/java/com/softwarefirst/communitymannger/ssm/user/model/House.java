package com.softwarefirst.communitymannger.ssm.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class House implements Serializable {
    private String hoNumber;

    private String owNumber;

    private String hoCell;

    private String hoLevel;

    private String hoArea;

    private String hoPrice;

    private String hoState;

    private String hoLogin;

    private Date hoLogintime;

    private String hoUpdate;

    private Date hoUpdatetime;

    private static final long serialVersionUID = 1L;

    public String getHoNumber() {
        return hoNumber;
    }

    public void setHoNumber(String hoNumber) {
        this.hoNumber = hoNumber;
    }

    public String getOwNumber() {
        return owNumber;
    }

    public void setOwNumber(String owNumber) {
        this.owNumber = owNumber;
    }

    public String getHoCell() {
        return hoCell;
    }

    public void setHoCell(String hoCell) {
        this.hoCell = hoCell;
    }

    public String getHoLevel() {
        return hoLevel;
    }

    public void setHoLevel(String hoLevel) {
        this.hoLevel = hoLevel;
    }

    public String getHoArea() {
        return hoArea;
    }

    public void setHoArea(String hoArea) {
        this.hoArea = hoArea;
    }

    public String getHoPrice() {
        return hoPrice;
    }

    public void setHoPrice(String hoPrice) {
        this.hoPrice = hoPrice;
    }

    public String getHoState() {
        return hoState;
    }

    public void setHoState(String hoState) {
        this.hoState = hoState;
    }

    public String getHoLogin() {
        return hoLogin;
    }

    public void setHoLogin(String hoLogin) {
        this.hoLogin = hoLogin;
    }

    public Date getHoLogintime() {
        return hoLogintime;
    }

    public void setHoLogintime(Date hoLogintime) {
        this.hoLogintime = hoLogintime;
    }

    public String getHoUpdate() {
        return hoUpdate;
    }

    public void setHoUpdate(String hoUpdate) {
        this.hoUpdate = hoUpdate;
    }

    public Date getHoUpdatetime() {
        return hoUpdatetime;
    }

    public void setHoUpdatetime(Date hoUpdatetime) {
        this.hoUpdatetime = hoUpdatetime;
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
        House other = (House) that;
        return (this.getHoNumber() == null ? other.getHoNumber() == null : this.getHoNumber().equals(other.getHoNumber()))
            && (this.getOwNumber() == null ? other.getOwNumber() == null : this.getOwNumber().equals(other.getOwNumber()))
            && (this.getHoCell() == null ? other.getHoCell() == null : this.getHoCell().equals(other.getHoCell()))
            && (this.getHoLevel() == null ? other.getHoLevel() == null : this.getHoLevel().equals(other.getHoLevel()))
            && (this.getHoArea() == null ? other.getHoArea() == null : this.getHoArea().equals(other.getHoArea()))
            && (this.getHoPrice() == null ? other.getHoPrice() == null : this.getHoPrice().equals(other.getHoPrice()))
            && (this.getHoState() == null ? other.getHoState() == null : this.getHoState().equals(other.getHoState()))
            && (this.getHoLogin() == null ? other.getHoLogin() == null : this.getHoLogin().equals(other.getHoLogin()))
            && (this.getHoLogintime() == null ? other.getHoLogintime() == null : this.getHoLogintime().equals(other.getHoLogintime()))
            && (this.getHoUpdate() == null ? other.getHoUpdate() == null : this.getHoUpdate().equals(other.getHoUpdate()))
            && (this.getHoUpdatetime() == null ? other.getHoUpdatetime() == null : this.getHoUpdatetime().equals(other.getHoUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHoNumber() == null) ? 0 : getHoNumber().hashCode());
        result = prime * result + ((getOwNumber() == null) ? 0 : getOwNumber().hashCode());
        result = prime * result + ((getHoCell() == null) ? 0 : getHoCell().hashCode());
        result = prime * result + ((getHoLevel() == null) ? 0 : getHoLevel().hashCode());
        result = prime * result + ((getHoArea() == null) ? 0 : getHoArea().hashCode());
        result = prime * result + ((getHoPrice() == null) ? 0 : getHoPrice().hashCode());
        result = prime * result + ((getHoState() == null) ? 0 : getHoState().hashCode());
        result = prime * result + ((getHoLogin() == null) ? 0 : getHoLogin().hashCode());
        result = prime * result + ((getHoLogintime() == null) ? 0 : getHoLogintime().hashCode());
        result = prime * result + ((getHoUpdate() == null) ? 0 : getHoUpdate().hashCode());
        result = prime * result + ((getHoUpdatetime() == null) ? 0 : getHoUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hoNumber=").append(hoNumber);
        sb.append(", owNumber=").append(owNumber);
        sb.append(", hoCell=").append(hoCell);
        sb.append(", hoLevel=").append(hoLevel);
        sb.append(", hoArea=").append(hoArea);
        sb.append(", hoPrice=").append(hoPrice);
        sb.append(", hoState=").append(hoState);
        sb.append(", hoLogin=").append(hoLogin);
        sb.append(", hoLogintime=").append(hoLogintime);
        sb.append(", hoUpdate=").append(hoUpdate);
        sb.append(", hoUpdatetime=").append(hoUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}