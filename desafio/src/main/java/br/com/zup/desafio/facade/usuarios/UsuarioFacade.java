package br.com.zup.desafio.facade.usuarios;

import br.com.zup.desafio.Parse.UsuarioParser;
import br.com.zup.desafio.entity.usuarios.UsuarioEntity;
import br.com.zup.desafio.exception.DadosInvalidosException;
import br.com.zup.desafio.model.usuarios.UsuarioEntrada;
import br.com.zup.desafio.model.usuarios.UsuarioSaida;
import br.com.zup.desafio.repository.usuarios.UsuarioRepository;
import br.com.zup.desafio.validator.usuarios.UsuarioValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.NonUniqueResultException;
import java.util.Optional;

@Service
public class UsuarioFacade {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioParser usuarioParser;

    @Autowired
    UsuarioValidator usuarioValidator;

    public UsuarioSaida cadastrarUsuario(UsuarioEntrada usuarioEntrada) {
        usuarioValidator.validarUsuario(usuarioEntrada);
        try {
            Optional<UsuarioEntity> emailOuCpfCadastrado = usuarioRepository.
                    findByEmailOrCpf(usuarioEntrada.getEmail(), usuarioEntrada.getCpf());
            if (emailOuCpfCadastrado.isPresent()) {
                throw new DadosInvalidosException("Email e/ou CPF já cadastrado");
            }
            UsuarioEntity usuarioEntity = usuarioParser.toEntity(usuarioEntrada);
            return usuarioParser.toSaida(usuarioRepository.save(usuarioEntity));
        } catch (NonUniqueResultException e) {
            throw new DadosInvalidosException("Email e/ou CPF já cadastrado");
        }
    }
}
