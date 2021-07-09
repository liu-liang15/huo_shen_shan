package com.example.model.servers.outpatient;

import com.example.model.dao.outpatient.MedicalcardDao;
import com.example.model.pojos.outpatient.Medicalcard;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicalcardService {
    @Autowired
    MedicalcardDao medicalcardDao;

    public List<Medicalcard> findAllMedicalcard(String param){
        System.out.println(1);
        return medicalcardDao.findAllMedicalcard(param);
    }
}
