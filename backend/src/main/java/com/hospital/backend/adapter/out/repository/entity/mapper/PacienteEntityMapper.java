package com.hospital.backend.adapter.out.repository.entity.mapper;


import com.hospital.backend.adapter.out.repository.entity.PacienteEntity;
import com.hospital.backend.application.core.domain.Paciente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;


@Mapper(componentModel = "spring")
public interface PacienteEntityMapper {

    @Mapping(target = "dataNascimento", dateFormat = "dd/MM/yyyy")
    PacienteEntity toEntity(Paciente paciente);

    List<PacienteEntity> toListEntity(List<Paciente> list);

}
