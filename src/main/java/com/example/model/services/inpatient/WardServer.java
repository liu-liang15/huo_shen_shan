package com.example.model.services.inpatient;

import com.example.model.dao.inpatient.WardDao;
import com.example.model.dao.inpatient.WardRecDao;
import com.example.model.pojos.inpatient.Ward;
import com.example.model.pojos.inpatient.WardRec;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class WardServer {
    @Autowired
    WardDao wardDao;
    @Autowired
    WardRecDao wardRecDao;
    //新增病房
    public void addWard(Ward ward){
         wardDao.addWard(ward);
    }
    //查看病房
    public List<Ward> selWard(String param){
        return wardDao.selWard(param);
    }
    //修改病房
    public void updateWard(Ward ward, WardRec wardRec){
        wardDao.updateWard(ward);
        wardRecDao.addWardRec(wardRec);
    }
}
