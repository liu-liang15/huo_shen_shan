package com.example.model.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class FeebillDetails {

  private int febideNo;
  private int febideFeebillNo;
  private int febideId;
  private String febideName;
  private Double febideMoney;
  private String febideType;
  private int febideCount;


  public FeebillDetails(){}

  public FeebillDetails(int febideNo, int febideFeebillNo,int febideId, String febideName, Double febideMoney, String febideType, int febideCount) {
    this.febideNo = febideNo;
    this.febideFeebillNo = febideFeebillNo;
    this.febideId = febideId;
    this.febideName = febideName;
    this.febideMoney = febideMoney;
    this.febideType = febideType;
    this.febideCount = febideCount;
  }
}

