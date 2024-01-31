package com.unir.eess.service;

import com.unir.eess.data.ElasticEstacionRepository;
import com.unir.eess.data.ElasticsearchRepository;
import com.unir.eess.model.db.ElasticEstacion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ElasticEstacionServiceImpl implements ElasticEstacionService{
    private final ElasticsearchRepository repo;

    @Override
    public ElasticEstacion getEstacionById(String id) {
        return repo.getEstacionById(id);
    }
    @Override
    public ElasticEstacion getEstacionByEstacionID(Integer estacionID) {
        return repo.getEstacionByEstacionID(estacionID);
    }
    @Override
    public List<ElasticEstacion> searchEstacionByDireccion(String direccion) {
        return repo.searchByDireccion(direccion);
    }

//    @Override
//    public ElasticEstacion createEstacion(CreateEstacionRequest createEstacionRequest) {
//        return null;
//    }
}
