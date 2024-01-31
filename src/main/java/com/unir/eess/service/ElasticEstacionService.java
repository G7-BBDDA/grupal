package com.unir.eess.service;

import com.unir.eess.model.db.ElasticEstacion;

import java.util.List;

public interface ElasticEstacionService {
    ElasticEstacion getEstacionById(String id);
    ElasticEstacion getEstacionByEstacionID(Integer estacionID);
    List<ElasticEstacion> searchEstacionByDireccion(String direccion);
}
