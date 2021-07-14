package com.example.model.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayPro {
    @TableId(type = IdType.AUTO)
    private Integer assayProId;
    private String assayProName;
    private String assayProRef;
    private String assayProUnit;
    private double assayProPrice;
    private String assayProType;
}
