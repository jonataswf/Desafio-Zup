package br.com.zup.desafio.facade;

import br.com.zup.desafio.entity.UsuarioEntity;
import br.com.zup.desafio.mapper.UsuarioMapper;
import br.com.zup.desafio.model.UsuarioEntrada;
import br.com.zup.desafio.model.UsuarioSaida;
import br.com.zup.desafio.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioFacade {

    @Autowired
    UsuarioRepository usuarioRepository;

    public UsuarioSaida cadastrarUsuario(UsuarioEntrada usuarioEntrada) {
        UsuarioEntity usuarioEntity = UsuarioMapper.MAPPER.toEntity(usuarioEntrada);
        return UsuarioMapper.MAPPER.toSaida(usuarioRepository.save(usuarioEntity));
    }
}
