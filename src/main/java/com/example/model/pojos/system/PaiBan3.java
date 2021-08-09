package com.example.model.pojos.system;

import lombok.Data;

import java.io.Serializable;

/**
 * @author 刘亮
 * @date 2021年 08月09日2:26
 */
@Data
public class PaiBan3 implements Serializable {
        private String rq;
        private String bc;
        private String[] yuanGoIds;
}
