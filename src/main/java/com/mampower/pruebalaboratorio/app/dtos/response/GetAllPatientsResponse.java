package com.mampower.pruebalaboratorio.app.dtos.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllPatientsResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ResponseCode;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String ResponseMessage;
    private List<PatientResponse> data;
}
