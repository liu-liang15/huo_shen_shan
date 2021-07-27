package com.example.model.servers.outpatient;

import com.example.model.dao.outpatient.MedicalcardDao;
import com.example.model.dao.outpatient.MedicalcardztDao;
import com.example.model.pojos.outpatient.Medicalcard;
import com.example.model.pojos.outpatient.Medicalcardzt;
import com.example.util.BaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;

@Service
@Transactional
public class MedicalcardztService{
    @Autowired
    MedicalcardztDao medicalcardztDao;

    public List<Medicalcardzt> findAllMedicalcardzt(String param){
        return medicalcardztDao.findAllMedicalcardzt(param);
    }

    public void save(Medicalcardzt medicalcardzt) {
        medicalcardztDao.save(medicalcardzt);
    }

}
