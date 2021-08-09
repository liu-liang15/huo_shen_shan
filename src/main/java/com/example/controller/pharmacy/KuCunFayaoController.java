package com.example.controller.pharmacy;

import com.example.model.pojos.pharmacy.ChuKu;
import com.example.model.pojos.pharmacy.DiaoBoSq;
import com.example.model.pojos.pharmacy.XiaoHuiSq;
import com.example.model.pojos.pharmacy.YpKuCun;
import com.example.model.servers.pharmacy.KuCunFayaoService;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Mapper
@RestController
public class KuCunFayaoController {
    @Autowired
    KuCunFayaoService kuCunFayaoService;
    @RequestMapping("kucun")
    public List<YpKuCun> FindAllKuCun(){
        return kuCunFayaoService.FindAllKuCun();
    }
    @RequestMapping("kucun3")
    public List<YpKuCun> FindAllKuCun3(){
        return kuCunFayaoService.FindAllKuCun3();
    }
    @RequestMapping("add-dbd")
    public String addYPDB(@RequestBody DiaoBoSq diaoBoSq){
        try {
            kuCunFayaoService.addYPDB(diaoBoSq);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("add-xhd")
    public String addXHSQ(@RequestBody XiaoHuiSq xiaoHuiSq){
        try {
            kuCunFayaoService.addXHSQ(xiaoHuiSq);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }

    @RequestMapping("ypsq1")
    public List<DiaoBoSq> findByYPSQ1(){
        return kuCunFayaoService.findByYPSQ1();
    }
    @RequestMapping("ypsq2")
    public List<DiaoBoSq> findByYPSQ2(){
        return kuCunFayaoService.findByYPSQ2();
    }

    @RequestMapping("editsqd")
    public void updateYPSQ(int sqZhuangTai,String dbShengQing){
        kuCunFayaoService.updateYPSQ(sqZhuangTai,dbShengQing);
    }

  /*  @RequestMapping
    public void addChuKu(@RequestBody DiaoBoSq diaoBoSq){
        kuCunFayaoService.addChuKu(diaoBoSq);
    }*/
}
