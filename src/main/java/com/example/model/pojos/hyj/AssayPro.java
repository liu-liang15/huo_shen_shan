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
public class AssayPro {
    @TableId(type = IdType.AUTO)
    private Integer assayProId;

    @TableField(exist = false)
    private int assayMealId;
    private String assayProName;//项目名
    private String assayProRef;//参考值
    private String assayProUnit;//参考值单位
    //private double assayProPrice;//价格
    //private String assayProType;//项目类型
    //private List<AssayMeal> assayMeals;
}
