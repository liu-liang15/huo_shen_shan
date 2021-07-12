package com.example.controller.system;

import com.example.model.pojos.system.BuMen;
import com.example.model.pojos.system.YuanGo;
import com.example.model.servers.system.BuMenservers;
import com.example.model.servers.system.YuanGoservers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MyController {
//    部门
    @Autowired
    BuMenservers buMenservers;
//     员工
    @Autowired
    YuanGoservers yuanGoservers;
//      获取部门数据
    @GetMapping("/getbumen/{shou}")
    public List<BuMen> getbm(@PathVariable("shou") String shou){
        System.err.println(shou);
        return buMenservers.getbm(shou);
    }
//         获取员工数据
    @PostMapping("getyg")
    public List<YuanGo> getYg(){
        return yuanGoservers.getYuanGo();
    }
//      新增部门
    @PostMapping("insertBm")
    public int insertyg(@RequestBody BuMen buMen){
//        System.err.println(buMen);
        return buMenservers.insert(buMen);
    }
//      修改部门
    @PostMapping("updatebm")
    public int updateByPrimaryKeySelective(@RequestBody BuMen buMen){
        System.err.println(buMen);
        return buMenservers.updateByPrimaryKeySelective(buMen);
    }




}
