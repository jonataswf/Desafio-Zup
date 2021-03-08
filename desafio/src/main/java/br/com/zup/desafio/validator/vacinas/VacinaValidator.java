package br.com.zup.desafio.validator.vacinas;

import br.com.zup.desafio.exception.DadosInvalidosException;
import br.com.zup.desafio.model.vacinas.VacinaEntrada;
import org.springframework.stereotype.Component;

@Component
public class VacinaValidator {

    public void validarVacina(VacinaEntrada vacinaEntrada) {

        if (vacinaEntrada.getNomeVacina() == null || vacinaEntrada.getNomeVacina().isBlank()) {
            throw new DadosInvalidosException("Nome vacina inválido");
        }

        if (vacinaEntrada.getUsuario() == null || vacinaEntrada.getUsuario().isBlank()) {
            throw new DadosInvalidosException("Email usuario inválido");
        }
    }
}
