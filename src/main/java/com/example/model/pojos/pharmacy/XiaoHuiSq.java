package com.example.model.pojos.pharmacy;


import java.util.Collection;
import java.util.Date;

public class XiaoHuiSq {

  private String xhsqId;
  private String xhFzr;
  private Date sj=new Date();
  private long zt;
  private Collection<XiaoHuiXd> xiaoHuiXds;

  public Collection<XiaoHuiXd> getXiaoHuiXds() {
    return xiaoHuiXds;
  }

  public void setXiaoHuiXds(Collection<XiaoHuiXd> xiaoHuiXds) {
    this.xiaoHuiXds = xiaoHuiXds;
  }

  public String getXhsqId() {
    return xhsqId;
  }

  public void setXhsqId(String xhsqId) {
    this.xhsqId = xhsqId;
  }


  public String getXhFzr() {
    return xhFzr;
  }

  public void setXhFzr(String xhFzr) {
    this.xhFzr = xhFzr;
  }


  public Date getSj() {
    return sj;
  }

  public void setSj(Date sj) {
    this.sj = sj;
  }


  public long getZt() {
    return zt;
  }

  public void setZt(long zt) {
    this.zt = zt;
  }

}
