package com.hospital.backend.configuration.in;


import com.hospital.backend.application.core.useCase.GetPacienteUseCase;
import com.hospital.backend.application.ports.in.GetPacienteInputPort;
import com.hospital.backend.application.ports.out.GetPacienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GetPacienteConfiguration {

    @Bean
    public GetPacienteInputPort getPacienteConfig(
            @Autowired GetPacienteOutputPort getPacienteOutputPort
            ){
        return new GetPacienteUseCase(getPacienteOutputPort);
    }

}
