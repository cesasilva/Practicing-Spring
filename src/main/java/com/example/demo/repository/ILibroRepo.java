package com.example.demo.repository;

import com.example.demo.model.Libro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ILibroRepo extends JpaRepository<Libro, UUID> {
}
