package edu.pe.cibertec.apirestcibertec.controller;

import edu.pe.cibertec.apirestcibertec.model.MensajeResponse;
import edu.pe.cibertec.apirestcibertec.service.MatematicaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping(path = "api/v1/matematica")
public class MatematicaController {
    private MatematicaService matematicaService;

    @GetMapping("/estacionamiento")
    public ResponseEntity<MensajeResponse> estacionamiento(@RequestParam Integer numero1,
                                                @RequestParam Integer numero2){
        return new ResponseEntity<>(
                matematicaService.estacionamiento(numero1, numero2), HttpStatus.OK );
    }


}
