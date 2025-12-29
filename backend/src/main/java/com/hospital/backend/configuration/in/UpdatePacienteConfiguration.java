package com.hospital.backend.configuration.in;


import com.hospital.backend.application.core.useCase.paciente.UpdatePacienteUseCase;
import com.hospital.backend.application.ports.in.UpdatePacienteInputPort;
import com.hospital.backend.application.ports.out.paciente.UpdatePacienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UpdatePacienteConfiguration {

    @Bean
    public UpdatePacienteInputPort updatePacienteBeanConfig(
            @Autowired UpdatePacienteOutputPort updatePacienteOutputPort
            ){
        return new UpdatePacienteUseCase(updatePacienteOutputPort);
    }

}
