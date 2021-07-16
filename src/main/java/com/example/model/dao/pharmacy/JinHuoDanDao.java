package com.example.model.dao.pharmacy;

import com.example.model.pojos.pharmacy.CaiGoJh;
import com.example.model.pojos.pharmacy.JhXiangDan;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;

@Mapper
public interface JinHuoDanDao {
    void addJHD(CaiGoJh caiGoJh);
    void addJHXD(Collection<JhXiangDan> jhXiangDan);
}
