package com.unir.eess.model.db;

import jakarta.persistence.*;
import lombok.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Set;

@Entity
@Table(name = "rotulos")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Rotulo {

    @Id
    @Column(name = "rotulo_ID")
    private Integer rotuloID;

    @Column(name = "rotulo", length = 100)
    private String rotulo;

    @JsonIgnore
    @OneToMany(mappedBy = "rotulo")
    private Set<Estacion> estaciones;

}
