package com.example.demo.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Autor extends Identifiable{

    /*@Id
    private String id;
    */
    @Column(name="primerapellido")
    private String primerApellido;

    @Column(name="primernombre")
    private String primerNombre;
}
