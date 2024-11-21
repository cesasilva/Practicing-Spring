package com.example.demo.servicio;

import com.example.demo.dto.AutorLibroDTO;
import com.example.demo.model.Autor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public interface IServiceAutor {

    List<Autor> getAll();

    void save(Autor autor);

    void delete (UUID uuid);

    Autor update(Autor autor);

    Autor findById(UUID uuid);

    void createAutorLibro (AutorLibroDTO autorLibroDTO);

}
