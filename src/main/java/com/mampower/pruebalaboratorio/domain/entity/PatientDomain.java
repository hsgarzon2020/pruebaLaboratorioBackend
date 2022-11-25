package com.mampower.pruebalaboratorio.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PatientDomain {

    @NotNull
    private Long id;
    @NotNull
    private Float sugar;

    @NotNull
    private Float fat;

    @NotNull
    private Float oxygen;

    @NotNull
    private String risk;

}
