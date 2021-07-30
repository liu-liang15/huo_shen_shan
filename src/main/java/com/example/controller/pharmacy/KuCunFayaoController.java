package com.example.controller.pharmacy;

import com.example.model.pojos.pharmacy.DiaoBoSq;
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
}
