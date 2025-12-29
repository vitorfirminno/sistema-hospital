package com.hospital.backend.application.ports.out.paciente;

import com.hospital.backend.application.core.domain.Paciente;

public interface CreatePacienteOutputPort {

    void create(Paciente paciente);

}
