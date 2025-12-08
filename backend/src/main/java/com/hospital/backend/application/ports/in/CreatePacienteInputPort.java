package com.hospital.backend.application.ports.in;

import com.hospital.backend.application.core.domain.Paciente;

public interface CreatePacienteInputPort {

    void create(Paciente paciente);

}
