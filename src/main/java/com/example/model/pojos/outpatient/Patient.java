package com.example.model.pojos.outpatient;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

@Data
public class Patient implements Serializable {

  private Integer patientNo;
  private String patientName;
  private String patientSex;
  private String patientPhone;
  private String patientIdcart;
  private String patientAge;
  @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
  private Date patientBirthdate;
  private String patientAddress;
  private Date patientDate;

  public Patient(Integer patientNo, String patientName, String patientSex, String patientPhone, String patientIdcart, String patientAge, Date patientBirthdate, String patientAddress, Date patientDate) {
    this.patientNo = patientNo;
    this.patientName = patientName;
    this.patientSex = patientSex;
    this.patientPhone = patientPhone;
    this.patientIdcart = patientIdcart;
    this.patientAge = patientAge;
    this.patientBirthdate = patientBirthdate;
    this.patientAddress = patientAddress;
    this.patientDate = patientDate;
  }

  public Patient() {

  }

  private static final long serialVersionUID = 1L;
}
