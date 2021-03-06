package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.Medicalcard;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MedicalcardDao extends BaseMapper<Medicalcard> {
    //查询诊疗卡
    List<Medicalcard> findAllMedicalcard(String param);

    //根据诊疗卡卡号查询信息
    List<Medicalcard> findMedicalcardByMediCard(String mediCard);

    //新增诊疗卡
    void addMedicalcard(Medicalcard medicalcard);

    //新增诊疗卡
    void addMedicalcardno(Medicalcard medicalcard);

    void medicalcardTY(int mediNo,String mediState);

    void medicalcardBB(int mediNo,String mediCard);

    void editPwd(int mediNo,String mediPassword);

    //修改卡余额
    void updatePat(double mediBalance,Integer mediNo);

}
