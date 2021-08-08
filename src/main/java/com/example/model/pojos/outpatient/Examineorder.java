package com.example.model.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Examineorder {

  private int exaordNo;
  private String exaordSeedoNumber;
  private double exaordMoney;
  private java.util.Date exaordDate;
  private int exaordState;

  public Examineorder(){}

  public Examineorder(int exaordNo, String exaordSeedoNumber, double exaordMoney, Date exaordDate, int exaordState) {
    this.exaordNo = exaordNo;
    this.exaordSeedoNumber = exaordSeedoNumber;
    this.exaordMoney = exaordMoney;
    this.exaordDate = exaordDate;
    this.exaordState = exaordState;
  }
}

