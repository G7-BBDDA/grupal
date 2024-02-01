package com.unir.eess.service;

import com.unir.eess.data.ElasticEstacionRepository;
import com.unir.eess.data.ElasticsearchRepository;
import com.unir.eess.model.db.ElasticEstacion;
import com.unir.eess.model.db.Estacion;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class ElasticEstacionServiceImpl implements ElasticEstacionService {
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

    public ElasticEstacion volcarEstacion(Estacion estacion) {
        ElasticEstacion elasticEstacion =
                ElasticEstacion.builder()
                        .estacionID(estacion.getEstacionID())
                        .rotulo(estacion.getRotulo().getRotulo())
                        .codigoPostal(estacion.getCodigoPostal().getCpID())
                        .direccion(estacion.getDireccion())
                        .localidad(estacion.getCodigoPostal().getLocalidad())
                        .municipio(estacion.getCodigoPostal().getMunicipio())
                        .provincia(estacion.getCodigoPostal().getProvincia())
                        .margen(estacion.getMargen())
                        .latitud(estacion.getLatitud())
                        .longitud(estacion.getLongitud())
                        .horario(estacion.getHorario())
                        .tipo(estacion.getTipo())
                        .build();
        return repo.save(elasticEstacion);
    }

    @Override
    public List<ElasticEstacion> findAll() {
        return repo.findAll();
    }

//    @Override
//    public ElasticEstacion createEstacion(CreateEstacionRequest createEstacionRequest) {
//        return null;
//    }
}
