package com.hospital.backend.application.core.domain;

import java.text.DateFormat;

public class Paciente {

    private Long id;
    private String Rg;
    private String cpf;
    private String nome;
    private String email;
    private DateFormat dataNascimento;
    private String telefone;
    private String endereco;
    private Long idConvenio;

    public Paciente() {
    }

    public Paciente(Long id, String rg, String cpf, String nome, String email, DateFormat dataNascimento, String telefone, String endereco, Long idConvenio) {
        this.id = id;
        Rg = rg;
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.endereco = endereco;
        this.idConvenio = idConvenio;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRg() {
        return Rg;
    }

    public void setRg(String rg) {
        Rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public DateFormat getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(DateFormat dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Long getIdConvenio() {
        return idConvenio;
    }

    public void setIdConvenio(Long idConvenio) {
        this.idConvenio = idConvenio;
    }
}
