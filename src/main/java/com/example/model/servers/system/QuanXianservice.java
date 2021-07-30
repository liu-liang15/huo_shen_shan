package com.example.model.servers.system;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.model.dao.system.QuanXianDao;
import com.example.model.pojos.system.QuanXian;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author 刘亮
 * @date 2021年 07月22日16:54
 */
@Service
public class QuanXianservice {
    @Resource
    QuanXianDao quanXianDao;

    /**
     * 查询权限
     * @return
     */
    public List<QuanXian> getqx(){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.isNull("parent_id");
        List<QuanXian> list = quanXianDao.selectList(queryWrapper);
        for (QuanXian quanXian : list) {
            quanXian.setQuanXianList(getqx2(quanXian.getQxId()+""));
        }
        return list;
    }

    public List<QuanXian> getqx2(String param){
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("parent_id",param);
        List<QuanXian> list = quanXianDao.selectList(queryWrapper);
        for (QuanXian quanXian : list) {
            quanXian.setQuanXianList(getqx2(quanXian.getQxId()+""));
        }
        return list;
    }

}
