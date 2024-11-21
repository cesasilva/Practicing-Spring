package com.example.demo.dto;

// Data Transfer Object
// No es una entidad

import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Getter @Setter
public class AutorLibroDTO {

    private AutorDTO autorDTO;
    private Set<LibroDTO> librosDTO;

}
