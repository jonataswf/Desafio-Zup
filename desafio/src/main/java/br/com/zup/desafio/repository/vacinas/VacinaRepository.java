package br.com.zup.desafio.repository.vacinas;

import br.com.zup.desafio.entity.vacinas.VacinaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacinaRepository extends JpaRepository<VacinaEntity, Integer> {

}
