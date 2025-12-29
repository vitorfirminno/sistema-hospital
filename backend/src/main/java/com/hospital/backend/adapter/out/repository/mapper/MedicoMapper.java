package com.hospital.backend.adapter.out.repository.mapper;

import com.hospital.backend.adapter.out.repository.entity.MedicoEntity;
import com.hospital.backend.application.core.domain.Medico;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MedicoMapper {

    Medico toDomain(MedicoEntity medicoEntity);

    List<Medico> toListDomain(List<MedicoEntity> list);

}
