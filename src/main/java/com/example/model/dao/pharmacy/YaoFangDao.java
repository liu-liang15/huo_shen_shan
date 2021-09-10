package com.example.model.dao.pharmacy;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface YaoFangDao {
    void updateDrugNumber(@Param("drugId")int drugId,@Param("drugNumber")int drugNumber);
}
