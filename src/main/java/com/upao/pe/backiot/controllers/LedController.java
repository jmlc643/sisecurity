package com.upao.pe.backiot.controllers;

import com.upao.pe.backiot.models.Led;
import com.upao.pe.backiot.services.LedService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("led")
public class LedController {
    @Autowired
    private LedService ledService;

    // Obtener el estado de un LED
    @GetMapping("/{name}")
    public Led getLedState(@PathVariable String name) {
        return ledService.getLedState(name);
    }

    // Actualizar el estado de un LED
    @PostMapping("/{name}")
    public Led updateLedState(@PathVariable String name, @RequestParam boolean state) {
        return ledService.updateLedState(name, state);
    }
}

