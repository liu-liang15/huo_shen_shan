package com.example.model.servers.inpatient;

import com.example.model.dao.inpatient.WardDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class WardServer {
    @Autowired
    WardDao wardDao;
    //新增病房
    public void addWard(){
         wardDao.addWard();
    }
}
