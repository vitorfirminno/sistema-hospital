package com.hospital.backend.adapter.paciente;

import com.hospital.backend.adapter.out.repository.PacienteRepository;
import com.hospital.backend.application.ports.out.paciente.DeletePacienteByIdOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DeletePacienteByIdAdapter implements DeletePacienteByIdOutputPort {

    @Autowired
    PacienteRepository pacienteRepository;

    @Override
    public boolean delete(Long id) {
        return pacienteRepository.delete(id);
    }
}
