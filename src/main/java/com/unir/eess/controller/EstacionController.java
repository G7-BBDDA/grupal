package com.unir.eess.controller;

import com.unir.eess.data.EstacionRepository;
import com.unir.eess.model.db.Estacion;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/estaciones")
@RequiredArgsConstructor
public class EstacionController {

    private final EstacionRepository estacionRepository;

    /**
     * Obtener una estacion por direccion.
     *
     * @param direccion - direccion de la estacion.
     * @return estacion.
     */
    @GetMapping("/{name}")
    public List<Estacion> getEstacionByDireccion(@PathVariable("name") String direccion) {
        //return ResponseEntity.ok(estacionRepository.findByDireccion(direccion).orElse(null));
        return estacionRepository.findByDireccion(direccion);
    }

}
