package com.upao.pe.backiot.repos;

import com.upao.pe.backiot.models.ComponenteEstado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponenteEstadoRepository extends JpaRepository<ComponenteEstado, Long> {
    ComponenteEstado findByName(String name); // Encontrar un LED por su nombre
}

