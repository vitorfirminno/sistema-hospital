package com.hospital.backend.application.ports.in;

import com.hospital.backend.application.core.domain.Paciente;

public interface UpdatePacienteInputPort {

    void update(Long id, Paciente paciente);

}
