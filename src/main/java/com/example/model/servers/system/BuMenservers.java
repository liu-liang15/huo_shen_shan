package com.example.model.servers.system;

import com.example.model.dao.system.BuMenDao;
import com.example.model.pojos.system.BuMen;
import org.junit.Test;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class BuMenservers {
            @Resource
            BuMenDao buMenDao;
//            查询所有部门
            public List<BuMen> getbm(){
                return buMenDao.selectByAll();
            }
//           新增部门
            public int insert(BuMen buMen){
                return buMenDao.insert(buMen);
            }



    }
