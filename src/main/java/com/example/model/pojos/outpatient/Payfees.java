package com.example.model.pojos.outpatient;

import lombok.Data;

import java.io.Serializable;
@Data
public class Payfees implements Serializable {
    private String No;
    private String ks;
    private String ys;
    private double zjg;

    public Payfees() {
    }

    public Payfees(String no, String ks, String ys, double zjg) {
        No = no;
        this.ks = ks;
        this.ys = ys;
        this.zjg = zjg;
    }
}
