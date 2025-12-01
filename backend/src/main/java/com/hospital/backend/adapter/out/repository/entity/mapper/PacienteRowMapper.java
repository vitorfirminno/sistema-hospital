package com.hospital.backend.adapter.out.repository.entity.mapper;

import com.hospital.backend.adapter.out.repository.entity.PacienteEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PacienteRowMapper implements RowMapper<PacienteEntity> {

    @Override
    public PacienteEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new PacienteEntity(
                rs.getLong("id_paciente"),
                rs.getString("rg_paciente"),
                rs.getString("cpf_paciente"),
                rs.getString("nome"),
                rs.getString("email_paciente"),
                rs.getString("data_nascimento"),
                rs.getString("telefone"),
                rs.getString("endereco"),
                rs.getLong("id_convenio")
        );
    }

}
