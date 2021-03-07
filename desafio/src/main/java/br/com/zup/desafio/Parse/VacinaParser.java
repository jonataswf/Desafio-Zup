package br.com.zup.desafio.Parse;

import br.com.zup.desafio.entity.usuarios.UsuarioEntity;
import br.com.zup.desafio.entity.vacinas.VacinaEntity;
import br.com.zup.desafio.exception.DadosInvalidosException;
import br.com.zup.desafio.model.vacinas.VacinaEntrada;
import br.com.zup.desafio.model.vacinas.VacinaSaida;
import br.com.zup.desafio.repository.usuarios.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.persistence.EntityNotFoundException;

@Component
public class VacinaParser {

    @Autowired
    UsuarioRepository usuarioRepository;

    public VacinaEntity toEntity(VacinaEntrada vacinaEntrada) {
        VacinaEntity vacinaEntity = new VacinaEntity();
        try {
            UsuarioEntity usuario = usuarioRepository.getOne(vacinaEntrada.getUsuario());
            vacinaEntity.setNomeVacina(vacinaEntrada.getNomeVacina());
            vacinaEntity.setUsuario(usuario);
            vacinaEntity.setNomeUsuario(usuario.getNome());
            vacinaEntity.setEmail(usuario.getEmail());
            vacinaEntity.setCpf(usuario.getCpf());
            vacinaEntity.setDataNascimento(usuario.getDataNascimento());
        } catch (EntityNotFoundException e) {
            throw new DadosInvalidosException("Id Usuario não encontrado ou inválido");
        }
        return vacinaEntity;
    }

    public VacinaSaida toSaida(VacinaEntity vacinaEntity) {
        VacinaSaida vacinaSaida = new VacinaSaida();
        vacinaSaida.setId(vacinaEntity.getId());
        vacinaSaida.setNomeVacina(vacinaEntity.getNomeVacina());
        vacinaSaida.setDataAplicacao(vacinaEntity.getDataAplicacao());
        vacinaSaida.setUsuario(vacinaEntity.getUsuario().getId());
        vacinaSaida.setNomeUsuario(vacinaEntity.getNomeUsuario());
        vacinaSaida.setEmail(vacinaEntity.getEmail());
        vacinaSaida.setCpf(vacinaEntity.getCpf());
        vacinaSaida.setDataNascimento(vacinaEntity.getDataNascimento());
        return vacinaSaida;
    }
}