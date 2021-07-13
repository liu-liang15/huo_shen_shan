package com.example.model.servers.pharmacy;


import com.example.model.dao.pharmacy.GoYingShangDao;
import com.example.model.pojos.pharmacy.GoYingShang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class GoYingShangService {
@Autowired
GoYingShangDao goYingShangDao;
//查询所有供应商
 public List<GoYingShang> findAll(){
     return goYingShangDao.findAll();
 }
 //新增供应商
 public void insert(GoYingShang goYingShang){
        goYingShangDao.insert2(goYingShang);
 }
 //修改供应商信息
    public void update(GoYingShang goYingShang){
        goYingShangDao.update(goYingShang);
    }
}
