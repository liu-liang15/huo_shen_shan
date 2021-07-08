package com.example.controller.pharmacy;

import com.example.model.pojos.pharmacy.GoYingShang;
import com.example.model.servers.pharmacy.GoYingShangService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class GoYingShangController {
    @Autowired
    GoYingShangService goYingShangService;

    @RequestMapping("upplier-mgr")
    public List<GoYingShang> findAll(){
        return goYingShangService.findAll();
    }

    @RequestMapping("add-supplier")
    public String addSupplier(@RequestBody GoYingShang goYingShang){
        try {
            if(goYingShang.getSupplyId()==0){
                goYingShangService.insert(goYingShang);
            }else{
                goYingShangService.update(goYingShang);
            }
            return "ok";
        } catch (Exception e) {
            e.printStackTrace();
            return "fail";
        }
    }
}
