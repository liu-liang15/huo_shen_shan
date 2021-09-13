package com.example.model.pojos.pharmacy;


import java.util.Date;

public class FaYao {

  private long fyId;
  private String fyRy;
  private String cfd;
  private Date fySj=new Date();


  public long getFyId() {
    return fyId;
  }

  public void setFyId(long fyId) {
    this.fyId = fyId;
  }


  public String getFyRy() {
    return fyRy;
  }

  public void setFyRy(String fyRy) {
    this.fyRy = fyRy;
  }


  public String getCfd() {
    return cfd;
  }

  public void setCfd(String cfd) {
    this.cfd = cfd;
  }

  public Date getFySj() {
    return fySj;
  }

  public void setFySj(Date fySj) {
    this.fySj = fySj;
  }
}
