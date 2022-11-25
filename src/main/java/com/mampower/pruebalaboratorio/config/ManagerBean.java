package com.mampower.pruebalaboratorio.config;

import com.mampower.pruebalaboratorio.domain.repository.PatientRepositoryDomain;
import com.mampower.pruebalaboratorio.persistence.repositoryImpl.PatientRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ManagerBean {

    @Bean
    public PatientRepositoryDomain patientRepositoryDomain() {
        return new PatientRepository();
    }
}
