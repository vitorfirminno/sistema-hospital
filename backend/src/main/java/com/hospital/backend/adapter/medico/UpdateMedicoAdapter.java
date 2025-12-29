package com.hospital.backend.adapter.medico;

import com.hospital.backend.adapter.out.repository.MedicoRepository;
import com.hospital.backend.adapter.out.repository.entity.MedicoEntity;
import com.hospital.backend.adapter.out.repository.entity.mapper.MedicoEntityMapper;

import com.hospital.backend.application.core.domain.Medico;
import com.hospital.backend.application.ports.out.medico.UpdateMedicoOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class UpdateMedicoAdapter implements UpdateMedicoOutputPort {

    @Autowired
    private MedicoRepository medicoRepository;

    @Autowired
    private MedicoEntityMapper medicoEntityMapper;

    @Override
    public void update(Long id, Medico medico) {
        MedicoEntity medicoEntity = medicoEntityMapper.toEntity(medico);
        medicoRepository.update(id, medicoEntity);
    }
}
