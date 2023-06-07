package com.practicapreparcial.forrajeriaservice.model;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import org.springframework.data.annotation.Id;

@AllArgsConstructor
@Entity
public class Producto {
    @Id
    private Long id;

    private String nombre;
    private Double peso;
    private Double precio;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
