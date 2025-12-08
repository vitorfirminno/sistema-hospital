package com.hospital.backend.application.ports.out;

import com.hospital.backend.application.core.domain.Paciente;

public interface CreatePacienteOutputPort {

    void create(Paciente paciente);

}
