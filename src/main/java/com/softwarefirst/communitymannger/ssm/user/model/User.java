package com.softwarefirst.communitymannger.ssm.user.model;

import java.io.Serializable;

/**
 * @author 
 * 
 */
public class User implements Serializable {
    private Integer usId;

    private String usPassword;

    private String usName;

    private String usSex;

    private String usPhone;

    private Integer usLevel;

    private static final long serialVersionUID = 1L;

    public Integer getUsId() {
        return usId;
    }

    public void setUsId(Integer usId) {
        this.usId = usId;
    }

    public String getUsPassword() {
        return usPassword;
    }

    public void setUsPassword(String usPassword) {
        this.usPassword = usPassword;
    }

    public String getUsName() {
        return usName;
    }

    public void setUsName(String usName) {
        this.usName = usName;
    }

    public String getUsSex() {
        return usSex;
    }

    public void setUsSex(String usSex) {
        this.usSex = usSex;
    }

    public String getUsPhone() {
        return usPhone;
    }

    public void setUsPhone(String usPhone) {
        this.usPhone = usPhone;
    }

    public Integer getUsLevel() {
        return usLevel;
    }

    public void setUsLevel(Integer usLevel) {
        this.usLevel = usLevel;
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
        User other = (User) that;
        return (this.getUsId() == null ? other.getUsId() == null : this.getUsId().equals(other.getUsId()))
            && (this.getUsPassword() == null ? other.getUsPassword() == null : this.getUsPassword().equals(other.getUsPassword()))
            && (this.getUsName() == null ? other.getUsName() == null : this.getUsName().equals(other.getUsName()))
            && (this.getUsSex() == null ? other.getUsSex() == null : this.getUsSex().equals(other.getUsSex()))
            && (this.getUsPhone() == null ? other.getUsPhone() == null : this.getUsPhone().equals(other.getUsPhone()))
            && (this.getUsLevel() == null ? other.getUsLevel() == null : this.getUsLevel().equals(other.getUsLevel()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getUsId() == null) ? 0 : getUsId().hashCode());
        result = prime * result + ((getUsPassword() == null) ? 0 : getUsPassword().hashCode());
        result = prime * result + ((getUsName() == null) ? 0 : getUsName().hashCode());
        result = prime * result + ((getUsSex() == null) ? 0 : getUsSex().hashCode());
        result = prime * result + ((getUsPhone() == null) ? 0 : getUsPhone().hashCode());
        result = prime * result + ((getUsLevel() == null) ? 0 : getUsLevel().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", usId=").append(usId);
        sb.append(", usPassword=").append(usPassword);
        sb.append(", usName=").append(usName);
        sb.append(", usSex=").append(usSex);
        sb.append(", usPhone=").append(usPhone);
        sb.append(", usLevel=").append(usLevel);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}