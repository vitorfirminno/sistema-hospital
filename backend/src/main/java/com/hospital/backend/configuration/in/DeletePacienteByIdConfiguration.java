package com.hospital.backend.configuration.in;


import com.hospital.backend.application.core.useCase.DeletePacienteByIdUseCase;
import com.hospital.backend.application.ports.in.DeletePacienteByIdInputPort;
import com.hospital.backend.application.ports.out.DeletePacienteByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DeletePacienteByIdConfiguration {

    @Bean
    public DeletePacienteByIdInputPort deletePacienteByIdBeanConfig(
            @Autowired DeletePacienteByIdOutputPort deletePacienteByIdOutputPort
            ){
        return new DeletePacienteByIdUseCase(deletePacienteByIdOutputPort);
    }

}
