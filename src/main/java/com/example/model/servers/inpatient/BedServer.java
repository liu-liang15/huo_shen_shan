package com.example.model.servers.inpatient;

import com.example.model.dao.inpatient.BedDao;
import com.example.model.dao.inpatient.BedRecDao;
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
    @Autowired
    BedRecDao bedRecDao;
    //查询床位
    public List<Bed> selBed(String wardNo,String zt){
        return  bedDao.selBed(wardNo,zt);
    }
    //新增床位
    public void addBed(Bed bed){
        bedDao.addBed(bed);
    }
    //查看患者与床位
    public List<Bed> allocBed(String param){
        return bedDao.allocBed(param);
    }
    //修改床位
    public void updateBed(Bed bed){
        bedDao.updateBed(bed);
    }
    //床位记录新增
    public void updateBed2(Bed bed){
        bedDao.updateBed(bed);
        bedRecDao.addBedRec(bed.getBedNo()+"",bed.getResNo());
    }
}