package com.example.controller.outpatient;

import com.example.model.pojos.Patient;
import com.example.model.servers.outpatient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class PatientController {
    @Autowired
    PatientService patientService;

    @GetMapping("/findAllPatient")
    public List<Patient> findAll(String param){
        System.out.println(param);
        return patientService.findAll(param);
    }

    @GetMapping("/insertPatient")
    public void insertPatient(){
        Patient patient = new Patient(0,"ww","nv","qwe","wuhu","12","123",null,null);
        patientService.insertPatient(patient);
        System.out.println(1);
    }
    @GetMapping("/updatePatient")
    public void updatePatient(){
        Patient patient = new Patient(1,"ww","nv","qwe","wuhu","12","123",null,null);
        patientService.updatePatient(patient);
        System.out.println(1);
    }

}
