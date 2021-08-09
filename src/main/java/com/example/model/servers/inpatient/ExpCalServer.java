package com.example.model.servers.inpatient;

import com.example.model.dao.inpatient.ExpCalDao;
import com.example.model.pojos.inpatient.ExpCal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ExpCalServer {
    @Autowired
    ExpCalDao expCalDao;
    //查看患者消费
    public List<ExpCal> selExpCal(String param){
        return expCalDao.selExpCal(param);
    }
}
