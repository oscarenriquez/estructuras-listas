/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.listadoproductos.struct;

import com.umg.listadoproductos.model.Producto;

/**
 *
 * @author UMG - Progra 3 - Seccion A - Grupo 3
 */
public class NodoProducto {    
    Producto producto;
    NodoProducto siguiente;

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    public NodoProducto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoProducto siguiente) {
        this.siguiente = siguiente;
    }  
}
