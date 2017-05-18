/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.listadoproductos.struct;

import com.umg.listadoproductos.model.Producto;
import java.util.Map;

/**
 *
 * @author UMG - Progra 3 - Seccion A - Grupo 3
 */
public interface Listado {
    
    public void agregar(Producto elemento);
    
    public Producto obtener(Integer posicion);
    
    public Map<String, Object> obtener(Producto elemento);
    
    public void eliminar(Integer posicion);
    
    public void eliminar(Producto elemento);
    
    public boolean colocar(Integer posicion, Producto elemento);
    
    public String[] obtenerArreglo();
    
    public void limpiar();
    
    public int tamanio();
    
}
