package br.com.zup.desafio.controller;

import br.com.zup.desafio.facade.UsuarioFacade;
import br.com.zup.desafio.model.UsuarioEntrada;
import br.com.zup.desafio.model.UsuarioSaida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class VacinaController {

    @Autowired
    UsuarioFacade usuarioFacade;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/cadastrarusuario")
    public UsuarioSaida cadastrarUsuario(@RequestBody UsuarioEntrada usuarioEntrada) {
        return usuarioFacade.cadastrarUsuario(usuarioEntrada);
    }
}
