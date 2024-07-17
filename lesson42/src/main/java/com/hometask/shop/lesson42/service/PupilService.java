package com.hometask.shop.lesson42.service;

import com.hometask.shop.lesson42.domain.PupilEntity;
import com.hometask.shop.lesson42.dto.PupilDto;

import java.util.List;
import java.util.UUID;

/*
Получение всех учеников
Получение ученика по ид
Регистрация ученика
Обновление сведений об ученике
Удаление ученика
Поиск учеников по номеру класса
 */

public interface PupilService {

  public List<PupilDto> getAll();

  public PupilDto findById (UUID id);

  public PupilDto save(PupilDto pupilDto);

  public PupilDto update(UUID id,PupilDto pupilDto);

  public void delete(UUID id);

  public List<PupilDto> getByClassNum (Integer classNum);



}







