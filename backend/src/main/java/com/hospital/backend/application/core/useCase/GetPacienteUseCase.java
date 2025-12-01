package com.hospital.backend.application.core.useCase;

import com.hospital.backend.application.core.domain.Paciente;
import com.hospital.backend.application.ports.in.GetPacienteInputPort;
import com.hospital.backend.application.ports.out.GetPacienteOutputPort;
import java.util.List;

public class GetPacienteUseCase implements GetPacienteInputPort {

    private final GetPacienteOutputPort getPacienteOutputPort;

    public GetPacienteUseCase(GetPacienteOutputPort getPacienteOutputPort) {
        this.getPacienteOutputPort = getPacienteOutputPort;
    }
    @Override
    public List<Paciente> get() {
        return getPacienteOutputPort.get();
    }
}
