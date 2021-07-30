package com.example.model.pojos.system;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.util.Date;
import lombok.Data;

/**
 * 排班表
 * @TableName pai_ban
 */
@TableName(value ="pai_ban")
@Data
public class PaiBan implements Serializable {
    /**
     * 排班id
     */
    @TableId(type = IdType.AUTO)
    private Integer pbId;

    /**
     * 员工编号
     */
    private String ygId;

    /**
     * 班次
     */
    private String bcId;

    /**
     * 开始日期
     */
    private Date ksRq;

    /**
     * 结束日期
     */
    private Date jsRq;

}