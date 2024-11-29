package com.upao.pe.backiot.services;

import com.upao.pe.backiot.dto.EventoDTO;
import com.upao.pe.backiot.models.Evento;
import com.upao.pe.backiot.repos.EventoRepository;
import com.upao.pe.backiot.util.DateConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Service
public class EventoService {

    @Autowired
    EventoRepository eventoRepository;

    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");

    // Obtener el estado de un LED
    public List<EventoDTO> getEventos() {
        return eventoRepository.findFirst10ByOrderByFechaDesc().stream().map(this::returnEventoDTO).toList();
    }

    // Cambiar el estado de un LED
    public Evento crearEvento(String descripcion) {
        return eventoRepository.save(new Evento(null, descripcion, LocalDateTime.now()));
    }

    private EventoDTO returnEventoDTO(Evento evento){
        return new EventoDTO(evento.getIdEvento(), evento.getDescripcion(), dateFormat.format(DateConverter.toDate(evento.getFecha())));
    }
}
