package com.hospital.backend.configuration.in;

import com.hospital.backend.application.core.useCase.CreatePacienteUseCase;
import com.hospital.backend.application.ports.in.CreatePacienteInputPort;
import com.hospital.backend.application.ports.out.CreatePacienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CreatePacienteConfiguration {

    @Bean
    public CreatePacienteInputPort createPacienteBeanConfig(
            @Autowired CreatePacienteOutputPort createPacienteOutputPort
            ){
        return new CreatePacienteUseCase(createPacienteOutputPort);
    }


}
