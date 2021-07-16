package com.example.model.servers.outpatient;

import com.example.model.dao.outpatient.HospregDao;
import com.example.model.pojos.outpatient.Hospreg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HospregService {
    @Autowired
    HospregDao hopregDao;

    public List<Hospreg> findAllHopreg(String param){
        return hopregDao.findAllHopreg(param);
    }

    //新增挂号
    public void insertHospreg(Hospreg hospreg){
        hopregDao.insertHospreg(hospreg);
    };
}
