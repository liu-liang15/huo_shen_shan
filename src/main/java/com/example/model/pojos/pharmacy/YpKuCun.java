package com.example.model.pojos.pharmacy;


public class YpKuCun {

  private long kcId;
  private int rkpcId;
  private long ypsl;
  private RkXiangDan rkXiangDan;

  public RkXiangDan getRkXiangDan() {
    return rkXiangDan;
  }

  public void setRkXiangDan(RkXiangDan rkXiangDan) {
    this.rkXiangDan = rkXiangDan;
  }

  public long getKcId() {
    return kcId;
  }

  public void setKcId(long kcId) {
    this.kcId = kcId;
  }

  public int getRkpcId() {
    return rkpcId;
  }

  public void setRkpcId(int rkpcId) {
    this.rkpcId = rkpcId;
  }

  public long getYpsl() {
    return ypsl;
  }

  public void setYpsl(long ypsl) {
    this.ypsl = ypsl;
  }

}
