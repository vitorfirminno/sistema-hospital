package com.hospital.backend.adapter.out.repository;

import com.hospital.backend.adapter.out.repository.entity.PacienteEntity;
import com.hospital.backend.adapter.out.repository.entity.mapper.PacienteRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.List;

@Component
public class PacienteRepository {

    @Autowired
    @Qualifier("getHospitalJdbcClient")
    private JdbcClient jdbcClient;

    public void insert(PacienteEntity pacienteEntity){
        final String SQL ="""
                    INSERT INTO Paciente (id_paciente, rg_paciente, cpf_paciente, nome, email_paciente, data_nascimento, telefone, endereco, id_convenio) values(?,?,?,?,?,?,?,?,?)
                """;
        int linhaAfetada =  jdbcClient.sql(SQL).params(pacienteEntity.getId(), pacienteEntity.getRg(), pacienteEntity.getCpf(), pacienteEntity.getNome(),
                pacienteEntity.getEmail(), pacienteEntity.getDataNascimento(), pacienteEntity.getTelefone(), pacienteEntity.getEndereco(),
                pacienteEntity.getIdConvenio()).update();

        Assert.state(linhaAfetada == 1, "Erro PacienteEntity - insert - Erro ao inserir Paciente");

    }

    public List<PacienteEntity> getAll(){
        final String SQL = """
            SELECT * FROM Paciente
            """;
        return jdbcClient.sql(SQL).query(new PacienteRowMapper()).list();
    }

    public void update(Long id, PacienteEntity pacienteEntity){
        final String SQL = """
                    UPDATE Paciente set rg_paciente = ?, cpf_paciente = ?,
                     nome = ?, email_paciente = ?, data_nascimento = ?, telefone = ?, endereco = ?, id_convenio = ?  WHERE id_paciente = ?
                """;

        int linhaAfetada = jdbcClient.sql(SQL).params(pacienteEntity.getRg(), pacienteEntity.getCpf(), pacienteEntity.getNome(),
                pacienteEntity.getEmail(), pacienteEntity.getDataNascimento(), pacienteEntity.getTelefone(), pacienteEntity.getEndereco(),
                pacienteEntity.getIdConvenio(), id).update();
        Assert.state(linhaAfetada == 1, "Erro PacienteEntity - update - Erro ao atualizar um Paciente");
    }

    public boolean delete(Long id){
        final String SQL = """
                DELETE FROM Paciente WHERE id_paciente = ?
                """;
        int linhaAfetada = jdbcClient.sql(SQL).param(id).update();
        return linhaAfetada == 1;
    }

}