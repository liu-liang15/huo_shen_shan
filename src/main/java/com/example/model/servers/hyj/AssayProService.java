package com.example.model.servers.hyj;

import com.example.model.dao.hyj.AssayProMapper;
import com.example.model.pojos.hyj.AssayPro;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AssayProService {
    @Resource
    AssayProMapper assayProMapper;
    //查询所有
    public List<AssayPro> findAll(){
        return assayProMapper.selectList(null);
    }
    //删除
    public void del(AssayPro assayPro){
        assayProMapper.deleteById(assayPro.getAssayProId());
    }
    //修改
    public void update(AssayPro assayPro){
        assayProMapper.updateById(assayPro);
    }
    //根据id查询
    public AssayPro findById(AssayPro assayPro){
        return assayProMapper.selectById(assayPro.getAssayProId());
    }
    //新增
    public void insert(AssayPro assayPro){
        assayProMapper.insert(assayPro);
    }
}
