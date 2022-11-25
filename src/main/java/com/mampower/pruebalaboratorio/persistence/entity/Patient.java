package com.mampower.pruebalaboratorio.persistence.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Patient {

    @Id
    private Long id;
    private Float sugar;
    private Float fat;
    private Float oxygen;
    private String risk;

}
