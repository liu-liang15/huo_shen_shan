package com.example.model.servers.pharmacy;

import com.example.model.dao.pharmacy.YaoFangDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class YaoFangService {
    @Autowired
    YaoFangDao yaoFangDao;
    public void faYao(){

    }
}
