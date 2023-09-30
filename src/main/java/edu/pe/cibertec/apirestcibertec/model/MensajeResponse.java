package edu.pe.cibertec.apirestcibertec.model;

import lombok.Builder;
import lombok.Data;

import javax.swing.*;

@Data
@Builder
public class MensajeResponse {

    private Double resultado;
    private Integer resultadoEstacionamineto;

}
