package com.example.model.dao;

import com.example.model.pojos.Assay_ma;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;
//新建一个自己的包，把这个类放到自己的包里面去
@Mapper
public interface Assay_maMapper {
    @Select("select * from assay_ma am LEFT JOIN assay_person ap on am.assay_person_id = ap.assay_person_id")
    public List<Assay_ma> findPerson();
}
