package com.example.model.servers.hyj;

import com.example.model.dao.hyj.AssayResMapper;
import com.example.model.pojos.hyj.AssayPerson;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssayResService {
    @Resource
    AssayResMapper assayResMapper;
    public List<AssayPerson> findRes(AssayPerson assayPerson){
        return assayResMapper.findRes(assayPerson);
    }
}
