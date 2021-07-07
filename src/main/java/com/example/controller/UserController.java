package com.example.controller;

import com.example.model.pojos.BuMen;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class UserController {



    @GetMapping("/getbumen")
    public List<BuMen> getbm(){
        return null;
    }


}
