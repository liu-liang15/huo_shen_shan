package com.example.model.pojos.outpatient;

import lombok.Data;

@Data
public class Examinedetails {

  private int exadetNo;
  private int exadetExaordNo;
  private int assayMealId;
  private int exadetCount;
  private double assayMealPrice;

  public Examinedetails(){}

  public Examinedetails(int exadetNo, int exadetExaordNo, int assayMealId, int exadetCount, double assayMealPrice) {
    this.exadetNo = exadetNo;
    this.exadetExaordNo = exadetExaordNo;
    this.assayMealId = assayMealId;
    this.exadetCount = exadetCount;
    this.assayMealPrice = assayMealPrice;
  }
}

