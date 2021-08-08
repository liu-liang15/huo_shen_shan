package com.example.model.dao.outpatient;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.model.pojos.outpatient.*;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MzshoushucfDao extends BaseMapper<Mzshoushucf> {
    void insertMzshoushucf(Mzshoushucf mzshoushucf);

    void insertMzshoushuxq(Mzshoushuxq mzshoushuxq);
}
