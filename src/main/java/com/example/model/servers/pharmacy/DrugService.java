package com.example.model.servers.pharmacy;

import com.example.model.dao.pharmacy.DrugDao;
import com.example.model.pojos.pharmacy.YaoPingGg;
import com.example.model.pojos.pharmacy.YaoPingLb;
import com.example.model.pojos.pharmacy.YaoPingLx;
import com.example.model.pojos.pharmacy.YaoPingXx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrugService {
    @Autowired
    DrugDao drugDao;

  public   List<YaoPingGg> findAllSpec(){
        return drugDao.findAllSpec();
  };
   public  List<YaoPingLb> findAllSort(){
    return drugDao.findAllSort();
   };
   public List<YaoPingLx> findAllType(){
return drugDao.findAllType();
   };
  public  List<YaoPingXx> findAllDrug(YaoPingXx yaoPingXx){
    return drugDao.findAllDrug(yaoPingXx);
  };
}
