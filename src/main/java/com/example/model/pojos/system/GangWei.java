package com.example.model.pojos.system;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

@Data
public class GangWei {

  @TableId
  private Integer gwId;
  private String gwName;
  private String parentId;



}
