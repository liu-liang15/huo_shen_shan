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
    private Integer assayPersonId;
    private String assayPersonName;
    private String assayPersonSex;
    private int assayPersonAge;
    private String assayPersonPhone;
    @TableField(fill = FieldFill.INSERT)
    private Timestamp assayPersonTime;
    private Timestamp assayPersonTime2;


}
