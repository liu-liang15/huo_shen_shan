package com.example.model.servers.inpatient;

import com.example.model.dao.inpatient.DocAdvXqDao;
import com.example.model.dao.inpatient.DocExeDao;
import com.example.model.pojos.inpatient.DocAdvXq;
import com.example.model.pojos.inpatient.DocExe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class DocExeServer {
    @Autowired
    DocExeDao docExeDao;
    @Autowired
    DocAdvXqDao docAdvXqDao;
    //新增今日医嘱并查看
    public List<DocExe> selDocExe(String param){
        //获得医嘱详情
        List<DocAdvXq> docAdvXqs=docAdvXqDao.serDocAdvXq(param);
        for(DocAdvXq d:docAdvXqs){
            List<DocExe>docExes=docExeDao.nowDocExe(d.getDocAdvId()+"");
            //没找到今天的医嘱则新增
            if(docExes.isEmpty()){
                docExeDao.addDocExe(d.getDocAdvId()+"");
            }
        }
        return docExeDao.selDocExe(param);
    }
}
