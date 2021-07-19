package com.example.model.pojos.hyj;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
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
    @TableField(fill = FieldFill.INSERT)//新增时，自动注入当前系统时间
    private Timestamp assayPersonTime;
    private Timestamp assayPersonTime2;


}
