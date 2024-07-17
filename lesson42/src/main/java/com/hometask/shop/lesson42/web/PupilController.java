package com.hometask.shop.lesson42.web;

import com.hometask.shop.lesson42.dto.PupilDto;
import com.hometask.shop.lesson42.service.PupilService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

@RestController
@RequiredArgsConstructor
@RequestMapping("/pupil")
public class PupilController {
    private final PupilService service;

    @GetMapping
    public List<PupilDto> getAll() {
        return service.getAll();

    }

    @GetMapping("/{id}")
    public PupilDto getById(@PathVariable(name = "id") UUID id) {
        return service.findById(id);
    }

    @PostMapping
    public PupilDto save(@RequestBody PupilDto dto) {
        return service.save(dto);
    }

    @PutMapping("/{id}")
    public PupilDto update(@PathVariable(name = "id") UUID id,@RequestBody PupilDto dto) {
        return service.update(id,dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable(name = "id") UUID id) {
        service.delete(id);
    }

    @GetMapping("/search/{classNumber}")
    public List<PupilDto> getByNum(@PathVariable(name = "classNumber")Integer classNum) {
        return service.getByClassNum(classNum);
    }



}
