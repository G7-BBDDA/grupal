package com.unir.eess.model.db;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Table(name = "estaciones")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Estacion {

	@Id
	@Column(name = "estacion_ID")
	private Integer estacion_ID;

	@Column(name = "rotulo_ID")
	private Integer rotulo_ID;

	@Column(name = "cp_ID", length = 5)
	private String cp_ID;

	@Column(name = "direccion", length = 150)
	private String direccion;

	@Column(name = "margen")
	private Character margen;

	@Column(name = "longitud")
	private Double longitud;

	@Column(name = "latitud")
	private Double latitud;

	@Column(name = "horario", length = 100)
	private String horario;

	@Enumerated(EnumType.STRING)
	@Column(columnDefinition = "ENUM('M', 'T')")
	private Tipo tipo;

//	@JsonIgnore
//	@OneToMany(mappedBy = "employee")
//	private Set<DeptEmp> deptEmps;
//
//	@JsonIgnore
//	@OneToMany(mappedBy = "employee")
//	private Set<DeptManager> deptManagers;
}

enum Tipo {
	M, // Marítima
	T // Terrestre
}
