package br.com.zup.desafio.repository.usuarios;

import br.com.zup.desafio.entity.usuarios.UsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Integer> {

    Optional<UsuarioEntity> findByEmailOrCpf(String email, String cpf);
    UsuarioEntity findByEmail(String email);
}
