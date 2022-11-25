package com.mampower.pruebalaboratorio.app.mapper;

import com.mampower.pruebalaboratorio.app.dtos.request.PatientRiskRequest;
import com.mampower.pruebalaboratorio.app.dtos.response.PatientResponse;
import com.mampower.pruebalaboratorio.domain.entity.PatientDomain;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PatientAppMapper {

    public PatientDomain mappingPatientDomain(PatientRiskRequest patientRiskRequest);

    public PatientResponse mappingPatientDomain(PatientDomain patientDomain);

    List<PatientResponse> mappingPatientDomain(List<PatientDomain> patientsDomain);

}
