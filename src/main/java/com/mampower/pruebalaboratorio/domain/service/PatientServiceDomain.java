package com.mampower.pruebalaboratorio.domain.service;

import com.mampower.pruebalaboratorio.domain.entity.PatientDomain;
import com.mampower.pruebalaboratorio.domain.repository.PatientRepositoryDomain;
import com.mampower.pruebalaboratorio.domain.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatientServiceDomain {

    @Autowired
    PatientRepositoryDomain patientRepositoryDomain;

    public String addPatient(PatientDomain patientDomain)
            throws Exception {
        String risk = Util.patientRisk(patientDomain.getSugar(), patientDomain.getFat(), patientDomain.getOxygen());
        patientDomain.setRisk(risk);
        patientRepositoryDomain.addPatient(patientDomain);
        return risk;
    }
    public List<PatientDomain> getPatients()
            throws Exception {
        return patientRepositoryDomain.getPatients();
    }

    public PatientDomain getPatient(String id) throws Exception {
        return patientRepositoryDomain.findPatientById(id);
    }

}
