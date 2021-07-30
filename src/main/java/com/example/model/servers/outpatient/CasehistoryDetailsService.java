package com.example.model.servers.outpatient;

import com.example.model.dao.outpatient.CasehistoryDao;
import com.example.model.dao.outpatient.CasehistoryDetailsDao;
import com.example.model.pojos.outpatient.Casehistory;
import com.example.model.pojos.outpatient.Casehistorydetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CasehistoryDetailsService {
    @Autowired
    CasehistoryDetailsDao casehistoryDetailsDao;

    public List<Casehistorydetails> findCasehisDetails(int param){
        return casehistoryDetailsDao.findCasehisDetails(param);
    }

}
