package com.example.model.pojos.hyj;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayMeal {
    @TableId(type = IdType.AUTO)
    private int assayMealId;
    @TableField(exist = false)
    private int assayProId;
    private String assayMealName;
    private double assayMealPrice;
    private String assayTypeType;
    private String ksName;
    @TableField(exist = false)
    private List<AssayPro> assayPros;
}
