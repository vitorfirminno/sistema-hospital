package com.hospital.backend.application.core.useCase.paciente;

import com.hospital.backend.application.ports.in.DeletePacienteByIdInputPort;
import com.hospital.backend.application.ports.out.paciente.DeletePacienteByIdOutputPort;

public class DeletePacienteByIdUseCase implements DeletePacienteByIdInputPort {

    private final DeletePacienteByIdOutputPort deletePacienteByIdOutputPort;

    public DeletePacienteByIdUseCase(DeletePacienteByIdOutputPort deletePacienteByIdOutputPort) {
        this.deletePacienteByIdOutputPort = deletePacienteByIdOutputPort;
    }

    @Override
    public boolean delete(Long id) {
        return deletePacienteByIdOutputPort.delete(id);
    }
}
