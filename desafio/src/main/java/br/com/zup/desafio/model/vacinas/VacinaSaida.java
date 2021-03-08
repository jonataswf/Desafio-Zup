package br.com.zup.desafio.model.vacinas;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDateTime;

public class VacinaSaida {

    @JsonProperty(value = "id")
    private Integer id;

    @JsonProperty(value = "nome_vacina")
    private String nomeVacina;

    @JsonProperty(value = "data_aplicacao")
    private LocalDateTime dataAplicacao;

    @JsonProperty(value = "id_usuario")
    private Integer idUsuario;

    @JsonProperty(value = "nome_usuario")
    private String nomeUsuario;

    @JsonProperty(value = "email")
    private String email;

    @JsonProperty(value = "cpf")
    private String cpf;

    @JsonProperty(value = "data_nascimento")
    private String dataNascimento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public LocalDateTime getDataAplicacao() {
        return dataAplicacao;
    }

    public void setDataAplicacao(LocalDateTime dataAplicacao) {
        this.dataAplicacao = dataAplicacao;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
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
