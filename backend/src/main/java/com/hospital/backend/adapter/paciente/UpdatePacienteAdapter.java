package com.hospital.backend.adapter.paciente;

import com.hospital.backend.adapter.out.repository.PacienteRepository;
import com.hospital.backend.adapter.out.repository.entity.PacienteEntity;
import com.hospital.backend.adapter.out.repository.entity.mapper.PacienteEntityMapper;
import com.hospital.backend.application.core.domain.Paciente;
import com.hospital.backend.application.ports.out.paciente.UpdatePacienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdatePacienteAdapter implements UpdatePacienteOutputPort {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PacienteEntityMapper pacienteEntityMapper;

    @Override
    public void update(Long id, Paciente paciente) {
        PacienteEntity pacienteEntity = pacienteEntityMapper.toEntity(paciente);
        pacienteRepository.update(id, pacienteEntity);
    }
}
