package com.mampower.pruebalaboratorio.persistence.repositoryImpl;

import com.mampower.pruebalaboratorio.domain.entity.PatientDomain;
import com.mampower.pruebalaboratorio.domain.repository.PatientRepositoryDomain;
import com.mampower.pruebalaboratorio.persistence.entity.Patient;
import com.mampower.pruebalaboratorio.persistence.mapper.PatientMapper;
import com.mampower.pruebalaboratorio.persistence.repositoryJpa.PatientRepositoryJpa;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

public class PatientRepository implements PatientRepositoryDomain {

    @Autowired
    PatientRepositoryJpa patientRepositoryJpa;

    @Autowired
    PatientMapper patientMapper;

    @Override
    public void addPatient(PatientDomain patientDomain) throws Exception {
        patientRepositoryJpa.save(patientMapper.patientMapper(patientDomain));
    }

    @Override
    public List<PatientDomain> getPatients() throws Exception {
        List<Patient> patients = patientRepositoryJpa.findAll();
        if (!patients.isEmpty()) {
            return patientMapper.patientMapper(patients);
        } else {
            return new ArrayList<PatientDomain>();
        }
    }

    @Override
    public PatientDomain findPatientById(String id) throws Exception {
        return patientMapper.patientMapper(patientRepositoryJpa.findById(Long.parseLong(id)).get());
    }
}
