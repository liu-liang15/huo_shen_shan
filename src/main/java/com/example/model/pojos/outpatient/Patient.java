package com.example.model.pojos.outpatient;

import java.io.Serializable;
import java.sql.Timestamp;

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
  private Timestamp patientBirthdate;
  private String patientAddress;
  private Timestamp patientDate;

  public Patient(Integer patientNo, String patientName, String patientSex, String patientPhone, String patientIdcart, String patientAge, String patientAddress, Timestamp patientBirthdate, Timestamp patientDate) {
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
