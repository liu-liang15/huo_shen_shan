package com.example.model.servers.system;


import com.example.model.dao.system.YuanGoDao;
import com.example.model.pojos.system.YuanGo;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class YuanGoservers {
    @Resource
    YuanGoDao yuanGoDao;

    public List<YuanGo> getYuanGo(){
        return yuanGoDao.selectByAll();
    }

}
