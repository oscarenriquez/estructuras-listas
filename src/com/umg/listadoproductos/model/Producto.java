/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.listadoproductos.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author UMG - Progra 3 - Seccion A - Grupo 3
 */
public class Producto implements Serializable {

    private Integer codigo;
    private String nombre;
    private String marca;
    private BigDecimal precio;

    public Producto() {
    }

    public Producto(Integer codigo, String nombre, String marca, BigDecimal precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public BigDecimal getPrecio() {
        return precio;
    }

    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.codigo);
        hash = 83 * hash + Objects.hashCode(this.nombre);
        hash = 83 * hash + Objects.hashCode(this.marca);
        hash = 83 * hash + Objects.hashCode(this.precio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Producto other = (Producto) obj;
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.marca, other.marca)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.codigo).append(", ")
                .append(this.nombre).append(", ")
                .append(this.marca).append(", ")
                .append(this.precio);
        return sb.toString();
    }

}
