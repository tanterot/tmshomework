package com.hometask.shop.lesson42.service.impl;


import com.hometask.shop.lesson42.domain.PupilEntity;
import com.hometask.shop.lesson42.dto.PupilDto;
import com.hometask.shop.lesson42.mapper.PupilMapper;
import com.hometask.shop.lesson42.repository.PupilRepository;
import com.hometask.shop.lesson42.service.PupilService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PupilServiceImpl implements PupilService {

    private final PupilRepository pupilRepo;
    private final PupilMapper mapper;


    @Override
    public List<PupilDto> getAll() {
        return mapper.toDtos(pupilRepo.findAll());
    }


    @Override
    public PupilDto findById(UUID id) {
        return pupilRepo.findById(id)
                .map(mapper::toDto)
                .orElseThrow(() -> new RuntimeException("Pupil not found"));
    }

    @Override
    public PupilDto save(PupilDto dto) {
        return mapper.toDto(pupilRepo.save(mapper.toEntity(dto)));
    }

    @Override
    public PupilDto update(UUID id,PupilDto dto) {
        Optional<PupilEntity> byId = pupilRepo.findById(id);
        if(byId.isPresent()){
            PupilEntity pupilEntity = byId.get();
            pupilEntity.setName(dto.getName());
            pupilEntity.setLastName(dto.getLastName());
            pupilEntity.setAddress(dto.getAddress());
            pupilEntity.setSex(dto.getSex());
            pupilEntity.setBirthDate(dto.getBirthDate());
            pupilRepo.save(pupilEntity);
            return mapper.toDto(pupilEntity);
        }
        throw new RuntimeException("Pupil not found");
    }

    @Override
    public void delete(UUID id) {
        Optional<PupilEntity> byId = pupilRepo.findById(id);
        if(byId.isPresent()){
            pupilRepo.deleteById(id);
        }
        if(byId.isEmpty()){
        throw new RuntimeException("Pupil not found");}
    }




    @Override
    public List<PupilDto> getByClassNum(Integer classNum) {
        List<PupilEntity> pupilEntitiesByClassNum = pupilRepo.getPupilEntitiesByClassNum(classNum);
        if(pupilEntitiesByClassNum.isEmpty()){
            throw new RuntimeException("Pupil not found");
        }
        return mapper.toDtos(pupilEntitiesByClassNum);
    }
}


