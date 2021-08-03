package com.example.controller.inpatient;

import com.example.model.pojos.inpatient.DocExe;
import com.example.model.servers.inpatient.DocExeServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
public class DocExeController {
    @Autowired
    DocExeServer docExeServer;
    //护士站查看医嘱
    @GetMapping("/selDocExe")
    public List<DocExe> selDocExe(String param){
        return docExeServer.selDocExe(param);
    }
}
