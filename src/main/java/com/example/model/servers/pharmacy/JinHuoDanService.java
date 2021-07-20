package com.example.model.servers.pharmacy;

import com.example.model.dao.pharmacy.JinHuoDanDao;
import com.example.model.pojos.pharmacy.CaiGoJh;
import com.example.model.pojos.pharmacy.JhXiangDan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

@Service
@Transactional
public class JinHuoDanService {
    @Autowired
    JinHuoDanDao jinHuoDanDao;

    public void addJHD(CaiGoJh caiGoJh){
        jinHuoDanDao.addJHD(caiGoJh);
        Collection<JhXiangDan> details=caiGoJh.getJhXiangDans();
        jinHuoDanDao.addJHXD(details,caiGoJh.getPlanId());
    };

    public List<CaiGoJh> findAllJHD(){
        return jinHuoDanDao.findAllJHD();
    }
    public List<JhXiangDan> findAllJXHD(String planId){
        return jinHuoDanDao.findAllJHXD(planId);
    }
}
