package br.com.zup.desafio.facade.usuarios;

import br.com.zup.desafio.Parse.UsuarioParser;
import br.com.zup.desafio.entity.usuarios.UsuarioEntity;
import br.com.zup.desafio.model.usuarios.UsuarioEntrada;
import br.com.zup.desafio.model.usuarios.UsuarioSaida;
import br.com.zup.desafio.repository.usuarios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFacade {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioParser usuarioParser;

    public UsuarioSaida cadastrarUsuario(UsuarioEntrada usuarioEntrada) {
        UsuarioEntity usuarioEntity = usuarioParser.toEntity(usuarioEntrada);
        return usuarioParser.toSaida(usuarioRepository.save(usuarioEntity));
    }
}
