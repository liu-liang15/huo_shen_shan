package com.example.model.pojos.hyj;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;
import java.util.Date;

public class Assay_person {
    private int assayPersonId;
    private String assayPersonName;
    private String assayPersonSex;
    private int assayPersonAge;
    private String assayPersonPhone;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Timestamp assayPersonTime;
    public int getAssayPersonId() {
        return assayPersonId;
    }

    public void setAssayPersonId(int assayPersonId) {
        this.assayPersonId = assayPersonId;
    }

    public String getAssayPersonName() {
        return assayPersonName;
    }

    public void setAssayPersonName(String assayPersonName) {
        this.assayPersonName = assayPersonName;
    }

    public String getAssayPersonSex() {
        return assayPersonSex;
    }

    public void setAssayPersonSex(String assayPersonSex) {
        this.assayPersonSex = assayPersonSex;
    }

    public int getAssayPersonAge() {
        return assayPersonAge;
    }

    public void setAssayPersonAge(int assayPersonAge) {
        this.assayPersonAge = assayPersonAge;
    }

    public String getAssayPersonPhone() {
        return assayPersonPhone;
    }

    public void setAssayPersonPhone(String assayPersonPhone) {
        this.assayPersonPhone = assayPersonPhone;
    }

    public Timestamp getAssayPersonTime() {
        return assayPersonTime;
    }

    public void setAssayPersonTime(Timestamp assayPersonTime) {
        this.assayPersonTime = assayPersonTime;
    }

    @Override
    public String toString() {
        return "Assay_person{" +
                "assayPersonId=" + assayPersonId +
                ", assayPersonName='" + assayPersonName + '\'' +
                ", assayPersonSex='" + assayPersonSex + '\'' +
                ", assayPersonAge=" + assayPersonAge +
                ", assayPersonPhone='" + assayPersonPhone + '\'' +
                ", assayPersonTime=" + assayPersonTime +
                '}';
    }

    public Assay_person() {
    }

    public Assay_person(int assayPersonId, String assayPersonName, String assayPersonSex, int assayPersonAge, String assayPersonPhone, Timestamp assayPersonTime) {
        this.assayPersonId = assayPersonId;
        this.assayPersonName = assayPersonName;
        this.assayPersonSex = assayPersonSex;
        this.assayPersonAge = assayPersonAge;
        this.assayPersonPhone = assayPersonPhone;
        this.assayPersonTime = assayPersonTime;
    }
}
