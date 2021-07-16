package com.example.model.pojos.inpatient;


public class Bed {

  private long bedNo;
  private String bedZt;
  private double bedMon;
  private String wardNo;
  private String resNo;
  private HosAlone hosAlone;

  public HosAlone getHosAlone() {
    return hosAlone;
  }

  public void setHosAlone(HosAlone hosAlone) {
    this.hosAlone = hosAlone;
  }

  public long getBedNo() {
    return bedNo;
  }

  public void setBedNo(long bedNo) {
    this.bedNo = bedNo;
  }


  public String getBedZt() {
    return bedZt;
  }

  public void setBedZt(String bedZt) {
    this.bedZt = bedZt;
  }


  public double getBedMon() {
    return bedMon;
  }

  public void setBedMon(double bedMon) {
    this.bedMon = bedMon;
  }


  public String getWardNo() {
    return wardNo;
  }

  public void setWardNo(String wardNo) {
    this.wardNo = wardNo;
  }


  public String getResNo() {
    return resNo;
  }

  public void setResNo(String resNo) {
    this.resNo = resNo;
  }

}
