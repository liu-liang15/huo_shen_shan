package com.example.model.servers;

import com.example.model.dao.GoYingShangDao;
import com.example.model.pojos.GoYingShang;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoYingShangService {
@Autowired
GoYingShangDao goYingShangDao;
 public List<GoYingShang> findAll(){
     System.out.println("fafsa"+goYingShangDao.findAll());
     return goYingShangDao.findAll();
 }
 public void insert(GoYingShang goYingShang){
        goYingShangDao.insert(goYingShang);
 }
}
