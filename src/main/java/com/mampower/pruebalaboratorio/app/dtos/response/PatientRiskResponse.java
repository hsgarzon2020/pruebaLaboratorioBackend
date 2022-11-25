package com.mampower.pruebalaboratorio.app.dtos.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientRiskResponse {
    
    private String risk;
    private String responseCode;
    private String responseMessage;

}
