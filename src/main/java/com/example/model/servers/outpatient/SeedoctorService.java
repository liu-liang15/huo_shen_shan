package com.example.model.servers.outpatient;

import com.example.model.dao.outpatient.CasehistoryDetailsDao;
import com.example.model.dao.outpatient.SeedoctorDao;
import com.example.model.pojos.outpatient.Casehistorydetails;
import com.example.model.pojos.outpatient.Seedoctor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class SeedoctorService {
    @Autowired
    SeedoctorDao seedoctorDao;

    public List<Seedoctor> findseedoctor(int param){
        return seedoctorDao.findseedoctor(param);
    }

}
