package com.example.model.servers.system;


import com.example.model.dao.system.BanCiMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
*
*/
@Service
public class BanCiService {
    @Resource
    BanCiMapper banCiMapper;
}
