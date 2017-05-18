/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.listadoproductos.struct;

import com.umg.listadoproductos.model.Producto;
import java.math.BigDecimal;

/**
 *
 * @author UMG - Progra 3 - Seccion A - Grupo 3
 */
public class ListadoTest {
    
    public static void main(String[] args) {
        Listado listado = new ListadoProducto();
        listado.agregar(new Producto(1, "Nombre", "Marca", new BigDecimal("1231.12")));
        listado.agregar(new Producto(2, "Nombre", "Marca", new BigDecimal("1231.12")));
        listado.agregar(new Producto(3, "Nombre", "Marca", new BigDecimal("1231.12")));
        listado.agregar(new Producto(4, "Nombre", "Marca", new BigDecimal("1231.12")));
        listado.agregar(new Producto(5, "Nombre", "Marca", new BigDecimal("1231.12")));
        
        System.out.println(listado);               
        
        listado.eliminar(1);
        
        //listado.colocar(3, new Producto(14, "Nombre", "Marca", new BigDecimal("1231.12")));
        
        System.out.println(listado);
    }
    
}
