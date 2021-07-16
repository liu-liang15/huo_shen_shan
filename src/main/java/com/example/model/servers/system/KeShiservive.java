package com.example.model.servers.system;

import com.example.model.dao.system.KeShiDao;
import com.example.model.pojos.system.KeShi;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
@Service
public class KeShiservive {
    @Resource
    KeShiDao keShiDao;
//查询所有科室数据
    public List<KeShi> getks(){
        return keShiDao.selectList(null);
    }


}
