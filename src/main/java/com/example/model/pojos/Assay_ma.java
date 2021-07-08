package com.example.model.pojos;

import java.util.Date;

public class Assay_ma extends Assay_person{
    private int assayMaId;
    private Date assayMaTime;

    public Assay_ma() {
    }

    @Override
    public String toString() {
        return "Assay_ma{" +
                "assayMaId=" + assayMaId +
                ", assayMaTime=" + assayMaTime +
                '}';
    }

    public int getAssayMaId() {
        return assayMaId;
    }

    public void setAssayMaId(int assayMaId) {
        this.assayMaId = assayMaId;
    }

    public Date getAssayMaTime() {
        return assayMaTime;
    }

    public void setAssayMaTime(Date assayMaTime) {
        this.assayMaTime = assayMaTime;
    }

    public Assay_ma(int assayMaId, Date assayMaTime) {
        this.assayMaId = assayMaId;
        this.assayMaTime = assayMaTime;
    }
}
