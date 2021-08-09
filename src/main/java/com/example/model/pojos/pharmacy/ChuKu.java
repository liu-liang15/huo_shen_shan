package com.example.model.pojos.pharmacy;


import java.util.Collection;
import java.util.Date;
import java.util.List;

public class ChuKu {

  private String chukuId;
  private String chukuFuzhe;
  private String chukuCause;
  private Date chukuTime=new Date();
  private List<ChuKuJiLu> chuKuJiLus;

  public List<ChuKuJiLu> getChuKuJiLus() {
    return chuKuJiLus;
  }

  public void setChuKuJiLus(List<ChuKuJiLu> chuKuJiLus) {
    this.chuKuJiLus = chuKuJiLus;
  }

  public String getChukuId() {
    return chukuId;
  }

  public void setChukuId(String chukuId) {
    this.chukuId = chukuId;
  }


  public String getChukuFuzhe() {
    return chukuFuzhe;
  }

  public void setChukuFuzhe(String chukuFuzhe) {
    this.chukuFuzhe = chukuFuzhe;
  }


  public String getChukuCause() {
    return chukuCause;
  }

  public void setChukuCause(String chukuCause) {
    this.chukuCause = chukuCause;
  }


  public Date getChukuTime() {
    return chukuTime;
  }

  public void setChukuTime(Date chukuTime) {
    this.chukuTime = chukuTime;
  }

}
