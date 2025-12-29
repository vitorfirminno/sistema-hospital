package com.hospital.backend.application.core.domain;

public class Medico {

    private Long id;
    private Long especialidadeId;
    private String nome;
    private Long crm;
    private String telefone;

    public Medico() {
    }

    public Medico(Long id, Long especialidadeId, String nome, Long crm, String telefone) {
        this.id = id;
        this.especialidadeId = especialidadeId;
        this.nome = nome;
        this.crm = crm;
        this.telefone = telefone;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEspecialidadeId() {
        return especialidadeId;
    }

    public void setEspecialidadeId(Long especialidadeId) {
        this.especialidadeId = especialidadeId;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCrm() {
        return crm;
    }

    public void setCrm(Long crm) {
        this.crm = crm;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
}
