package com.unir.eess.data;

import com.unir.eess.model.db.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstacionRepository extends JpaRepository<Estacion, Integer> {

	//Documentacion sobre Derivacion de consultas: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.query-creation
	//Documentacion sobre consultas nativas: https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#jpa.query-methods.at-query

	// Método para buscar estaciones por dirección
	List<Estacion> findByDireccion(String direccion);
}
