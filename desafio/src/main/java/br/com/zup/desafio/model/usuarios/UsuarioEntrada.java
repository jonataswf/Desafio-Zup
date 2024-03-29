package br.com.zup.desafio.model.usuarios;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UsuarioEntrada {

    @JsonProperty(value = "nome")
    private String nome;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "cpf")
    private String cpf;

    @JsonProperty(value = "data_nascimento")
    private String dataNascimento;

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

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}
