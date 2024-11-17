package com.upao.pe.backiot.repos;

import com.upao.pe.backiot.models.Led;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LedRepository extends JpaRepository<Led, Long> {
    Led findByName(String name); // Encontrar un LED por su nombre
}

