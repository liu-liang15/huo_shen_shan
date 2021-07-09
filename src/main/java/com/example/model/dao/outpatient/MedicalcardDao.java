package com.example.model.dao.outpatient;

import com.example.model.pojos.outpatient.Medicalcard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalcardDao {
    List<Medicalcard> findAllMedicalcard(String param);
}
