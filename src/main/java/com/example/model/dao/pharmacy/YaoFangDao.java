package com.example.model.dao.pharmacy;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface YaoFangDao {
    void addDrugNumber(@Param("drugId")int drugId,@Param("drugNumber")int drugNumber);
}
