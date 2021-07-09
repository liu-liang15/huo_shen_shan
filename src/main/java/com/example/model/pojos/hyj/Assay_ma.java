package com.example.model.pojos.hyj;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.sql.Timestamp;

public class Assay_ma extends Assay_person {
    private int assayMaId;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    private Timestamp assayMaTime;

    public Assay_ma() {
    }

    public Assay_ma(int assayMaId, Timestamp assayMaTime) {
        this.assayMaId = assayMaId;
        this.assayMaTime = assayMaTime;
    }

    public int getAssayMaId() {
        return assayMaId;
    }

    public void setAssayMaId(int assayMaId) {
        this.assayMaId = assayMaId;
    }

    public Timestamp getAssayMaTime() {
        return assayMaTime;
    }

    public void setAssayMaTime(Timestamp assayMaTime) {
        this.assayMaTime = assayMaTime;
    }
}
