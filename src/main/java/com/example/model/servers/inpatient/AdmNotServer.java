package com.example.model.servers.inpatient;

import com.example.model.dao.inpatient.AdmNotDao;
import com.example.model.pojos.inpatient.AdmNot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class AdmNotServer {
    @Autowired
    AdmNotDao admNotDao;
    public List<AdmNot> allAdm(String params){
        return admNotDao.selAdm(params);
    }
}
