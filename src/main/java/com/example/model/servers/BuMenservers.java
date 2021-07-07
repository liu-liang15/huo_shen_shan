package com.example.model.servers;

import com.example.model.dao.BuMenDao;
import com.example.model.pojos.BuMen;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class BuMenservers {
            @Autowired
            BuMenDao buMenDao;
            public BuMen getbm(){
                return buMenDao.selectByPrimaryKey(null);
            }
    }
