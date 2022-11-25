package com.mampower.pruebalaboratorio.persistence.mapper;

import com.mampower.pruebalaboratorio.domain.entity.PatientDomain;
import com.mampower.pruebalaboratorio.persistence.entity.Patient;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientMapper {
    Patient patientMapper(PatientDomain patientDomain);

    PatientDomain patientMapper(Patient patient);

    List<PatientDomain> patientMapper(List<Patient> patients);
}
