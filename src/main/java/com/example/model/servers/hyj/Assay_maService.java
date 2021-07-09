package com.example.model.servers.hyj;

import com.example.model.dao.hyj.Assay_maMapper;
import com.example.model.pojos.hyj.Assay_person;
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
    /*//分页查询
    public Map<String,Object> findAll(Integer pageNo, Integer size){
        Map<String,Object> map = new HashMap<>();
        //分页查询
        Page<Object> page = PageHelper.startPage(pageNo, size);
        map.put("rows",assayMaMapper.findPerson());
        map.put("total",page.getTotal());
        return map;
    }*/
    public List<Assay_person> findAll(){
        return assayMaMapper.findPerson();
    }
    //新增
    public void addPerson(Assay_person assayPerson){
        assayMaMapper.addPerson(assayPerson);
    }
    //删除
    public void delPerson(Assay_person assayPerson){
        assayMaMapper.delPerson(assayPerson);
    }
    /*public Map<String,Object> likeFindPerson(Integer pageNo, Integer size,String assayPersonName){
        Map<String,Object> map = new HashMap<>();
        //分页查询
        Page<Object> page = PageHelper.startPage(pageNo, size);
        map.put("rows",assayMaMapper.likeFindPerson(assayPersonName));
        map.put("total",page.getTotal());
        return map;
    }*/
    public List<Assay_person> likeFindPerson(Assay_person assayPerson){
        return assayMaMapper.likeFindPerson(assayPerson);
    }
}
