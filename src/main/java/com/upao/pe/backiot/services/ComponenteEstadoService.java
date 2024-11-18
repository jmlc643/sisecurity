package com.upao.pe.backiot.services;

import com.upao.pe.backiot.models.ComponenteEstado;
import com.upao.pe.backiot.repos.ComponenteEstadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComponenteEstadoService {
    @Autowired
    private ComponenteEstadoRepository componenteEstadoRepository;

    // Obtener el estado de un LED
    public ComponenteEstado getComponenteState(String name) {
        return componenteEstadoRepository.findByName(name);
    }

    // Cambiar el estado de un LED
    public ComponenteEstado updateComponenteState(String name, boolean state) {
        ComponenteEstado componenteEstado = componenteEstadoRepository.findByName(name);
        if (componenteEstado == null) {
            componenteEstado = new ComponenteEstado();
            componenteEstado.setName(name);
        }
        componenteEstado.setState(state);
        return componenteEstadoRepository.save(componenteEstado);
    }
}

