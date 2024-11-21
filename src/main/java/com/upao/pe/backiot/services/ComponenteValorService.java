package com.upao.pe.backiot.services;

import com.upao.pe.backiot.models.ComponenteValor;
import com.upao.pe.backiot.repos.ComponenteValorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponenteValorService {

    @Autowired
    ComponenteValorRepository componenteValorRepository;

    // Obtener el estado de un LED
    public ComponenteValor getComponenteState(String name) {
        return componenteValorRepository.findByName(name);
    }

    // Cambiar el estado de un LED
    public ComponenteValor updateComponenteState(String name, double value) {
        ComponenteValor componenteValor = componenteValorRepository.findByName(name);
        if (componenteValor == null) {
            componenteValor = new ComponenteValor();
            componenteValor.setName(name);
        }
        componenteValor.setValue(value);
        return componenteValorRepository.save(componenteValor);
    }
}
