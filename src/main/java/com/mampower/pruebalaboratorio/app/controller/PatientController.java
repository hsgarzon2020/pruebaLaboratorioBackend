package com.mampower.pruebalaboratorio.app.controller;

import com.mampower.pruebalaboratorio.app.dtos.request.PatientRiskRequest;
import com.mampower.pruebalaboratorio.app.dtos.response.GetAllPatientsResponse;
import com.mampower.pruebalaboratorio.app.dtos.response.PatientResponse;
import com.mampower.pruebalaboratorio.app.dtos.response.PatientRiskResponse;
import com.mampower.pruebalaboratorio.app.service.PatientAppService;
import com.mampower.pruebalaboratorio.domain.util.Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/patients")
public class PatientController {
    @Autowired
    private PatientAppService patientAppService;

    @PostMapping()
    public ResponseEntity<PatientRiskResponse> patientRisk(@Valid @RequestBody PatientRiskRequest patientRiskRequest) {
        PatientRiskResponse patientRiskResponse = new PatientRiskResponse();
        try {
            patientRiskResponse = patientAppService.patientRisk(patientRiskRequest);
            return new ResponseEntity<>(patientRiskResponse, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(patientRiskResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping()
    public ResponseEntity<GetAllPatientsResponse> getAllPatients() {
        GetAllPatientsResponse getAllPatientsResponse = new GetAllPatientsResponse();
        try {
            getAllPatientsResponse = patientAppService.getPatients();
            return new ResponseEntity<>(getAllPatientsResponse, HttpStatus.OK);
        } catch (Exception e) {
            getAllPatientsResponse.setResponseCode(Util.CODE_FAILED);
            getAllPatientsResponse.setResponseMessage(Util.MESSAGE_FAILED);
            return new ResponseEntity<>(getAllPatientsResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<PatientResponse> getPatient(@PathVariable(name = "id", required = true) String id) {
        PatientResponse patientResponse = new PatientResponse();
        try {
            patientResponse = patientAppService.getPatient(id);
            return new ResponseEntity<>(patientResponse, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(patientResponse, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
