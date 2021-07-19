package com.example.model.pojos.pharmacy;


import java.util.Collection;
import java.util.List;

public class CaiGoJh {
  private long planId;
  private String supplyId;
  private String userId;
  private java.sql.Timestamp planTime;
  private java.sql.Timestamp planXiugai;
  private double planPrice;
  private Collection<JhXiangDan> jhXiangDans;

  public Collection<JhXiangDan> getJhXiangDans() {
    return jhXiangDans;
  }

  public void setJhXiangDans(Collection<JhXiangDan> jhXiangDans) {
    this.jhXiangDans = jhXiangDans;
  }

  public long getPlanId() {
    return planId;
  }

  public void setPlanId(long planId) {
    this.planId = planId;
  }


  public String getSupplyId() {
    return supplyId;
  }

  public void setSupplyId(String supplyId) {
    this.supplyId = supplyId;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public java.sql.Timestamp getPlanTime() {
    return planTime;
  }

  public void setPlanTime(java.sql.Timestamp planTime) {
    this.planTime = planTime;
  }


  public java.sql.Timestamp getPlanXiugai() {
    return planXiugai;
  }

  public void setPlanXiugai(java.sql.Timestamp planXiugai) {
    this.planXiugai = planXiugai;
  }


  public double getPlanPrice() {
    return planPrice;
  }

  public void setPlanPrice(double planPrice) {
    this.planPrice = planPrice;
  }

}
