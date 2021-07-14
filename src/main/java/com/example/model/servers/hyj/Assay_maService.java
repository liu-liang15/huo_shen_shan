package com.example.model.servers.hyj;

import com.example.model.dao.hyj.Assay_maMapper;
import com.example.model.pojos.hyj.AssayPerson;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class Assay_maService {
    @Resource
    Assay_maMapper assayMaMapper;

    public List<AssayPerson> findAll(){
        return assayMaMapper.findPerson();
    }
    //新增
    public void insert(AssayPerson assayPerson){

        assayMaMapper.insert(assayPerson);
    }
    //删除
    public void delPerson(AssayPerson assayPerson){
        assayMaMapper.delPerson(assayPerson);
    }
    //模糊查询
    public List<AssayPerson> likeFindPerson(AssayPerson assayPerson){
        return assayMaMapper.likeFindPerson(assayPerson);
    }
    //时间选择器
    public List<AssayPerson> timeChoose(AssayPerson assayPerson){
        return assayMaMapper.timeChoose(assayPerson);
    }
}
