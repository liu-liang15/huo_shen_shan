package com.example.model.pojos.inpatient;


import com.example.model.pojos.pharmacy.YaoPingXx;

public class DocAdvXq {

  private long docAdvId;
  private String docAdvNo;
  private long drugId;
  private long drugNumber;
  private java.sql.Timestamp docStat;
  private java.sql.Timestamp docEnd;
  private String docYz;
  private String docZt;
  private YaoPingXx yaoPingXx;

  public long getDocAdvId() {
    return docAdvId;
  }

  public void setDocAdvId(long docAdvId) {
    this.docAdvId = docAdvId;
  }


  public String getDocAdvNo() {
    return docAdvNo;
  }

  public void setDocAdvNo(String docAdvNo) {
    this.docAdvNo = docAdvNo;
  }


  public long getDrugId() {
    return drugId;
  }

  public void setDrugId(long drugId) {
    this.drugId = drugId;
  }


  public long getDrugNumber() {
    return drugNumber;
  }

  public void setDrugNumber(long drugNumber) {
    this.drugNumber = drugNumber;
  }


  public java.sql.Timestamp getDocStat() {
    return docStat;
  }

  public void setDocStat(java.sql.Timestamp docStat) {
    this.docStat = docStat;
  }


  public java.sql.Timestamp getDocEnd() {
    return docEnd;
  }

  public void setDocEnd(java.sql.Timestamp docEnd) {
    this.docEnd = docEnd;
  }


  public String getDocYz() {
    return docYz;
  }

  public void setDocYz(String docYz) {
    this.docYz = docYz;
  }


  public String getDocZt() {
    return docZt;
  }

  public void setDocZt(String docZt) {
    this.docZt = docZt;
  }

  public YaoPingXx getYaoPingXx() {
    return yaoPingXx;
  }

  public void setYaoPingXx(YaoPingXx yaoPingXx) {
    this.yaoPingXx = yaoPingXx;
  }

  @Override
  public String toString() {
    return "DocAdvXq{" +
            "docAdvId=" + docAdvId +
            ", docAdvNo='" + docAdvNo + '\'' +
            ", drugId=" + drugId +
            ", drugNumber=" + drugNumber +
            ", docStat=" + docStat +
            ", docEnd=" + docEnd +
            ", docYz='" + docYz + '\'' +
            ", docZt='" + docZt + '\'' +
            '}';
  }
}