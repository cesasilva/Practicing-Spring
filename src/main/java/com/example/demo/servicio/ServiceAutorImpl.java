package com.example.demo.servicio;


import com.example.demo.dto.AutorLibroDTO;
import com.example.demo.model.Autor;
import com.example.demo.repository.IAuthorRepo;
import com.example.demo.repository.ILibroRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServiceAutorImpl implements IServiceAutor{

    @Autowired
    private IAuthorRepo repoAutor;

    @Autowired
    private ILibroRepo repoLibro;

    @Override
    public List<Autor> getAll() {
        return repoAutor.findAll();
    }

    @Override
    public void save(Autor autor) {
        repoAutor.save(autor);
    }

    @Override
    public void delete(UUID uuid) {
        repoAutor.deleteById(uuid);
    }

    @Override
    public Autor update(Autor autor) {
        return repoAutor.save(autor);
    }

    @Override
    public Autor findById(UUID uuid) {
        return repoAutor.findById(uuid).get();
    }

    @Override
    public void createAutorLibro(AutorLibroDTO autorLibroDTO) {
        Autor autor = repoAutor.findById(autorLibroDTO.getAutorDTO().getId()).get();
        if (autor == null) {
            repoAutor.save(autor);
        }
    }
}
