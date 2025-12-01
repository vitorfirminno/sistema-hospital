package com.hospital.backend.adapter.out.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data

public class PacienteEntity {
    private Long id;
    private String rg;
    private String cpf;
    private String nome;
    private String email;
    private String dataNascimento;
    private String telefone;
    private String endereco;
    private Long idConvenio;
}
