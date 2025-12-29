package com.hospital.backend.adapter.medico;

import com.hospital.backend.adapter.out.repository.MedicoRepository;
import com.hospital.backend.adapter.out.repository.mapper.MedicoMapper;
import com.hospital.backend.application.core.domain.Medico;
import com.hospital.backend.application.ports.out.medico.GetMedicoOutputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Slf4j
public class GetMedicoAdapter implements GetMedicoOutputPort {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private MedicoMapper medicoMapper;

    @Override
    public List<Medico> get() {
        List<Medico> medicos = medicoMapper.toListDomain(medicoRepository.getAll());
        log.info("GetMedicoAdapter - get - {}", medicos);
        return medicos;
    }
}
