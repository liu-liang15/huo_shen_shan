package com.example.controller;

import com.example.model.pojos.BuMen;
import com.example.model.servers.BuMenservers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {
    @Autowired
    BuMenservers buMenservers;

    @GetMapping("/getbumen")
    public List<BuMen> getbm(){
        return buMenservers.getbm();
    }


}
