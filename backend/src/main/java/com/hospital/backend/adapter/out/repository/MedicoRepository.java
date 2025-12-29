package com.hospital.backend.adapter.out.repository;

import com.hospital.backend.adapter.out.repository.entity.MedicoEntity;
import com.hospital.backend.adapter.out.repository.entity.mapper.MedicoRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;

@Component
public class MedicoRepository {

    @Autowired
    @Qualifier("getHospitalJdbcClient")
    private JdbcClient jdbcClient;


    public List<MedicoEntity> getAll(){
        final String SQL = """
                select * from Medico
                """;

        return jdbcClient.sql(SQL).query(new MedicoRowMapper()).list();
    }

    public void insert(MedicoEntity medicoEntity){
        final String SQL ="""
                    INSERT INTO Medico (id_medico, especialidade, crm, nome, telefone) values(?,?,?,?,?)
                """;

        int linhaAfetada = jdbcClient.sql(SQL).param(medicoEntity.getId())
                .param(medicoEntity.getEspecialidadeId())
                .param(medicoEntity.getCrm())
                .param(medicoEntity.getNome())
                .param(medicoEntity.getTelefone()).update();

        Assert.state(linhaAfetada == 1, "Erro MedicoEntity - insert - Erro ao inserir Medico");
    }

    public void update(Long id, MedicoEntity medicoEntity){
        final String SQL = """
                    UPDATE Medico set especialidade = ?, crm = ?,
                     nome = ?, telefone = ? WHERE id_medico = ?
                """;
        int linhaAfetada = jdbcClient.sql(SQL)
                .param(medicoEntity.getEspecialidadeId())
                .param(medicoEntity.getCrm())
                .param(medicoEntity.getNome())
                .param(medicoEntity.getTelefone())
                .param(id).update();
        Assert.state(linhaAfetada == 1, "Erro MedicoEntity - update - Erro ao atualizar um Medico");
    }

    public boolean delete(Long id){
        final String SQL = """
                DELETE FROM Medico WHERE id_medico = ?
                """;
        int linhaAfetada = jdbcClient.sql(SQL).param(id).update();

        return linhaAfetada == 1;
    }
}
