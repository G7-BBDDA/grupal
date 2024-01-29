package com.unir.eess.model.db;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "precios")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Precio {

    @Id
    @ManyToOne
    @JoinColumn(name = "estacion_ID")
    private Estacion estacion;

    @Column(name = "carburante_ID", length = 50)
    private String carburanteID;

    @Temporal(TemporalType.DATE)
    @Column(name = "fecha")
    private Date fecha;

    @Column(name = "precio")
    private Double precio;

    @Column(name = "localidad", length = 50)
    private String localidad;

    //@JsonIgnore
    //@OneToMany(mappedBy = "precio")
    //private Set<Estacion> estaciones;

}
