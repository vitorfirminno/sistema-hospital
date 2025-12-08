package com.hospital.backend.application.core.useCase;

import com.hospital.backend.application.core.domain.Paciente;
import com.hospital.backend.application.ports.in.CreatePacienteInputPort;
import com.hospital.backend.application.ports.out.CreatePacienteOutputPort;

public class CreatePacienteUseCase implements CreatePacienteInputPort {

    private final CreatePacienteOutputPort createPacienteOutputPort;

    public CreatePacienteUseCase(CreatePacienteOutputPort createPacienteOutputPort) {
        this.createPacienteOutputPort = createPacienteOutputPort;
    }

    @Override
    public void create(Paciente paciente) {
        createPacienteOutputPort.create(paciente);
    }
}
