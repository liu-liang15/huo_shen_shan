package com.example.model.pojos.inpatient;


import com.example.model.pojos.outpatient.Medicalcard;
import com.example.model.pojos.outpatient.Patient;

public class AdmNot {

  private long hosNo;
  private String patient;
  private String section;
  private String doctor;
  private String result;
  private String dispose;
  private String admZt;
  private Medicalcard medicalcard;
  private Patient pat;

  public Medicalcard getMedicalcard() {
    return medicalcard;
  }

  public void setMedicalcard(Medicalcard medicalcard) {
    this.medicalcard = medicalcard;
  }

  public Patient getPat() {
    return pat;
  }

  public void setPat(Patient pat) {
    this.pat = pat;
  }

  public long getHosNo() {
    return hosNo;
  }

  public void setHosNo(long hosNo) {
    this.hosNo = hosNo;
  }


  public String getPatient() {
    return patient;
  }

  public void setPatient(String patient) {
    this.patient = patient;
  }


  public String getSection() {
    return section;
  }

  public void setSection(String section) {
    this.section = section;
  }


  public String getDoctor() {
    return doctor;
  }

  public void setDoctor(String doctor) {
    this.doctor = doctor;
  }


  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }


  public String getDispose() {
    return dispose;
  }

  public void setDispose(String dispose) {
    this.dispose = dispose;
  }


  public String getAdmZt() {
    return admZt;
  }

  public void setAdmZt(String admZt) {
    this.admZt = admZt;
  }

  public AdmNot(long hosNo, String patient, String section, String doctor, String result, String dispose, String admZt) {
    this.hosNo = hosNo;
    this.patient = patient;
    this.section = section;
    this.doctor = doctor;
    this.result = result;
    this.dispose = dispose;
    this.admZt = admZt;
  }

  public AdmNot() {
  }
}
