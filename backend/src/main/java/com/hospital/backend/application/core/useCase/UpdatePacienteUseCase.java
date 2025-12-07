package com.hospital.backend.application.core.useCase;

import com.hospital.backend.application.core.domain.Paciente;
import com.hospital.backend.application.ports.in.GetPacienteInputPort;
import com.hospital.backend.application.ports.in.UpdatePacienteInputPort;
import com.hospital.backend.application.ports.out.UpdatePacienteOutputPort;

import java.util.List;

public class UpdatePacienteUseCase implements UpdatePacienteInputPort {

    private final UpdatePacienteOutputPort updatePacienteOutputPort;

    public UpdatePacienteUseCase(UpdatePacienteOutputPort updatePacienteOutputPort) {
        this.updatePacienteOutputPort = updatePacienteOutputPort;
    }

    @Override
    public void update(Long id, Paciente paciente) {
        updatePacienteOutputPort.update(id, paciente);
    }
}
