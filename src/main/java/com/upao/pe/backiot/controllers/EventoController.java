package com.upao.pe.backiot.controllers;

import com.upao.pe.backiot.dto.EventoDTO;
import com.upao.pe.backiot.models.Evento;
import com.upao.pe.backiot.services.EventoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("evento")
public class EventoController {

    @Autowired
    EventoService eventoService;

    @GetMapping("/listar/")
    public List<EventoDTO> listarEventos(){
        return eventoService.getEventos();
    }

    @PostMapping("/crear/")
    public Evento crearEvento(@RequestBody String descripcion){
        return eventoService.crearEvento(descripcion);
    }
}
