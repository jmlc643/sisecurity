package com.upao.pe.backiot.controllers;

import com.upao.pe.backiot.models.ComponenteEstado;
import com.upao.pe.backiot.services.ComponenteEstadoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("componente-estado")
public class LedController {
    @Autowired
    private ComponenteEstadoService componenteEstadoService;

    // Obtener el estado de un LED
    @GetMapping("/{name}")
    public ComponenteEstado getComponenteState(@PathVariable String name) {
        return componenteEstadoService.getComponenteState(name);
    }

    // Actualizar el estado de un LED
    @PostMapping("/{name}")
    public ComponenteEstado updateComponentState(@PathVariable String name, @RequestParam boolean state) {
        return componenteEstadoService.updateComponenteState(name, state);
    }
}

