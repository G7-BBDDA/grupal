package com.unir.eess.data;

import com.unir.eess.model.db.ElasticEstacion;
import lombok.RequiredArgsConstructor;
import org.springframework.data.elasticsearch.core.ElasticsearchOperations;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class ElasticsearchRepository {

    private final String[] nameSearchFields = {"name.search", "name.search_2gram", "name..search_3gram"};

    private final ElasticEstacionRepository estacionRepository;
    private final ElasticsearchOperations elasticClient;

    public ElasticEstacion getEstacionById(String id) {
        return estacionRepository.findById(id);
    }
    public ElasticEstacion getEstacionByEstacionID(Integer estacionID) {
        return estacionRepository.findByEstacionID(estacionID);
    }

    public List<ElasticEstacion> searchByDireccion(String direccion) {
        return estacionRepository.findByDireccion(direccion);
    }
    public ElasticEstacion volcarEstacion(ElasticEstacion estacion) {
        return estacionRepository.save(estacion);
    }
    public List<ElasticEstacion> findAll() {
        return estacionRepository.findAll();
    }

    public ElasticEstacion save(ElasticEstacion elasticEstacion) {
        return estacionRepository.save(elasticEstacion);
    }
}
