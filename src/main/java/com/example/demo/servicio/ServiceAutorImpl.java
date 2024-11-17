package com.example.demo.servicio;


import com.example.demo.model.Autor;
import com.example.demo.repository.IAuthorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ServiceAutorImpl implements IServiceAutor{

    @Autowired
    private IAuthorRepo repo;

    @Override
    public List<Autor> getAll() {
        return repo.findAll();
    }

    @Override
    public void save(Autor autor) {
        repo.save(autor);
    }

    @Override
    public void delete(UUID uuid) {
        repo.deleteById(uuid);
    }

    @Override
    public Autor update(Autor autor) {
        return repo.save(autor);
    }

    @Override
    public Autor findById(UUID uuid) {
        return repo.findById(uuid).get();
    }
}
