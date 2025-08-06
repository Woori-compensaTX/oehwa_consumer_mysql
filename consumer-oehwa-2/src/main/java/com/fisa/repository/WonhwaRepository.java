package com.fisa.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.fisa.entity.Wonhwa;

public interface WonhwaRepository extends JpaRepository<Wonhwa, Integer> {
    // guid로 Wonhwa 단건 조회
    Optional<Wonhwa> findByGuid(String guid);
}
