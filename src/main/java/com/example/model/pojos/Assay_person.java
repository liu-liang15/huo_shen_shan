package com.example.model.pojos;

public class Assay_person {
    private int assayPersonId;
    private String assayPersonName;
    private String assayPersonSex;
    private int assayPersonAge;
    private String assayPersonPhone;

    @Override
    public String toString() {
        return "Assay_person{" +
                "assayPersonId=" + assayPersonId +
                ", assayPersonName='" + assayPersonName + '\'' +
                ", assayPersonSex='" + assayPersonSex + '\'' +
                ", assayPersonAge=" + assayPersonAge +
                ", assayPersonPhone='" + assayPersonPhone + '\'' +
                '}';
    }

    public int getAssayPersonId() {
        return assayPersonId;
    }

    public void setAssayPersonId(int assayPersonId) {
        this.assayPersonId = assayPersonId;
    }

    public String getAssayPersonName() {
        return assayPersonName;
    }

    public void setAssayPersonName(String assayPersonName) {
        this.assayPersonName = assayPersonName;
    }

    public String getAssayPersonSex() {
        return assayPersonSex;
    }

    public void setAssayPersonSex(String assayPersonSex) {
        this.assayPersonSex = assayPersonSex;
    }

    public int getAssayPersonAge() {
        return assayPersonAge;
    }

    public void setAssayPersonAge(int assayPersonAge) {
        this.assayPersonAge = assayPersonAge;
    }

    public String getAssayPersonPhone() {
        return assayPersonPhone;
    }

    public void setAssayPersonPhone(String assayPersonPhone) {
        this.assayPersonPhone = assayPersonPhone;
    }

    public Assay_person() {
    }

    public Assay_person(int assayPersonId, String assayPersonName, String assayPersonSex, int assayPersonAge, String assayPersonPhone) {
        this.assayPersonId = assayPersonId;
        this.assayPersonName = assayPersonName;
        this.assayPersonSex = assayPersonSex;
        this.assayPersonAge = assayPersonAge;
        this.assayPersonPhone = assayPersonPhone;
    }
}
