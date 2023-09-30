package edu.pe.cibertec.apirestcibertec.service;

import edu.pe.cibertec.apirestcibertec.model.MensajeResponse;
import org.springframework.stereotype.Service;

@Service
public class MatematicaService {

    public MensajeResponse estacionamiento(Integer numero1, Integer numero2){
        return MensajeResponse.builder().resultadoEstacionamineto(Integer.valueOf("El precio que debe es: " + (numero1 + numero2))).build();
    }




}
