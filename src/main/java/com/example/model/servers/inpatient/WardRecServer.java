package com.example.model.servers.inpatient;

import com.example.model.dao.inpatient.WardRecDao;
import com.example.model.pojos.inpatient.WardRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WardRecServer {
    @Autowired
    WardRecDao wardRecDao;
    //查询病房修改日志
    public List<WardRec> selWardRec(){
        return wardRecDao.selWardRec();
    }
}
