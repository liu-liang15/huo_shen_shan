package com.example.model.pojos.pharmacy;


import com.fasterxml.jackson.annotation.JsonFormat;

public class RkXiangDan {

  private long rkPc;
  private String rkDh;
  private String drugId;
  private String consuId;
  private int rkypSl;
  @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
  private java.sql.Timestamp scrq;
  @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
  private java.sql.Timestamp bzq;
  private String ckId;

  public String getConsuId() {
    return consuId;
  }

  public void setConsuId(String consuId) {
    this.consuId = consuId;
  }

  public String getRkDh() {
    return rkDh;
  }

  public void setRkDh(String rkDh) {
    this.rkDh = rkDh;
  }

  public String getDrugId() {
    return drugId;
  }

  public void setDrugId(String drugId) {
    this.drugId = drugId;
  }

  public long getRkPc() {
    return rkPc;
  }

  public void setRkPc(long rkPc) {
    this.rkPc = rkPc;
  }



  public int getRkypSl() {
    return rkypSl;
  }

  public void setRkypSl(int rkypSl) {
    this.rkypSl = rkypSl;
  }


  public java.sql.Timestamp getScrq() {
    return scrq;
  }

  public void setScrq(java.sql.Timestamp scrq) {
    this.scrq = scrq;
  }


  public java.sql.Timestamp getBzq() {
    return bzq;
  }

  public void setBzq(java.sql.Timestamp bzq) {
    this.bzq = bzq;
  }


  public String getCkId() {
    return ckId;
  }

  public void setCkId(String ckId) {
    this.ckId = ckId;
  }

}
