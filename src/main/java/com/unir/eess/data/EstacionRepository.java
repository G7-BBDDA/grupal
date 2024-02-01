package com.unir.eess.data;

import com.unir.eess.model.db.Estacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstacionRepository extends JpaRepository<Estacion, Integer> {
	List<Estacion> findByDireccion(String direccion);
}
