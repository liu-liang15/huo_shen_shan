package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.ExpCalDao;
import com.example.model.dao.inpatient.HosAloneDao;
import com.example.model.dao.inpatient.ResMealDao;
import com.example.model.dao.outpatient.MedicalcardDao;
import com.example.model.pojos.hyj.AssayMeal;
import com.example.model.pojos.inpatient.DocAdv;
import com.example.model.pojos.inpatient.ExpCal;
import com.example.model.pojos.inpatient.HosAlone;
import com.example.model.pojos.inpatient.ResMeal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ResMealServer {
    @Autowired
    ResMealDao resMealDao;
    @Autowired
    ExpCalDao expCalDao;
    @Autowired
    HosAloneDao hosAloneDao;
    @Autowired
    MedicalcardDao medicalcardDao;
    double num=0;
    //新增检验
    public void addResMeal(DocAdv docAdv, List<AssayMeal> assayMeals){
        for(AssayMeal a:assayMeals){
            ResMeal resMeal=new ResMeal(docAdv.getResNo(),a.getAssayMealId()+"",docAdv.getDocPer());
            num+=a.getAssayMealPrice();
            ExpCal e=new ExpCal(docAdv.getResNo(),a.getAssayMealName(),a.getAssayMealPrice());
            expCalDao.addExpCal(e);
            resMealDao.addResMeal(resMeal);
        }
        //扣除诊疗卡余额
        List<HosAlone>list=hosAloneDao.allHos(docAdv.getResNo());
        medicalcardDao.updatePat(-num,list.get(0).getAdmNot().getMedicalcard().getMediNo());
    }
}
