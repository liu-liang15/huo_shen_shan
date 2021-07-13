package com.example.model.pojos.hyj;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.sql.Timestamp;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Assay_person {
    @TableId
    private Integer assayPersonId;
    private String assayPersonName;
    private String assayPersonSex;
    private int assayPersonAge;
    private String assayPersonPhone;
    private Timestamp assayPersonTime;
    private Timestamp assayPersonTime2;


}
