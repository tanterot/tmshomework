package com.hometask.shop.lesson42.mapper;

import com.hometask.shop.lesson42.domain.PupilEntity;
import com.hometask.shop.lesson42.dto.PupilDto;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PupilMapper {

    PupilEntity toEntity(PupilDto dto);

    PupilDto toDto(PupilEntity entity);

    List<PupilDto> toDtos(List<PupilEntity> entities);

}
