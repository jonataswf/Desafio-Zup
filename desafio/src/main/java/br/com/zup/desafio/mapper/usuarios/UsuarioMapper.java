package br.com.zup.desafio.mapper.usuarios;

import br.com.zup.desafio.entity.usuarios.UsuarioEntity;
import br.com.zup.desafio.model.usuarios.UsuarioEntrada;
import br.com.zup.desafio.model.usuarios.UsuarioSaida;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper
public interface UsuarioMapper {
    UsuarioMapper MAPPER = Mappers.getMapper(UsuarioMapper.class);

    UsuarioEntity toEntity(UsuarioEntrada usuarioEntrada);

    UsuarioSaida toSaida(UsuarioEntity usuarioEntity);

    List<UsuarioSaida> toSaida(List<UsuarioEntity> usuarioEntities);
}
