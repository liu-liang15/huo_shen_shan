package com.example.model.services.outpatient;

import com.example.model.dao.outpatient.MedicalcardCzjlDao;
import com.example.model.dao.outpatient.MedicalcardDao;
import com.example.model.pojos.outpatient.Medicalcardczjl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MedicalcardCzjlService {
    @Autowired
    MedicalcardCzjlDao medicalcardCzjlDao;
    @Autowired
    MedicalcardDao medicalcardDao;

    public List<Medicalcardczjl> findAllMedicalcardCzjl(String param){
        return medicalcardCzjlDao.findAllMedicalcardCzjl(param);
    }

    public void addMedicalcardCzjl(Medicalcardczjl medicalcardczjl){
        medicalcardCzjlDao.addMedicalcardCzjl(medicalcardczjl);
        medicalcardDao.updatePat(medicalcardczjl.getCardczjlMoney(),medicalcardczjl.getCardczjlMediNo());
    }

}
