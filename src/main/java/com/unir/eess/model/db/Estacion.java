package com.unir.eess.model.db;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

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
	private Integer estacionID;

	@ManyToOne
	@JoinColumn(name = "rotulo_ID")
	private Rotulo rotulo;

	@ManyToOne
	@JoinColumn(name = "cp_ID")
	private CodigoPostal codigoPostal;

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

	@JsonIgnore
	@OneToMany(mappedBy = "estacion")
	private Set<Precio> precios;
}

enum Tipo {
	M, // Marítima
	T // Terrestre
}
