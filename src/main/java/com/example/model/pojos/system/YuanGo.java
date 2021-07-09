package com.example.model.pojos.system;

import java.io.Serializable;
import lombok.Data;

/**
 * yuan_go
 * @author 
 */
@Data
public class YuanGo implements Serializable {
    /**
     * 员工ID
     */
    private Integer ygId;

    /**
     * 员工名称
     */
    private String ygName;

    /**
     * 员工电话
     */
    private String ygDh;

    /**
     * 员工身份证
     */
    private String ygSfz;

    /**
     * 员工科室
     */
    private String ksId;

    /**
     * 员工部门
     */
    private String bmId;

    /**
     * 员工角色
     */
    private String gwId;

    private static final long serialVersionUID = 1L;
}