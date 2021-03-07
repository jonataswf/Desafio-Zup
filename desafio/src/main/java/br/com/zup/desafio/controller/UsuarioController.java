package br.com.zup.desafio.controller;

import br.com.zup.desafio.facade.usuarios.UsuarioFacade;
import br.com.zup.desafio.model.usuarios.UsuarioEntrada;
import br.com.zup.desafio.model.usuarios.UsuarioSaida;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuarioController {

    @Autowired
    UsuarioFacade usuarioFacade;

    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping("/cadastrarusuario")
    public UsuarioSaida cadastrarUsuario(@RequestBody UsuarioEntrada usuarioEntrada) {
        return usuarioFacade.cadastrarUsuario(usuarioEntrada);
    }
}
