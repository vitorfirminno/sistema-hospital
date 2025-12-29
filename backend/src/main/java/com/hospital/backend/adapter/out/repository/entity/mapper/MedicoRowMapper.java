package com.hospital.backend.adapter.out.repository.entity.mapper;

import com.hospital.backend.adapter.out.repository.entity.MedicoEntity;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MedicoRowMapper implements RowMapper<MedicoEntity> {

    @Override
    public MedicoEntity mapRow(ResultSet rs, int rowNum) throws SQLException {

        MedicoEntity medicoEntity = new MedicoEntity();

        medicoEntity.setId(rs.getLong("id_medico"));
        medicoEntity.setEspecialidadeId(rs.getLong("especialidade"));
        medicoEntity.setNome(rs.getNString("nome"));
        medicoEntity.setCrm(rs.getLong("crm"));
        medicoEntity.setTelefone(rs.getNString("telefone"));

        return medicoEntity;
    }
}
