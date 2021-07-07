package com.example.model.pojos;

import java.io.Serializable;
import lombok.Data;

/**
 * adm_not
 * @author 
 */
@Data
public class YPGuiGe implements Serializable {
    /**
     * 住院通知单号
     */
    private Integer hosNo;

    /**
     * 就诊卡号
     */
    private String patient;

    /**
     * 就诊科室
     */
    private String section;

    /**
     * 就诊医生
     */
    private String doctor;

    /**
     * 就诊结果
     */
    private String result;

    /**
     * 就诊处置
     */
    private String dispose;

    /**
     * 状态
     */
    private String admZt;

    private static final long serialVersionUID = 1L;

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
        YPGuiGe other = (YPGuiGe) that;
        return (this.getHosNo() == null ? other.getHosNo() == null : this.getHosNo().equals(other.getHosNo()))
            && (this.getPatient() == null ? other.getPatient() == null : this.getPatient().equals(other.getPatient()))
            && (this.getSection() == null ? other.getSection() == null : this.getSection().equals(other.getSection()))
            && (this.getDoctor() == null ? other.getDoctor() == null : this.getDoctor().equals(other.getDoctor()))
            && (this.getResult() == null ? other.getResult() == null : this.getResult().equals(other.getResult()))
            && (this.getDispose() == null ? other.getDispose() == null : this.getDispose().equals(other.getDispose()))
            && (this.getAdmZt() == null ? other.getAdmZt() == null : this.getAdmZt().equals(other.getAdmZt()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getHosNo() == null) ? 0 : getHosNo().hashCode());
        result = prime * result + ((getPatient() == null) ? 0 : getPatient().hashCode());
        result = prime * result + ((getSection() == null) ? 0 : getSection().hashCode());
        result = prime * result + ((getDoctor() == null) ? 0 : getDoctor().hashCode());
        result = prime * result + ((getResult() == null) ? 0 : getResult().hashCode());
        result = prime * result + ((getDispose() == null) ? 0 : getDispose().hashCode());
        result = prime * result + ((getAdmZt() == null) ? 0 : getAdmZt().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", hosNo=").append(hosNo);
        sb.append(", patient=").append(patient);
        sb.append(", section=").append(section);
        sb.append(", doctor=").append(doctor);
        sb.append(", result=").append(result);
        sb.append(", dispose=").append(dispose);
        sb.append(", admZt=").append(admZt);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}