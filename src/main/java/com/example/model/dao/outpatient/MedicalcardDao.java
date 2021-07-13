package com.example.model.dao.outpatient;

import com.example.model.pojos.outpatient.Medicalcard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalcardDao extends BaseMapper<Medicalcard> {
    //查询诊疗卡
    List<Medicalcard> findAllMedicalcard(String param);

    //新增诊疗卡
    void addMedicalcard(Medicalcard medicalcard);

    void medicalcardTY(int mediNo,String mediState);

    void medicalcardBB(int mediNo,String mediCard);

    void editPwd(int mediNo,String mediPassword);
}
