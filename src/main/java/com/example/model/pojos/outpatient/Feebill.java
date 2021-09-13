package com.example.model.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Feebill {

  private int feebillNo;
  private String feebillSeedoNumber;
  private Double feebillMoney;
  private String feebillType;
  private java.util.Date feebillDate;
  private int feebillState;
  private String feebillRemark;


  public Feebill(){}

  public Feebill(int feebillNo, String feebillSeedoNumber, Double feebillMoney, String feebillType, Date feebillDate, int feebillState, String feebillRemark) {
    this.feebillNo = feebillNo;
    this.feebillSeedoNumber = feebillSeedoNumber;
    this.feebillMoney = feebillMoney;
    this.feebillType = feebillType;
    this.feebillDate = feebillDate;
    this.feebillState = feebillState;
    this.feebillRemark = feebillRemark;
  }
}

