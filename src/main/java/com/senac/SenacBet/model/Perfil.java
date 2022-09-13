package com.senac.SenacBet.model;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;

@Entity
public class Perfil {

    @Id
    @NotEmpty(message="O CPF deve ser preenchido!")
    @Column
    private String cpf;

    @NotEmpty(message="O nome deve ser preenchido")
    @Column
    private String nome;

    @NotEmpty(message = "O e-mail deve ser preenchido!")
    @Column
    private String email;

    @NotEmpty(message = "O cep deve ser preenchido")
    @Column
    private String cep;

    @NotEmpty(message = "A senha deve ser preenchida!")
    @Column
    private String senha;

    @NotEmpty(message = "O Telefone deve ser preenchido!")
    @Column
    private String telefone;

    @NotEmpty(message = "A Cidade deve ser preenchida!")
    @Column
    private String cidade;

    @NotEmpty(message = "A Rua deve ser preenchida!")
    @Column
    private String rua;

    @NotEmpty(message = "O Estado deve ser preenchido!")
    @Column
    private String estado;

    @NotEmpty(message = "O País deve ser preenchido!")
    @Column
    private String pais;


    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }
}
