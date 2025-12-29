package com.hospital.backend.adapter.medico;

import com.hospital.backend.adapter.out.repository.MedicoRepository;
import com.hospital.backend.adapter.out.repository.entity.MedicoEntity;
import com.hospital.backend.adapter.out.repository.entity.mapper.MedicoEntityMapper;
import com.hospital.backend.application.core.domain.Medico;
import com.hospital.backend.application.ports.out.medico.CreateMedicoOutputPort;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
@Slf4j
public class InsertMedicoAdapter implements CreateMedicoOutputPort {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private MedicoEntityMapper medicoEntityMapper;

    @Override
    public void create(Medico medico) {
        MedicoEntity medicoEntitie = medicoEntityMapper.toEntity(medico);
        log.info("InsertMedicoAdapter - insert - {}", medicoEntitie);
        medicoRepository.insert(medicoEntitie);
    }
}
