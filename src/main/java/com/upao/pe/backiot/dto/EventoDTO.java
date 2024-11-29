package com.upao.pe.backiot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventoDTO {
    private Long idEvento;
    private String descripcion;
    private String fecha;
}
