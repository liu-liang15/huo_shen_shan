package com.example.model.pojos.outpatient;

import java.io.Serializable;
import lombok.Data;

@Data
public class Medicalcard implements Serializable {

  private Integer mediNo;
  private String mediCard;
  private String mediPassword;
  private Integer mediBalance;
  private String mediIdcart;
  private String mediPatientNo;
  private java.sql.Timestamp mediNewdate;
  private String mediState;

  private static final long serialVersionUID = 1L;
}
