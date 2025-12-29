package com.hospital.backend.adapter.out.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MedicoEntity {

    private Long id;
    private Long especialidadeId;
    private String nome;
    private Long crm;
    private String telefone;

}
