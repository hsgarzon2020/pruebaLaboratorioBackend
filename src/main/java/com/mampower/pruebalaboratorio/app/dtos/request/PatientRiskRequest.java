package com.mampower.pruebalaboratorio.app.dtos.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class PatientRiskRequest {
    @NotNull
    private Long id;

    @NotNull
    private Float sugar;

    @NotNull
    private Float fat;

    @NotNull
    private Float oxygen;


}
