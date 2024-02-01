package com.unir.eess.service;

import com.unir.eess.model.db.ElasticEstacion;
import com.unir.eess.model.db.Estacion;

import java.util.List;

public interface ElasticEstacionService {
    ElasticEstacion getEstacionById(String id);
    ElasticEstacion getEstacionByEstacionID(Integer estacionID);
    List<ElasticEstacion> searchEstacionByDireccion(String direccion);
    ElasticEstacion volcarEstacion(Estacion estacion);
    List<ElasticEstacion> findAll();
}
