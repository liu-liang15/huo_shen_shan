package com.example.model.pojos.inpatient;


public class BedRec {

  private long bedRecNo;
  private String bedNo;
  private java.sql.Timestamp bedTime;
  private String resNo;


  public long getBedRecNo() {
    return bedRecNo;
  }

  public void setBedRecNo(long bedRecNo) {
    this.bedRecNo = bedRecNo;
  }


  public String getBedNo() {
    return bedNo;
  }

  public void setBedNo(String bedNo) {
    this.bedNo = bedNo;
  }


  public java.sql.Timestamp getBedTime() {
    return bedTime;
  }

  public void setBedTime(java.sql.Timestamp bedTime) {
    this.bedTime = bedTime;
  }


  public String getResNo() {
    return resNo;
  }

  public void setResNo(String resNo) {
    this.resNo = resNo;
  }

}
