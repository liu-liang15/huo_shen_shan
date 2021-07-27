package com.example.model.dao.hyj;

import com.example.model.pojos.hyj.AssayPerson;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface AssayResMapper {
    public List<AssayPerson> findRes(AssayPerson assayPerson);
}
