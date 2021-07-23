package com.example.model.servers.outpatient;

import com.example.model.dao.outpatient.HospregcateDao;
import com.example.model.pojos.outpatient.Hospregcate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HospregcateService {
    @Autowired
    HospregcateDao hospregcateDao;

    public List<Hospregcate> findAllHopregcate(){
        return hospregcateDao.findAllHopregcate();
    }
}
