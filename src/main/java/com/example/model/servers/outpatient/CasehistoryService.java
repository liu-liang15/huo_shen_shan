package com.example.model.servers.outpatient;

import com.example.model.dao.outpatient.CasehistoryDao;
import com.example.model.dao.outpatient.HospregDao;
import com.example.model.pojos.outpatient.Casehistory;
import com.example.model.pojos.outpatient.Hospreg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CasehistoryService {
    @Autowired
    CasehistoryDao casehistoryDao;

    public List<Casehistory> findAllCaseHistory(String param){
        return casehistoryDao.findAllCaseHistory(param);
    }

}
