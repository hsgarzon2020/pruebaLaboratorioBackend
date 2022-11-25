package com.mampower.pruebalaboratorio.app.dtos.response;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String id;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String sugar;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String fat;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String oxygen;
    @JsonInclude(JsonInclude.Include.NON_NULL)
    private String risk;
}
