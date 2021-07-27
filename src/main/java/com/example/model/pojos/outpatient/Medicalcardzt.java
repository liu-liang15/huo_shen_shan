package com.example.model.pojos.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import lombok.Data;

import java.util.Date;

@Data
public class Medicalcardzt {

  private int no;
  private String mediNo;
  private String caozuo;
  private String caozuoyuan;
  private java.util.Date date;
  private String yuanyin;

  public Medicalcardzt(){}

  public Medicalcardzt(int no, String mediNo, String caozuo,String caozuoyuan, Date date, String yuanyin) {
    this.no = no;
    this.mediNo = mediNo;
    this.caozuo = caozuo;
    this.caozuoyuan = caozuoyuan;
    this.date = date;
    this.yuanyin = yuanyin;
  }
}

