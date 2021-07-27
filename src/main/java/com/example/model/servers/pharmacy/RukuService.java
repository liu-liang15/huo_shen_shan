package com.example.model.servers.pharmacy;

import com.example.model.dao.pharmacy.RuKuDao;
import com.example.model.pojos.pharmacy.RkXiangDan;
import com.example.model.pojos.pharmacy.RuKu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class RukuService {
    @Autowired
    RuKuDao ruKuDao;
    public void addRKD(RuKu ruKu){
        ruKuDao.addRKD(ruKu);
        ruKuDao.addRKXD(ruKu.getRkXiangDans(),ruKu.getRhDh());
        ruKuDao.updateOrder(ruKu.getPurchaseSjfk(),new Date(),ruKu.getRhd());
        Collection<RkXiangDan> kucun=ruKuDao.FindByIdRuku(ruKu.getRhDh());
        ruKuDao.addKC(kucun);
    }
}
