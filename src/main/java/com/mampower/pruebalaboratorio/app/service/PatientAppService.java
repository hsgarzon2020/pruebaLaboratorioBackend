package com.mampower.pruebalaboratorio.app.service;

import com.mampower.pruebalaboratorio.app.dtos.request.PatientRiskRequest;
import com.mampower.pruebalaboratorio.app.dtos.response.GetAllPatientsResponse;
import com.mampower.pruebalaboratorio.app.dtos.response.PatientResponse;
import com.mampower.pruebalaboratorio.app.dtos.response.PatientRiskResponse;
import com.mampower.pruebalaboratorio.app.mapper.PatientAppMapper;
import com.mampower.pruebalaboratorio.domain.service.PatientServiceDomain;
import com.mampower.pruebalaboratorio.domain.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientAppService {

    @Autowired
    PatientServiceDomain patientServiceDomain;

    @Autowired
    PatientAppMapper patientAppMapper;

    public PatientRiskResponse patientRisk(PatientRiskRequest patientRiskRequest)
            throws Exception {
        PatientRiskResponse patientRiskResponse = new PatientRiskResponse();
        patientRiskResponse.setRisk(patientServiceDomain.addPatient(
                patientAppMapper.mappingPatientDomain(patientRiskRequest)));
        patientRiskResponse.setResponseCode(Util.CODE_SUCCESS);
        patientRiskResponse.setResponseMessage(Util.MESSAGE_SUCCESS);
        return patientRiskResponse;
    }

    public GetAllPatientsResponse getPatients()
            throws Exception {
        GetAllPatientsResponse getAllPatientsResponse = new GetAllPatientsResponse();
        getAllPatientsResponse.setData(patientAppMapper.mappingPatientDomain(patientServiceDomain.getPatients()));
        getAllPatientsResponse.setResponseCode(Util.CODE_SUCCESS);
        getAllPatientsResponse.setResponseMessage(Util.MESSAGE_SUCCESS);

        return  getAllPatientsResponse;
    }

    public PatientResponse getPatient(String id)
            throws Exception{
        PatientResponse patientResponse = new PatientResponse();
        patientResponse = patientAppMapper.mappingPatientDomain(patientServiceDomain.getPatient(id));
        return patientResponse;
    }


}
