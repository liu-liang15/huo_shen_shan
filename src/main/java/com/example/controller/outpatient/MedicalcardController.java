package com.example.controller.outpatient;

import com.alibaba.fastjson.JSONObject;
import com.example.model.pojos.outpatient.Medicalcard;
import com.example.model.pojos.outpatient.Patient;
import com.example.model.services.outpatient.MedicalcardService;
import com.example.model.services.outpatient.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/outpatient")
public class MedicalcardController {
    @Autowired
    PatientService patientService;
    @Autowired
    MedicalcardService medicalcardService;

    @GetMapping("/findAllMedicalcard")
    public List<Medicalcard> findAllMedicalcard(String param){
         return medicalcardService.findAllMedicalcard(param);
    }

    @RequestMapping("/editPwd")
    public void editPwd(String mediNo,String mediPassword){
        int i = Integer.parseInt(mediNo);
        medicalcardService.editPwd(i,mediPassword);
    }

    @RequestMapping("/medicalcardBB")
    public String medicalcardBB(String mediNo){
        int i = Integer.parseInt(mediNo);
        String date = getDateNo();
        medicalcardService.medicalcardBB(i,date);
        return date;
    }

    @RequestMapping("/medicalcardTY")
    public void medicalcardTY(String mediNo,String mediState){
        int i = Integer.parseInt(mediNo);
        if("1".equals(mediState)){
            mediState = "2";
        }else{
            mediState = "1";
        }
        medicalcardService.medicalcardTY(i,mediState);
    }

    //新增诊疗卡
    @RequestMapping("/addMedicalcard")
    public String insertMedicalcard(String pwd,String idCart,String mediPatientNo){
        if(pwd == null){
            pwd = "666666";
        }
        String str = getDateNo();
        Medicalcard medicalcard = new Medicalcard(0,str,pwd,0,idCart,mediPatientNo,null,null,null);
        medicalcardService.addMedicalcard(medicalcard);
        return str;
    }

    //新增诊疗卡
    @RequestMapping("/addMedicalcardno")
    public int insertMedicalcardno(String pwd,String idCart,String mediPatientNo){
        if(pwd == null){
            pwd = "666666";
        }
        String str = getDateNo();
        Medicalcard medicalcard = new Medicalcard(0,str,pwd,0,idCart,mediPatientNo,null,null,null);
        medicalcardService.addMedicalcardno(medicalcard);
        return medicalcard.getMediNo();
    }


    //新增病人信息
    @RequestMapping("/meAddPatient")
    public int insertPatient(String patient) throws Exception {
        Patient patient1 = JSONObject.parseObject(patient,Patient.class);
        String age = getAge(patient1.getPatientBirthdate());
        patient1.setPatientAge(age);
        patient1.setPatientDate(new Date());
        patientService.savePatient(patient1);
        System.out.println(patient1.getPatientNo());
        return patient1.getPatientNo();
    }
    //修改病人信息

    @RequestMapping("/meEditPatient")
    public void editPatient(String patient) throws Exception {
        Patient patient1 = JSONObject.parseObject(patient,Patient.class);
        String age = getAge(patient1.getPatientBirthdate());
        patient1.setPatientAge(age);
        patient1.setPatientDate(new Date());
        patientService.savePatient(patient1);
    }


    //年月日时分秒
    public String getDateNo(){
        Date d = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String dateNowStr = sdf.format(d);
        return dateNowStr;
    }

    //根据出生日期计算年龄
    public String getAge(Date birthDay) throws Exception {
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
