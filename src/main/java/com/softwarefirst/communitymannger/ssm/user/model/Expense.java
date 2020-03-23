package com.softwarefirst.communitymannger.ssm.user.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 
 * 
 */
public class Expense implements Serializable {
    private String exNumber;

    private String owNumber;

    private String emNumber;

    private String exCost;

    private String exType;

    private Date exDetails;

    private String exPay;

    private String exState;

    private String exLogin;

    private Date exLogintime;

    private String exUpdate;

    private Date exUpdatetime;

    private static final long serialVersionUID = 1L;

    public String getExNumber() {
        return exNumber;
    }

    public void setExNumber(String exNumber) {
        this.exNumber = exNumber;
    }

    public String getOwNumber() {
        return owNumber;
    }

    public void setOwNumber(String owNumber) {
        this.owNumber = owNumber;
    }

    public String getEmNumber() {
        return emNumber;
    }

    public void setEmNumber(String emNumber) {
        this.emNumber = emNumber;
    }

    public String getExCost() {
        return exCost;
    }

    public void setExCost(String exCost) {
        this.exCost = exCost;
    }

    public String getExType() {
        return exType;
    }

    public void setExType(String exType) {
        this.exType = exType;
    }

    public Date getExDetails() {
        return exDetails;
    }

    public void setExDetails(Date exDetails) {
        this.exDetails = exDetails;
    }

    public String getExPay() {
        return exPay;
    }

    public void setExPay(String exPay) {
        this.exPay = exPay;
    }

    public String getExState() {
        return exState;
    }

    public void setExState(String exState) {
        this.exState = exState;
    }

    public String getExLogin() {
        return exLogin;
    }

    public void setExLogin(String exLogin) {
        this.exLogin = exLogin;
    }

    public Date getExLogintime() {
        return exLogintime;
    }

    public void setExLogintime(Date exLogintime) {
        this.exLogintime = exLogintime;
    }

    public String getExUpdate() {
        return exUpdate;
    }

    public void setExUpdate(String exUpdate) {
        this.exUpdate = exUpdate;
    }

    public Date getExUpdatetime() {
        return exUpdatetime;
    }

    public void setExUpdatetime(Date exUpdatetime) {
        this.exUpdatetime = exUpdatetime;
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
        Expense other = (Expense) that;
        return (this.getExNumber() == null ? other.getExNumber() == null : this.getExNumber().equals(other.getExNumber()))
            && (this.getOwNumber() == null ? other.getOwNumber() == null : this.getOwNumber().equals(other.getOwNumber()))
            && (this.getEmNumber() == null ? other.getEmNumber() == null : this.getEmNumber().equals(other.getEmNumber()))
            && (this.getExCost() == null ? other.getExCost() == null : this.getExCost().equals(other.getExCost()))
            && (this.getExType() == null ? other.getExType() == null : this.getExType().equals(other.getExType()))
            && (this.getExDetails() == null ? other.getExDetails() == null : this.getExDetails().equals(other.getExDetails()))
            && (this.getExPay() == null ? other.getExPay() == null : this.getExPay().equals(other.getExPay()))
            && (this.getExState() == null ? other.getExState() == null : this.getExState().equals(other.getExState()))
            && (this.getExLogin() == null ? other.getExLogin() == null : this.getExLogin().equals(other.getExLogin()))
            && (this.getExLogintime() == null ? other.getExLogintime() == null : this.getExLogintime().equals(other.getExLogintime()))
            && (this.getExUpdate() == null ? other.getExUpdate() == null : this.getExUpdate().equals(other.getExUpdate()))
            && (this.getExUpdatetime() == null ? other.getExUpdatetime() == null : this.getExUpdatetime().equals(other.getExUpdatetime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getExNumber() == null) ? 0 : getExNumber().hashCode());
        result = prime * result + ((getOwNumber() == null) ? 0 : getOwNumber().hashCode());
        result = prime * result + ((getEmNumber() == null) ? 0 : getEmNumber().hashCode());
        result = prime * result + ((getExCost() == null) ? 0 : getExCost().hashCode());
        result = prime * result + ((getExType() == null) ? 0 : getExType().hashCode());
        result = prime * result + ((getExDetails() == null) ? 0 : getExDetails().hashCode());
        result = prime * result + ((getExPay() == null) ? 0 : getExPay().hashCode());
        result = prime * result + ((getExState() == null) ? 0 : getExState().hashCode());
        result = prime * result + ((getExLogin() == null) ? 0 : getExLogin().hashCode());
        result = prime * result + ((getExLogintime() == null) ? 0 : getExLogintime().hashCode());
        result = prime * result + ((getExUpdate() == null) ? 0 : getExUpdate().hashCode());
        result = prime * result + ((getExUpdatetime() == null) ? 0 : getExUpdatetime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", exNumber=").append(exNumber);
        sb.append(", owNumber=").append(owNumber);
        sb.append(", emNumber=").append(emNumber);
        sb.append(", exCost=").append(exCost);
        sb.append(", exType=").append(exType);
        sb.append(", exDetails=").append(exDetails);
        sb.append(", exPay=").append(exPay);
        sb.append(", exState=").append(exState);
        sb.append(", exLogin=").append(exLogin);
        sb.append(", exLogintime=").append(exLogintime);
        sb.append(", exUpdate=").append(exUpdate);
        sb.append(", exUpdatetime=").append(exUpdatetime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}