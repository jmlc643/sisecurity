package com.upao.pe.backiot.services;

import com.upao.pe.backiot.models.Led;
import com.upao.pe.backiot.repos.LedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LedService {
    @Autowired
    private LedRepository ledRepository;

    // Obtener el estado de un LED
    public Led getLedState(String name) {
        return ledRepository.findByName(name);
    }

    // Cambiar el estado de un LED
    public Led updateLedState(String name, boolean state) {
        Led led = ledRepository.findByName(name);
        if (led == null) {
            led = new Led();
            led.setName(name);
        }
        led.setState(state);
        return ledRepository.save(led);
    }
}

