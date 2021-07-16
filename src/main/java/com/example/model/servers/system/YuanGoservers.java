package com.example.model.servers.system;


import com.example.model.dao.system.YuanGoDao;
import com.example.model.pojos.system.YuanGo;
import org.junit.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class YuanGoservers {
    @Resource
    YuanGoDao yuanGoDao;
//查询员工部分资料
    public List<YuanGo> getYuanGo(){
        return yuanGoDao.selectByAll02();
    }
//查询员工所有资料
    public List<YuanGo> getYuanGoAll(){
        return yuanGoDao.selectByAll01();
    }

//新增员工
    public int insertyg(YuanGo yuanGo) {
        return yuanGoDao.insert(yuanGo);
    }

    public int updateyg(YuanGo yuanGo) {
        return yuanGoDao.updateById(yuanGo);
    }
}
