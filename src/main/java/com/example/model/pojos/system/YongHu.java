package com.example.model.pojos.system;


import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class YongHu {
  @TableId
  private Integer yhId;
  private String yhMm;
  private String ygId;


}
