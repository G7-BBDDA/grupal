package com.unir.eess.model.db;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Set;

@Document(indexName = "estaciones",createIndex = true)
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ElasticEstacion {

	@Id
	private String id;

	@Field(type = FieldType.Integer, name = "estacionID")
	private Integer estacionID;

	@Field(type = FieldType.Text, name = "rotulo")
	private Rotulo rotulo;

	@Field(type = FieldType.Text, name = "codigoPostal")
	private CodigoPostal codigoPostal;

	@Field(type = FieldType.Search_As_You_Type, name = "direccion")
	private String direccion;

	@Field(type = FieldType.Keyword, name = "margen")
	private Character margen;

	@Field(type = FieldType.Double, name = "longitud")
	private Double longitud;

	@Field(type = FieldType.Double, name = "latitud")
	private Double latitud;

	@Field(type = FieldType.Text, name = "horario")
	private String horario;

	@Field(type = FieldType.Keyword, name = "tipo")
	private ElasticTipo tipo;

}

enum ElasticTipo {
	M, // Marítima
	T // Terrestre
}
