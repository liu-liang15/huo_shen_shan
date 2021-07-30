package com.example.model.pojos.system;


import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 班次表
 * @TableName ban_ci
 */
@TableName(value ="ban_ci")
@Data
public class BanCi implements Serializable {
    /**
     * 班次
     */
    private Integer bc;

    /**
     * 开始时间
     */
    private Date bcKs;

    /**
     * 结束时间
     */
    private Date bcJs;

    /**
     * 班次类型
     */
    private String bcTypeId;

}