package com.example.model.pojos.pharmacy;


import java.util.Collection;
import java.util.Date;

public class DiaoBoSq {

  private String dbShengQing;
  private String dbsqr;
  private String dbfzr;
  private Date sqsj = new Date();
  private String sqZhuangTai;
  private Collection<DbsqXiangBiao> dbsqXiangBiaos;

  public Collection<DbsqXiangBiao> getDbsqXiangBiaos() {
    return dbsqXiangBiaos;
  }

  public void setDbsqXiangBiaos(Collection<DbsqXiangBiao> dbsqXiangBiaos) {
    this.dbsqXiangBiaos = dbsqXiangBiaos;
  }

  public String getDbShengQing() {
    return dbShengQing;
  }

  public void setDbShengQing(String dbShengQing) {
    this.dbShengQing = dbShengQing;
  }


  public String getDbsqr() {
    return dbsqr;
  }

  public void setDbsqr(String dbsqr) {
    this.dbsqr = dbsqr;
  }


  public String getDbfzr() {
    return dbfzr;
  }

  public void setDbfzr(String dbfzr) {
    this.dbfzr = dbfzr;
  }


  public Date getSqsj() {
    return sqsj;
  }

  public void setSqsj(Date sqsj) {
    this.sqsj = sqsj;
  }


  public String getSqZhuangTai() {
    return sqZhuangTai;
  }

  public void setSqZhuangTai(String sqZhuangTai) {
    this.sqZhuangTai = sqZhuangTai;
  }

}
