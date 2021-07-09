package com.example.model.pojos.system;

import java.io.Serializable;
import lombok.Data;

/**
 * bu_men
 * @author 
 */
@Data
public class BuMen implements Serializable {
    /**
     * 部门ID
     */
    private String bmId;

    /**
     * 部门民称
     */
    private String bmName;

    /**
     * 部门主任
     */
    private YuanGo yuanGo;

    private static final long serialVersionUID = 1L;
}