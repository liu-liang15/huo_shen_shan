package com.example.model.servers.inpatient;

import com.example.model.dao.inpatient.BedDao;
import com.example.model.pojos.inpatient.Bed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Service
@Transactional
public class BedServer {
    @Autowired
    BedDao bedDao;
    //查询床位
    public List<Bed> selBed(String wardNo){
        return  bedDao.selBed(wardNo);
    }
    //新增床位
    public void addBed(Bed bed){
        bedDao.addBed(bed);
    }
}
