package com.example.model.servers.pharmacy;

import com.example.model.dao.pharmacy.JinHuoDanDao;
import com.example.model.pojos.pharmacy.CaiGoJh;
import com.example.model.pojos.pharmacy.JhXiangDan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;

@Service
@Transactional
public class JinHuoDanService {
    @Autowired
    JinHuoDanDao jinHuoDanDao;

    public void addJHD(CaiGoJh caiGoJh){
        System.out.println("zzzz");
        jinHuoDanDao.addJHD(caiGoJh);
        Collection<JhXiangDan> details=caiGoJh.getJhXiangDans();
        System.out.println("集合:"+details);
        jinHuoDanDao.addJHXD(details,caiGoJh.getPlanId());
    };
}
