package com.example.model.servers;

import com.example.model.dao.Assay_maMapper;
import com.example.model.pojos.Assay_ma;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class Assay_maService {
    @Autowired
    Assay_maMapper assayMaMapper;
    public List<Assay_ma> findPerson(){
        return assayMaMapper.findPerson();
    };
    public Map<String,Object> findAll(Integer pageNo, Integer size){
        Map<String,Object> map = new HashMap<>();
        //分页查询
        Page<Object> page = PageHelper.startPage(pageNo, size);
        map.put("rows",assayMaMapper.findPerson());
        map.put("total",page.getTotal());
        return map;
    }
}
