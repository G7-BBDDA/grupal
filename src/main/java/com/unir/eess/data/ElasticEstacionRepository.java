package com.unir.eess.data;

import com.unir.eess.model.db.ElasticEstacion;
import com.unir.eess.model.db.Estacion;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ElasticEstacionRepository extends ElasticsearchRepository<ElasticEstacion, Integer> {
	ElasticEstacion findById(String id);
	ElasticEstacion findByEstacionID(Integer estacionID);
	List<ElasticEstacion> findByDireccion(String direccion);
}
