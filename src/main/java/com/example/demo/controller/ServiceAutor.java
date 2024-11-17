package com.example.demo.controller;

import com.example.demo.model.Autor;
import com.example.demo.servicio.IServiceAutor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/autor")
public class ServiceAutor {

    @Autowired
    private IServiceAutor serviceAutor;

    @GetMapping("/all")
    public List<Autor> getAll() {
        return serviceAutor.getAll();
    }

    //Datos a guardar o actualizar tienen que ir con un post

    @PostMapping("/create")
    public void createAutor(@RequestBody Autor autor) {
        serviceAutor.save(autor);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteAutor(@PathVariable("id") UUID id) {
        serviceAutor.delete(id);
    }

    @PutMapping("/update")
    public Autor updateAutor(@RequestBody Autor autor) {
        return serviceAutor.update(autor);
    }

    @GetMapping("/{id}")
    public Autor findById(@PathVariable("id") UUID id) {
        return serviceAutor.findById(id);
    }

}
