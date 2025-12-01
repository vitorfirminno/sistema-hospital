package com.hospital.backend.adapter;

import com.hospital.backend.adapter.out.repository.PacienteRepository;
import com.hospital.backend.adapter.out.repository.mapper.PacienteMapper;
import com.hospital.backend.application.core.domain.Paciente;
import com.hospital.backend.application.ports.out.GetPacienteOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GetPacienteAdapter implements GetPacienteOutputPort {

    @Autowired
    private PacienteRepository pacienteRepository;

    @Autowired
    private PacienteMapper pacienteMapper;

    @Override
    public List<Paciente> get() {
        return pacienteMapper.toListDomain(pacienteRepository.getAll());
    }

}
