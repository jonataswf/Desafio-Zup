package br.com.zup.desafio.validator.usuarios;

import br.com.zup.desafio.exception.DadosInvalidosException;
import br.com.zup.desafio.model.usuarios.UsuarioEntrada;
import org.springframework.stereotype.Component;

@Component
public class UsuarioValidator {

    public void validarUsuario(UsuarioEntrada usuarioEntrada) {

        if (usuarioEntrada.getNome() == null || usuarioEntrada.getNome().isBlank()) {
            throw new DadosInvalidosException("Nome inválido");
        }

        if (usuarioEntrada.getEmail() == null || usuarioEntrada.getEmail().isBlank()) {
            throw new DadosInvalidosException("Email inválido");
        }

        if (usuarioEntrada.getCpf() == null || usuarioEntrada.getCpf().isBlank()) {
            throw new DadosInvalidosException("CPF inválido");
        }

        if (usuarioEntrada.getDataNascimento() == null || usuarioEntrada.getDataNascimento().isBlank()) {
            throw new DadosInvalidosException("Data de Nascimento inválida");
        }
    }
}
