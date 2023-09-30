package edu.pe.cibertec.apirestcibertec.service;

import edu.pe.cibertec.apirestcibertec.model.MensajeResponse;
import org.springframework.stereotype.Service;

import javax.swing.*;

@Service
public class MatematicaService {

    public MensajeResponse estacionamiento(Integer numero1, Integer numero2){
        return MensajeResponse.builder().resultadoEstacionamineto(Integer.valueOf("El precio que debe es: " + (numero1 + numero2))).build();
    }

    // eliminar nota mas baja y sacar el promedio de las notas restantes
    public MensajeResponse promedioCibertec(Integer nota1,Integer nota2,Integer nota3){
        Double promedioFinal = (nota1 *0.15) + (nota2 * 0.2) + (nota3 * 0.5);
        return MensajeResponse.builder().resultado(Double.valueOf("Su promedio es: " + promedioFinal)).build();
    }



    // si su año de nacimiento es menor que 2005 , indicar que tiene que mostrar su dni


    // precio>200 = descuento 20% , el total se obtiene de la cantidad y el precio que se ingresa








}
