package com.example.controller.hyj;

import com.example.model.pojos.hyj.AssayPerson;
import com.example.model.servers.hyj.AssayResService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin
public class AssayInformController {
    @Autowired
    AssayResService assayResService;
    @RequestMapping("findRes")
    public List<AssayPerson> findRes(@RequestBody AssayPerson assayPerson){
        return assayResService.findRes(assayPerson);
    }
}
