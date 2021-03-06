package com.example.model.pojos.outpatient;

import lombok.Data;

import java.util.Date;

@Data
public class Casehistorydetails {

  private int cahideNo;
  private String cahideCashisNo;
  private String cahideKeshiName;
  private String cahideZhusu;
  private String cahideXianbingshi;
  private String cahideJiwangshi;
  private String cahideZhiliaoyijian;
  private String cahideYsqianming;
  private java.util.Date cahideDate;

  private Casehistory casehistory;

  public Casehistorydetails(){}

  public Casehistorydetails(int cahideNo, String cahideCashisNo, String cahideKeshiName, String cahideZhusu, String cahideXianbingshi, String cahideJiwangshi, String cahideZhiliaoyijian, String cahideYsqianming, Date cahideDate, Casehistory casehistory) {
    this.cahideNo = cahideNo;
    this.cahideCashisNo = cahideCashisNo;
    this.cahideKeshiName = cahideKeshiName;
    this.cahideZhusu = cahideZhusu;
    this.cahideXianbingshi = cahideXianbingshi;
    this.cahideJiwangshi = cahideJiwangshi;
    this.cahideZhiliaoyijian = cahideZhiliaoyijian;
    this.cahideYsqianming = cahideYsqianming;
    this.cahideDate = cahideDate;
    this.casehistory = casehistory;
  }
}

