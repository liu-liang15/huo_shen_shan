package com.example.controller.system;

import com.example.model.pojos.system.BuMen;
import com.example.model.pojos.system.GangWei;
import com.example.model.pojos.system.KeShi;
import com.example.model.pojos.system.YuanGo;
import com.example.model.servers.system.BuMenservers;
import com.example.model.servers.system.GangWeiservers;
import com.example.model.servers.system.KeShiservers;
import com.example.model.servers.system.YuanGoservers;
import jdk.nashorn.internal.ir.BreakableNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.converter.json.GsonBuilderUtils;
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
//    科室
    @Autowired
    KeShiservers keShiservers;
//    岗位
    @Autowired
    GangWeiservers gangWeiservers;

//      获取部门数据
    @GetMapping("/getbumen/{shou}")
    public List<BuMen> getbm(@PathVariable("shou") String shou){
        return buMenservers.getbm(shou);
    }
//         获取员工数据
    @PostMapping("getyg")
    public List<YuanGo> getYg(){
        return yuanGoservers.getYuanGo();
    }
//    查询员工全部数据
    @PostMapping("getygall")
    public List<YuanGo> getyg2(String params){
        List<YuanGo> yuanGoAll = yuanGoservers.getYuanGoAll();
        return yuanGoAll;
    }

//    新增员工
    @PostMapping("xzyg")
    public int xz(@RequestBody YuanGo yuanGo){
        return yuanGoservers.insertyg(yuanGo);
    }
//   修改员工
    @PostMapping("xgyg")
    public int xg(@RequestBody YuanGo yuanGo){
        System.err.println(yuanGo);
        return yuanGoservers.updateyg(yuanGo);
//        return 1;
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
//    查询科室
    @PostMapping("selectks")
    public List<KeShi> getks(){
        return keShiservers.getks();
    }
//    查询岗位
    @PostMapping("selectgw")
    public List<GangWei> getgw(){
        return gangWeiservers.getgw();
    }



}
