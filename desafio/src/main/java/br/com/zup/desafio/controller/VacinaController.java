package br.com.zup.desafio.controller;

import br.com.zup.desafio.facade.vacinas.VacinaFacade;
import br.com.zup.desafio.model.vacinas.VacinaEntrada;
import br.com.zup.desafio.model.vacinas.VacinaSaida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class VacinaController {

    @Autowired
    VacinaFacade vacinaFacade;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/cadastrarvacina")
    public VacinaSaida cadastroAplicacoesVacinas(@RequestBody VacinaEntrada vacinaEntrada){
        return vacinaFacade.cadastroAplicacoesVacinas(vacinaEntrada);
    }
}
