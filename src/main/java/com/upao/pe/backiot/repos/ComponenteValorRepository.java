package com.upao.pe.backiot.repos;

import com.upao.pe.backiot.models.ComponenteValor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComponenteValorRepository extends JpaRepository<ComponenteValor, Long> {
    ComponenteValor findByName(String name);
}
