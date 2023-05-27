package com.example.SpringBoot_s456.entities;

import jakarta.persistence.*;

@Entity
@Table(name ="laptops")
public class Laptop {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String marca;
    private Integer ram;
    private Double precio;

    public Laptop(){}
    public Laptop(Long id, String marca, Integer ram, Double precio) {
        this.id = id;
        this.marca = marca;
        this.ram = ram;
        this.precio = precio;
    }
    public Long getId() {return id;}
    public void setId(Long id) {this.id = id;}
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}
    public Integer getRam() {return ram;}
    public void setRam(Integer ram) {this.ram = ram;}
    public Double getPrecio() {return precio;}
    public void setPrecio(Double precio) {this.precio = precio;}

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", ram=" + ram +
                ", precio=" + precio +
                '}';
    }
}
