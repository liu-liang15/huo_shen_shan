package com.example.model.servers.pharmacy;

import com.example.model.dao.pharmacy.KuCunFayaoDao;
import com.example.model.pojos.pharmacy.DiaoBoSq;
import com.example.model.pojos.pharmacy.YpKuCun;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class KuCunFayaoService {
    @Autowired
    KuCunFayaoDao kuCunFayaoDao;
    public List<YpKuCun> FindAllKuCun(){
        return kuCunFayaoDao.FindAllKuCun();
    }

    public void addYPDB(DiaoBoSq diaoBoSq){
        kuCunFayaoDao.addDBSQ(diaoBoSq);
        kuCunFayaoDao.addDBXD(diaoBoSq.getDbsqXiangBiaos(),diaoBoSq.getDbShengQing());
    }
}
