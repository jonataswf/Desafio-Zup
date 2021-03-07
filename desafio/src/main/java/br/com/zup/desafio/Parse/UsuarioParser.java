package br.com.zup.desafio.Parse;

import br.com.zup.desafio.entity.usuarios.UsuarioEntity;
import br.com.zup.desafio.model.usuarios.UsuarioEntrada;
import br.com.zup.desafio.model.usuarios.UsuarioSaida;
import org.springframework.stereotype.Component;

@Component
public class UsuarioParser {

    public UsuarioEntity toEntity(UsuarioEntrada usuarioEntrada) {
        UsuarioEntity usuarioEntity = new UsuarioEntity();
        usuarioEntity.setNome(usuarioEntrada.getNome());
        usuarioEntity.setEmail(usuarioEntrada.getEmail());
        usuarioEntity.setCpf(usuarioEntrada.getCpf());
        usuarioEntity.setDataNascimento(usuarioEntrada.getDataNascimento());
        return usuarioEntity;
    }

    public UsuarioSaida toSaida(UsuarioEntity usuarioEntity) {
        UsuarioSaida usuarioSaida = new UsuarioSaida();
        usuarioSaida.setId(usuarioEntity.getId());
        usuarioSaida.setNome(usuarioEntity.getNome());
        usuarioSaida.setEmail(usuarioEntity.getEmail());
        usuarioSaida.setCpf(usuarioEntity.getCpf());
        usuarioSaida.setDataNascimento(usuarioEntity.getDataNascimento());
        return usuarioSaida;
    }
}