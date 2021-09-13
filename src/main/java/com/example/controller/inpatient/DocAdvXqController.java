package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.DocAdvXq;
import com.example.model.services.inpatient.DocAdvXqServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class DocAdvXqController {
    @Autowired
    DocAdvXqServer docAdvXqServer;
    //查看医嘱详单
    @GetMapping("/selDocAdvXq")
    public List<DocAdvXq> selDocAdvXq(String param){
        return docAdvXqServer.selDocAdvXq(param);
    }
}
