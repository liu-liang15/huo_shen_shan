package com.example.model.servers;

import com.example.model.dao.BuMenDao;
import com.example.model.pojos.BuMen;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional
public class BuMenservers {
            @Resource
            BuMenDao buMenDao;
            public List<BuMen> getbm(){
                return buMenDao.selectByAll();
            }
    }
