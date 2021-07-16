package com.example.controller.system;

import com.example.model.pojos.system.*;
import com.example.model.servers.system.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
public class MyController {
//    部门
    @Autowired
BuMenservice buMenservers;
//     员工
    @Autowired
YuanGoservice yuanGoservice;
//    科室
    @Autowired
KeShiservive keShiservive;
//    岗位
    @Autowired
GangWeiservice gangWeiservers;
//    用户
    @Autowired
YongHuservice yongHuservice;


//      获取部门数据
    @GetMapping("/getbumen/{shou}")
    public List<BuMen> getbm(@PathVariable("shou") String shou){
        return buMenservers.getbm(shou);
    }
//         获取员工数据
    @PostMapping("getyg")
    public List<YuanGo> getYg(){
        return yuanGoservice.getYuanGo();
    }
//    查询员工全部数据
    @RequestMapping("/getygall")
    public List<YuanGo> getyg2(String param){
        List<YuanGo> yuanGoAll = yuanGoservice.getYuanGoAll(param);
        return yuanGoAll;
    }

//    新增员工
    @PostMapping("xzyg")
    public int xz(@RequestBody YuanGo yuanGo){
        return yuanGoservice.insertyg(yuanGo);
    }
//   修改员工
    @PostMapping("xgyg")
    public int xg(@RequestBody YuanGo yuanGo){
        return yuanGoservice.updateyg(yuanGo);
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
        return keShiservive.getks();
    }
//    查询岗位
    @PostMapping("selectgw")
    public List<GangWei> getgw(){
        return gangWeiservers.getgw();
    }



//    ====================用户管理=========================
//新增用户
    @PostMapping("xzyh")
    public int ins(@RequestBody YongHu yongHu){
        return yongHuservice.insertyh(yongHu);
    }
//    修改用户
    @PostMapping("xgyh")
    public int xgy(@RequestBody YongHu yongHu){
        return yongHuservice.updateyh(yongHu);
    }
//    删除用户
    @PostMapping("scyh")
    public int sc(@RequestBody YongHu yongHu){
        System.err.println(yongHu);
        return yongHuservice.deleteyh(yongHu.getYgId());
    }

}
