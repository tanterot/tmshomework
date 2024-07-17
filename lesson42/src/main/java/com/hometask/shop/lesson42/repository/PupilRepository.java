package com.hometask.shop.lesson42.repository;


import com.hometask.shop.lesson42.domain.PupilEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface PupilRepository extends JpaRepository<PupilEntity, UUID> {

    public List<PupilEntity> getPupilEntitiesByClassNum (Integer classNum);
}
