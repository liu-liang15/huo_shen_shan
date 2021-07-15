package com.example.model.servers.system;

import com.example.model.dao.system.GangWeiDao;
import com.example.model.pojos.system.GangWei;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GangWeiservers {
    @Resource
    GangWeiDao gangWeiDao;

//    获取全部岗位
    public List<GangWei> getgw(){
        return gangWeiDao.selectList(null);
    }

}
