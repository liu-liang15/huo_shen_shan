package com.example.model.servers.outpatient;

import com.example.model.dao.outpatient.AssayDao;
import com.example.model.dao.outpatient.MzshoushucfDao;
import com.example.model.pojos.outpatient.Assay;
import com.example.model.pojos.outpatient.Labworkdetails;
import com.example.model.pojos.outpatient.Mzshoushucf;
import com.example.model.pojos.outpatient.Mzshoushuxq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MzshoushucfService {
    @Autowired
    MzshoushucfDao mzshoushucfDao;

    public void insertMzshoushucf(Mzshoushucf mzshoushucf){
        mzshoushucfDao.insertMzshoushucf(mzshoushucf);
    }

    public void insertMzshoushuxq(List<Mzshoushuxq> list, String sqSsNo){
        int ssNo = Integer.parseInt(sqSsNo);
        for(Mzshoushuxq p : list){
            p.setSqCount(1);
            p.setSqSsNo(ssNo);
            mzshoushucfDao.insertMzshoushuxq(p);
        }
    }
}
