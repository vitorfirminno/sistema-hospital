package com.hospital.backend.application.ports.out.paciente;

import com.hospital.backend.application.core.domain.Paciente;

import java.util.List;

public interface GetPacienteOutputPort {

    List<Paciente> get();

}
