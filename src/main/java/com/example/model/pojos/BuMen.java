package com.example.model.pojos;

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
    private Integer bmId;

    /**
     * 部门民称
     */
    private String bmName;

    /**
     * 部门主任
     */
    private String bmFzr;

    private static final long serialVersionUID = 1L;
}