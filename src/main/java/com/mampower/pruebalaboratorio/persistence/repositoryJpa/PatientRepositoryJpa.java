package com.mampower.pruebalaboratorio.persistence.repositoryJpa;


import com.mampower.pruebalaboratorio.persistence.entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepositoryJpa extends JpaRepository<Patient, Long> {

}

