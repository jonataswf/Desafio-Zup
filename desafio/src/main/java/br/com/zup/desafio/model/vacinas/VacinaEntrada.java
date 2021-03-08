package br.com.zup.desafio.model.vacinas;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VacinaEntrada {

    @JsonProperty(value = "nome_vacina")
    private String nomeVacina;

    @JsonProperty(value = "fk_email_usuario")
    private String usuario;

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
