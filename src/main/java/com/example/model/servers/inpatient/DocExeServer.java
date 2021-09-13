package com.example.model.servers.inpatient;

import com.example.model.dao.inpatient.DocAdvXqDao;
import com.example.model.dao.inpatient.DocExeDao;
import com.example.model.dao.inpatient.ExpCalDao;
import com.example.model.dao.inpatient.HosAloneDao;
import com.example.model.dao.outpatient.MedicalcardDao;
import com.example.model.pojos.inpatient.DocAdvXq;
import com.example.model.pojos.inpatient.DocExe;
import com.example.model.pojos.inpatient.ExpCal;
import com.example.model.pojos.inpatient.HosAlone;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DocExeServer {
    @Autowired
    DocExeDao docExeDao;
    @Autowired
    DocAdvXqDao docAdvXqDao;
    @Autowired
    ExpCalDao expCalDao;
    @Autowired
    HosAloneDao hosAloneDao;
    @Autowired
    MedicalcardDao medicalcardDao;
    double num=0;
    //新增今日医嘱并查看
    public List<DocExe> selDocExe(String param){
        //获得长期医嘱详情
        List<DocAdvXq> docAdvXqs=docAdvXqDao.serDocAdvXq(param);
        for(DocAdvXq d:docAdvXqs){
            List<DocExe>docExes=docExeDao.nowDocExe(d.getDocAdvId()+"");

            //没找到今天的医嘱则新增
            if(docExes.isEmpty()){
                for(int i=0;i<d.getDocFre();i++){
                    docExeDao.addDocExe(d.getDocAdvId()+"");
                }
            }
        }
        return docExeDao.selDocExe(param,0);
    }
    //查看临时医嘱
    public List<DocExe> selDocExe2(String param){
        return docExeDao.selDocExe(param,1);
    }
    //确认医嘱执行
    public void upDateDocExe(List<DocExe> docExes,String resNo){
        for (DocExe d:docExes){
            docExeDao.upDateDocExe(d);
            ExpCal e=new ExpCal(resNo,d.getYaoPingXx().getDrugName()+"*"+d.getDocAdvXq().getDrugNumber(),d.getDocAdvXq().getDrugNumber()*d.getYaoPingXx().getDrugShoujia());
            num+=d.getDocAdvXq().getDrugNumber()*d.getYaoPingXx().getDrugShoujia();
            expCalDao.addExpCal(e);
        }
        //扣除诊疗卡余额
        List<HosAlone>list=hosAloneDao.allHos(resNo);
        medicalcardDao.updatePat(-num,list.get(0).getAdmNot().getMedicalcard().getMediNo());
    }
}
