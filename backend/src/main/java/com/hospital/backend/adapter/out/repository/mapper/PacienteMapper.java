package com.hospital.backend.adapter.out.repository.mapper;

import com.hospital.backend.adapter.out.repository.entity.PacienteEntity;
import com.hospital.backend.application.core.domain.Paciente;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Mapper(componentModel = "spring")
public interface PacienteMapper {

    @Mapping(target = "dataNascimento", expression = "java(mapStringToDate(pacienteEntity.getDataNascimento()))")
//    @Mapping(source = "id", target = "id")
//    @Mapping(source = "rg", target = "rg")
//    @Mapping(source = "cpf", target = "cpf")
//    @Mapping(source = "nome", target = "nome")
//    @Mapping(source = "email", target = "email")
//    @Mapping(source = "telefone", target = "telefone")
//    @Mapping(source = "endereco", target = "endereco")
//    @Mapping(source = "idConvenio", target = "idConvenio")
    Paciente toDomain(PacienteEntity pacienteEntity);

    default Date mapStringToDate(String date){
        if (date == null || date.isBlank()) {
            return null;
        }
        try {
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
            return dateFormat.parse(date);
        } catch (ParseException e) {
            throw new IllegalArgumentException("Data inválida: " + date, e);
        }
    }

    List<Paciente> toListDomain(List<PacienteEntity> list);

}
