package com.example.model.dao.hyj;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.hyj.Assay_person;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Assay_maMapper extends BaseMapper<Assay_person> {
    @Select("select * from assay_person")
    public List<Assay_person> findPerson();/*
    @Insert("insert into assay_person(assay_person_name,assay_person_sex,assay_person_age,assay_person_phone) " +
            "VALUES(#{assayPersonName},#{assayPersonSex},#{assayPersonAge},#{assayPersonPhone})")
    public void addPerson(Assay_person assayPerson);*/
    @Delete("delete from assay_person where assay_person_id = #{assayPersonId}")
    public void delPerson(Assay_person assayPerson);
    @Select("select * from assay_person where assay_person_name like '%${assayPersonName}%'")
    public List<Assay_person> likeFindPerson(Assay_person assayPerson);
    //时间选择器
    @Select("select * from assay_person where date_format(assay_person_time,'%Y-%m-%d') BETWEEN #{assayPersonTime} and #{assayPersonTime2}")
    public List<Assay_person> timeChoose(Assay_person assayPerson);

}
