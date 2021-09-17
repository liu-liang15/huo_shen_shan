package com.example.controller.pharmacy;

import com.example.model.pojos.outpatient.Feebill;
import com.example.model.pojos.pharmacy.ChuKu;
import com.example.model.pojos.pharmacy.FaYao;
import com.example.model.pojos.pharmacy.YpYaoFang;
import com.example.model.services.pharmacy.YaoFangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class YaoFangController {
    @Autowired
    YaoFangService yaoFangService;
    @RequestMapping("allyp")
    public List<YpYaoFang> FindAll(){
       return yaoFangService.findAll();
    }
    @RequestMapping("alldfyp")
    public List<Feebill> FindAllDFYP(){
        return yaoFangService.findAllDFYP();
    }
    @RequestMapping("fayao")
    public String addFaYao(@RequestBody FaYao faYao){
        try {
            yaoFangService.faYao(faYao);
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
