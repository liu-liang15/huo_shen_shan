package com.example.controller.system;

import com.example.model.pojos.system.*;
import com.example.model.servers.system.*;
import com.example.util.Password;
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
//   权限
    @Autowired
    QuanXianservice quanXianservice;
//    班次
    @Autowired
    BanCiService banCiService;



    //    ====================================员工管理======================================
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
    }

//    ====================================部门管理======================================
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
    //      获取部门数据
    @GetMapping("/getbumen/{shou}")
    public List<BuMen> getbm(@PathVariable("shou") String shou){
        return buMenservers.getbm(shou);
    }


//    ====================================科室管理======================================
//    查询科室
    @PostMapping("selectks")
    public List<KeShi> getks(){
        return keShiservive.getks();
    }
//    查询科室全部数据，包括员工
    @GetMapping("keshiall/{shou}")
    public List<KeShi> ks(@PathVariable("shou") String shou){
        return keShiservive.getall(shou);
    }
//  新增科室
    @PostMapping("xzks")
    public int ksxz(@RequestBody KeShi keShi){
        System.err.println(keShi);
        return keShiservive.insertks(keShi);
    }
    //  修改科室
    @PostMapping("xgks")
    public int ksxg(@RequestBody KeShi keShi){
        System.err.println(keShi);
        return keShiservive.updateks(keShi);
    }


//    ============================岗位管理===================================
    /**
     * 查询岗位
     */
    @PostMapping("selectgw")
    public List<GangWei> getgw(String param){
        return gangWeiservers.getgw(param);
    }
    /**
     * 分层查询岗位
     */
    @PostMapping("gwfc")
    public List<GangWei> gwfc(){
        return gangWeiservers.getfcgw();
    }
    /**
     * 新增岗位和岗位对应的权限
     * @param gangWei
     */
    @PostMapping("xzgw")
    public void xzgw(@RequestBody GangWei gangWei){
        gangWeiservers.insertgw(gangWei);
    }

    /**
     * 修改岗位
     * @param gangWei
     * @return
     */
    @PostMapping("xggw")
    public CommonResult xggw2(@RequestBody GangWei gangWei){
        gangWeiservers.updateGw(gangWei);
//      返回一个类
        return new CommonResult(200,"修改成功");
    }



//    ====================用户管理=========================
//新增用户
    @PostMapping("xzyh")
    public int ins(@RequestBody YongHu yongHu){
        return yongHuservice.insertyh(yongHu);
    }
//    重置密码用户
    @PostMapping("czmm")
    public int xgy(@RequestBody YongHu yongHu){
        return yongHuservice.czmm(yongHu);
    }
//    删除用户
    @PostMapping("scyh")
    public int sc(@RequestBody YongHu yongHu){
        return yongHuservice.deleteyh(yongHu.getYhId()+"");
    }
//  用户登录
    @PostMapping("login")
    public CommonResult dl(@RequestBody YongHu yongHu){
        boolean getyh = yongHuservice.getyh(yongHu);
        return new CommonResult(200,getyh?"成功":"账号或密码错误");
    }

    //    ------------------------查询权限-----------------------------
    @PostMapping("cxqx")
    public List<QuanXian> getqx(){
        return quanXianservice.getqx();
    }

//===================班次表==========================
    @PostMapping("cxbc")
    public List<BanCi> getbc(){
       return null;
    }


}
