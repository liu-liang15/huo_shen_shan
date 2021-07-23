package com.example.model.pojos.hyj;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AssayPerson {
    @TableId(type = IdType.AUTO)
    private Integer assayPersonId;//id
    private String assayPersonName;//姓名
    private String assayPersonSex;//性别
    private int assayPersonAge;//年龄
    private String assayPersonCard;//身份证
    private String assayPersonPhone;//手机号
    @JsonFormat(pattern="yyyy-MM-dd",timezone="GMT+8")
    private Timestamp assayPersonTime;
    private Timestamp assayPersonTime2;
    private String assayMealName;//体检套餐


}
