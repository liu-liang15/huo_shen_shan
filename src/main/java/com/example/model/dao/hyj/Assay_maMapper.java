package com.example.model.dao.hyj;

import com.example.model.pojos.hyj.Assay_ma;
import com.example.model.pojos.hyj.Assay_person;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Assay_maMapper {
    @Select("select * from assay_ma am LEFT JOIN assay_person ap on am.assay_person_id = ap.assay_person_id")
    public List<Assay_ma> findPerson();
    @Insert("insert into assay_person(assay_person_name,assay_person_sex,assay_person_age,assay_person_phone) " +
            "VALUES(#{assayPersonName},#{assayPersonSex},#{assayPersonAge},#{assayPersonPhone})")
    public void addPerson(Assay_person assayPerson);
}
