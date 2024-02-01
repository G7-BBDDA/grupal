package com.unir.eess.controller;

import com.unir.eess.data.ElasticEstacionRepository;
import com.unir.eess.data.EstacionRepository;
import com.unir.eess.model.db.ElasticEstacion;
import com.unir.eess.model.db.Estacion;
import com.unir.eess.service.ElasticEstacionService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/elastic/estaciones")
@RequiredArgsConstructor
public class ElasticEstacionController {

    private final ElasticEstacionService elasticEstacionService;
    private final EstacionRepository estacionRepository;

    @GetMapping("/id/{id}")
    public ResponseEntity<ElasticEstacion> getEstacionByEstacionID(@PathVariable("id") String id) {
        ElasticEstacion estacion = elasticEstacionService.getEstacionById(id);

        if (estacion != null) {
            return ResponseEntity.ok(estacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{estacionID}")
    public ResponseEntity<ElasticEstacion> getEstacionByEstacionID(@PathVariable("estacionID") Integer estacionID) {
        ElasticEstacion estacion = elasticEstacionService.getEstacionByEstacionID(estacionID);

        if (estacion != null) {
            return ResponseEntity.ok(estacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/match/{direccion}")
    public ResponseEntity<List<ElasticEstacion>> getEstacionByDireccion(@PathVariable("direccion") String direccion) {
        List<ElasticEstacion> estacion = elasticEstacionService.searchEstacionByDireccion(direccion);

        if (estacion != null) {
            return ResponseEntity.ok(estacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/search/{direccion}")
    public ResponseEntity<List<ElasticEstacion>> searchByDireccion(@PathVariable("direccion") String direccion) {
        List<ElasticEstacion> estacion = elasticEstacionService.searchEstacionByDireccion(direccion);

        if (estacion != null) {
            return ResponseEntity.ok(estacion);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/bulk")
    public ResponseEntity<List<ElasticEstacion>> bulk() {
        List<ElasticEstacion> estacion;
        List<Estacion> estacionMysql = estacionRepository.findAll();

        for (Estacion e : estacionMysql) {
            elasticEstacionService.volcarEstacion(e);
        }
        estacion = elasticEstacionService.findAll();
        return ResponseEntity.ok(estacion);
    }
/*
    @PostMapping("/save")
    public ResponseEntity<ElasticEstacion> getEstacion(@RequestBody CreateProductRequest request) {
        ElasticEstacion createdEstacion = elasticEstacionRepository.findByDireccion(direccion);

        if (createdEstacion != null) {
            return createdEstacion;
        } else {
            return null;
        }
    }
*/

}
