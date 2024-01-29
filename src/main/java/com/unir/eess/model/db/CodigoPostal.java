package com.unir.eess.model.db;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

@Entity
@Table(name = "codigos_postales")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class CodigoPostal {

    @Id
    @Column(name = "cp_ID", length = 5)
    private String cpID;

    @Column(name = "provincia", length = 50)
    private String provincia;

    @Column(name = "municipio", length = 100)
    private String municipio;

    @Column(name = "localidad", length = 50)
    private String localidad;

    @JsonIgnore
    @OneToMany(mappedBy = "codigoPostal")
    private Set<Estacion> estaciones;

}
