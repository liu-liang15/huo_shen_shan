package com.example.model.dao.pharmacy;

import com.example.model.pojos.pharmacy.DbsqXiangBiao;
import com.example.model.pojos.pharmacy.DiaoBoSq;
import com.example.model.pojos.pharmacy.YpKuCun;
import org.apache.ibatis.annotations.Mapper;

import java.util.Collection;
import java.util.List;

@Mapper
public interface KuCunFayaoDao {
List<YpKuCun> FindAllKuCun();
void addDBSQ(DiaoBoSq diaoBoSq);
void addDBXD(Collection<DbsqXiangBiao> dbsqXiangBiaos,String dbShengQing);
}
