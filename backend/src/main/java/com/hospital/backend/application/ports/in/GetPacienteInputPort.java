package com.hospital.backend.application.ports.in;

import com.hospital.backend.application.core.domain.Paciente;

import java.util.List;

public interface GetPacienteInputPort {

    List<Paciente> get();

}
