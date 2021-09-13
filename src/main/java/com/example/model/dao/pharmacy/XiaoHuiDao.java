package com.example.model.dao.pharmacy;

import com.example.model.pojos.pharmacy.ChuKu;
import com.example.model.pojos.pharmacy.ChuKuJiLu;
import com.example.model.pojos.pharmacy.XiaoHuiSq;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.Collection;
import java.util.List;

@Mapper
public interface XiaoHuiDao {
    List<XiaoHuiSq> findAllXHD(int  sq);
    void editXiaoHui(@Param("zt")int zt,@Param("xhsqId")String xhsqId);
    void deltetKucun(Integer rkpcId);
    void addCK(ChuKu chuKu);
    void addXHCKXQ(Collection<ChuKuJiLu> chuKuJiLus, String chukuId);
}
