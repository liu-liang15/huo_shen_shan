package com.example.model.servers.outpatient;

import com.example.model.dao.outpatient.PatientDao;
import com.example.model.pojos.outpatient.Patient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class PatientService {
    @Autowired
    PatientDao patientDao;

    public List<Patient> findAll(String param){
        System.out.println(321);
        return patientDao.findAllPatient(param);
    }

    public void savePatient(Patient patient){
        if("0".equals(patient.getPatientNo()) || patient.getPatientNo() == null){
            patientDao.insertPatient(patient);
        }else{
            patientDao.updatePatient(patient);
        }
    }
}
