package com.example.controller.outpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.pojos.outpatient.Patient;
import com.example.model.servers.outpatient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.Date;
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

    @RequestMapping("/insertPatient")
    public void insertPatient(String patient) throws Exception {
        Patient patient1 = JSONObject.parseObject(patient,Patient.class);
        String age = getAge(patient1.getPatientBirthdate());
        patient1.setPatientAge(age);
        patientService.insertPatient(patient1);
    }
    @GetMapping("/updatePatient")
    public void updatePatient(){
        Patient patient = new Patient(1,"ww","nv","qwe","wuhu","12","123",null,null);
        patientService.updatePatient(patient);
        System.out.println(1);
    }


    //根据出生日期计算年龄
    public String getAge(Timestamp birthDay) throws Exception {
        Calendar cal = Calendar.getInstance();
        if (cal.before(birthDay)) { //出生日期晚于当前时间，无法计算
            throw new IllegalArgumentException(
                    "The birthDay is before Now.It's unbelievable!");
        }
        int yearNow = cal.get(Calendar.YEAR);  //当前年份
        int monthNow = cal.get(Calendar.MONTH);  //当前月份
        int dayOfMonthNow = cal.get(Calendar.DAY_OF_MONTH); //当前日期
        cal.setTime(birthDay);
        int yearBirth = cal.get(Calendar.YEAR);
        int monthBirth = cal.get(Calendar.MONTH);
        int dayOfMonthBirth = cal.get(Calendar.DAY_OF_MONTH);
        int age = yearNow - yearBirth;   //计算整岁数
        if (monthNow <= monthBirth) {
            if (monthNow == monthBirth) {
                if (dayOfMonthNow < dayOfMonthBirth) age--;//当前日期在生日之前，年龄减一
            }else{
                age--;//当前月份在生日之前，年龄减一
            }
        }
        return age+"";
    }
}
