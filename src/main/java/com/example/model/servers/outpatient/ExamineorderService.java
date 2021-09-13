package com.example.model.servers.outpatient;

import com.example.model.dao.outpatient.AssayDao;
import com.example.model.dao.outpatient.ExamineorderDao;
import com.example.model.pojos.outpatient.Assay;
import com.example.model.pojos.outpatient.Examinedetails;
import com.example.model.pojos.outpatient.Examineorder;
import com.example.model.pojos.outpatient.Labworkdetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExamineorderService {
    @Autowired
    ExamineorderDao examineorderDao;

    public void insertExamineorder(Examineorder examineorder){
        examineorderDao.insertExamineorder(examineorder);
    }

    public void insertExaminedetails(List<Examinedetails> list, String exaordNo){
        System.out.println("检查s"+list);
        int exaordNo1 = Integer.parseInt(exaordNo);
        for(Examinedetails p : list){
            p.setExadetCount(1);
            p.setExadetExaordNo(exaordNo1);
            examineorderDao.insertExaminedetails(p);
        }
    }
}
