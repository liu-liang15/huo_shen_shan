package com.example.model.servers.hyj;

import com.example.model.dao.hyj.Assay_maMapper;
import com.example.model.pojos.hyj.Assay_person;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class Assay_maService {
    @Resource
    Assay_maMapper assayMaMapper;

    public List<Assay_person> findAll(){
        return assayMaMapper.findPerson();
    }
    //新增
    public void insert(Assay_person assayPerson){
        assayPerson.setAssayPersonTime(new Timestamp(System.currentTimeMillis()));
        assayMaMapper.insert(assayPerson);
    }
    //删除
    public void delPerson(Assay_person assayPerson){
        assayMaMapper.delPerson(assayPerson);
    }
    //模糊查询
    public List<Assay_person> likeFindPerson(Assay_person assayPerson){
        return assayMaMapper.likeFindPerson(assayPerson);
    }
    //时间选择器
    public List<Assay_person> timeChoose(Assay_person assayPerson){
        return assayMaMapper.timeChoose(assayPerson);
    }
}
