package br.com.zup.desafio.mapper;

import br.com.zup.desafio.entity.UsuarioEntity;
import br.com.zup.desafio.model.UsuarioEntrada;
import br.com.zup.desafio.model.UsuarioSaida;
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
