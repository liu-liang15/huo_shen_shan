package com.example.model.servers.inpatient;

import com.example.model.dao.inpatient.DocAdvXqDao;
import com.example.model.pojos.inpatient.DocAdvXq;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DocAdvXqServer {
    @Autowired
    DocAdvXqDao docAdvXqDao;
    //查看医嘱详单
    public List<DocAdvXq> selDocAdvXq(String param){
        return  docAdvXqDao.selDocAdvXq(param);
    }
}
