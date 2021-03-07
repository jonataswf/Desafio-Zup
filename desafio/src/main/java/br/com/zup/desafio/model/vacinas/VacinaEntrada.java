package br.com.zup.desafio.model.vacinas;

import com.fasterxml.jackson.annotation.JsonProperty;

public class VacinaEntrada {

    @JsonProperty(value = "nome_vacina")
    private String nomeVacina;

    @JsonProperty(value = "fk_id_usuario")
    private Integer usuario;

    public String getNomeVacina() {
        return nomeVacina;
    }

    public void setNomeVacina(String nomeVacina) {
        this.nomeVacina = nomeVacina;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        this.usuario = usuario;
    }
}
