package com.hospital.backend.adapter;

import com.hospital.backend.adapter.out.repository.PacienteRepository;
import com.hospital.backend.adapter.out.repository.entity.PacienteEntity;
import com.hospital.backend.adapter.out.repository.entity.mapper.PacienteEntityMapper;
import com.hospital.backend.application.core.domain.Paciente;
import com.hospital.backend.application.ports.out.CreatePacienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CreatePacienteAdapter implements CreatePacienteOutputPort {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    PacienteEntityMapper pacienteEntityMapper;

    @Override
    public void create(Paciente paciente) {
        PacienteEntity pacienteEntity = pacienteEntityMapper.toEntity(paciente);
        pacienteRepository.insert(pacienteEntity);
    }
}
