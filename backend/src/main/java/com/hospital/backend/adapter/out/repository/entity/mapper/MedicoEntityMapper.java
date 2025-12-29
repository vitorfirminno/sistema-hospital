package com.hospital.backend.adapter.out.repository.entity.mapper;

import com.hospital.backend.adapter.out.repository.entity.MedicoEntity;
import com.hospital.backend.application.core.domain.Medico;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface MedicoEntityMapper {

    MedicoEntity toEntity(Medico medico);

    List<MedicoEntity> toListEntity(List<Medico> list);
}
