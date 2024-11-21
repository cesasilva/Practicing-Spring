package com.example.demo.controller;

import com.example.demo.dto.AutorLibroDTO;
import com.example.demo.servicio.IServiceAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/autor-libro")
public class ServiceAutorLibro {

    @Autowired
    private IServiceAutor service;

    @PostMapping("/create")
    public void createAutorLibro(@RequestBody AutorLibroDTO autorLibroDTO) {
        service.createAutorLibro(autorLibroDTO);
    }

}
