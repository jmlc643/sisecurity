package com.upao.pe.backiot.controllers;

import com.upao.pe.backiot.models.ComponenteValor;
import com.upao.pe.backiot.services.ComponenteValorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("componente-valor")
public class ComponenteValorController {
    @Autowired
    private ComponenteValorService componenteValorService;

    // Obtener el estado de un LED
    @GetMapping("/{name}")
    public ComponenteValor getComponenteValor(@PathVariable String name) {
        return componenteValorService.getComponenteState(name);
    }

    // Actualizar el estado de un LED
    @PostMapping("/{name}")
    public ComponenteValor updateComponentState(@PathVariable String name, @RequestParam double value) {
        return componenteValorService.updateComponenteState(name, value);
    }
}
