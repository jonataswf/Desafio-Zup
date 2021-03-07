package br.com.zup.desafio.facade.vacinas;

import br.com.zup.desafio.Parse.VacinaParser;
import br.com.zup.desafio.entity.vacinas.VacinaEntity;
import br.com.zup.desafio.model.vacinas.VacinaEntrada;
import br.com.zup.desafio.model.vacinas.VacinaSaida;
import br.com.zup.desafio.repository.vacinas.VacinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class VacinaFacade {

    @Autowired
    VacinaRepository vacinaRepository;

    @Autowired
    VacinaParser vacinaParser;

    public VacinaSaida cadastroAplicacoesVacinas(VacinaEntrada vacinaEntrada) {
        VacinaEntity vacinaEntity = vacinaParser.toEntity(vacinaEntrada);
        vacinaEntity.setDataAplicacao(LocalDateTime.now());
        return vacinaParser.toSaida(vacinaRepository.save(vacinaEntity));
    }
}
