package com.pinilla.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.myapp.model.entity.Producto;
public interface ProductoRepository extends JpaRepository<Producto, Long> {
    // Métodos adicionales de consulta si es necesario
}