package com.example.model.servers.inpatient;

import com.example.model.dao.inpatient.DocAdvDao;
import com.example.model.dao.inpatient.DocAdvXqDao;
import com.example.model.pojos.inpatient.DocAdv;
import com.example.model.pojos.inpatient.DocAdvXq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DocAdvServer {
    @Autowired
    DocAdvDao docAdvDao;
    @Autowired
    DocAdvXqDao docAdvXqDao;
    //新增医嘱
    public void addDocAdv(DocAdv docAdv, List<DocAdvXq>docAdvXqs){
        docAdvDao.addDocAdv(docAdv);
        for(DocAdvXq d:docAdvXqs){
            d.setDocAdvNo(docAdv.getDocAdvNo()+"");
            docAdvXqDao.addDocAdvXq(d);
        }
    }
    //查看医嘱
    public List<DocAdv> selDocAdv(String param){
        return docAdvDao.selDocAdv(param);
    }
}