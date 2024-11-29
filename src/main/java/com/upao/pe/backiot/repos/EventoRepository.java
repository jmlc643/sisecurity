package com.upao.pe.backiot.repos;

import com.upao.pe.backiot.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Long> {

    List<Evento> findFirst10ByOrderByFechaDesc();
}
