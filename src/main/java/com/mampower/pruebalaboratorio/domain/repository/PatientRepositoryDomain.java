package com.mampower.pruebalaboratorio.domain.repository;

import com.mampower.pruebalaboratorio.domain.entity.PatientDomain;

import java.util.List;
import java.util.Optional;

public interface PatientRepositoryDomain {
    void addPatient(PatientDomain patientDomain) throws Exception;

    List<PatientDomain> getPatients() throws Exception;

    PatientDomain findPatientById(String id) throws Exception;

}
