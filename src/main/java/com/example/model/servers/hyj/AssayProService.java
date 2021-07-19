package com.example.model.servers.hyj;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.model.dao.hyj.AssayProMapper;
import com.example.model.dao.hyj.AssayTypeMapper;
import com.example.model.pojos.hyj.AssayPro;
import com.example.model.pojos.hyj.AssayType;
import org.apache.catalina.Wrapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.text.SimpleDateFormat;
import java.util.List;

@Service
public class AssayProService {
    @Resource
    AssayProMapper assayProMapper;
    @Resource
    AssayTypeMapper assayTypeMapper;
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
    //模糊查询项目列表
    public List<AssayPro> likeData(AssayPro assayPro){
        //mybatis条件构造器
        QueryWrapper<AssayPro> wrapper = new QueryWrapper<>();
        wrapper.like("assay_pro_name",assayPro.getAssayProName());
        return assayProMapper.selectList(wrapper);
    }
    //查询套餐类型
    public List<AssayType> findType(){
        return assayTypeMapper.selectList(null);
    }
}
