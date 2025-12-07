package com.hospital.backend.application.ports.out;

import com.hospital.backend.application.core.domain.Paciente;

public interface UpdatePacienteOutputPort {

    void update(Long id, Paciente paciente);

}
