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
/**
 *     查询科室和负责人的数据
 */
    public List<KeShi> getall(String shou){
        return keShiDao.selectQb(shou);
    }

//  新增科室
    public int insertks(KeShi keShi) {
//        将科室里面的员工类的员工id给科室的yg_id
        if (!"null".equals(keShi.getYuanGo())){
            keShi.setYgId(keShi.getYuanGo().getYgId()+"");
        }
        return keShiDao.insert(keShi);
    }
    //  新增科室
    public int updateks(KeShi keShi) {
//        将科室里面的员工类的员工id给科室的yg_id
        if (!"null".equals(keShi.getYuanGo())){
            keShi.setYgId(keShi.getYuanGo().getYgId()+"");
        }
        return keShiDao.updateById(keShi);
    }
}
