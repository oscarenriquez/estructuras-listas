/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.listadoproductos.controller;

import com.umg.listadoproductos.model.Producto;
import com.umg.listadoproductos.struct.Listado;
import com.umg.listadoproductos.struct.ListadoProducto;
import com.umg.listadoproductos.struct.NodoProducto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Map;
import java.util.StringTokenizer;

/**
 *
 * @author UMG - Progra 3 - Seccion A - Grupo 3
 */
public class ListadoProductosController {
    
    private static Listado listadoProductos;
    private static ListadoProductosController ctrl;
    
    public static final ListadoProductosController getInstance() {
        if(ctrl == null) {
            ctrl = new ListadoProductosController();
        }
        return ctrl;
    }
    
    private ListadoProductosController() {
        listadoProductos = new ListadoProducto();        
    }
    
    public Listado getListado() {
        return listadoProductos;
    }
    
    public void AgregarProducto(Integer posicion, Producto producto) {        
        if(posicion != null) {
            listadoProductos.agregar(posicion, producto);
        } else {
            listadoProductos.agregar(producto);
        }        
    }

    public void ActualizarProducto(Integer posicion, Producto producto) {
        listadoProductos.colocar(posicion, producto);
    }
    
    public Map<String, Object> BuscarProductoPorCodigo(Integer codigo) {
        Producto producto = new Producto();
        producto.setCodigo(codigo);
        
        Map<String, Object> resultado = listadoProductos.obtener(producto);               
        
        return resultado;
    }
    
    public void EliminarProducto(Producto producto) {
        listadoProductos.eliminar(producto);
    }
    
    public void EliminarProducto(Integer posicion) {
        listadoProductos.eliminar(posicion);
    }

    public void LimpiarListado() {
        listadoProductos.limpiar();
    }
    
    public void CargaDeArchivo(File file) throws IOException {
        String text = "";        
        if (file != null) {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferRead = new BufferedReader(fileReader);
            
            listadoProductos.limpiar();
            
            while ((text = bufferRead.readLine()) != null) {
                StringTokenizer tokens = new StringTokenizer(text, ",");
                if(tokens.countTokens() == 4) {
                    Producto producto = new Producto();
                    producto.setCodigo(Integer.valueOf(tokens.nextToken()));
                    producto.setNombre(tokens.nextToken());
                    producto.setMarca(tokens.nextToken());
                    producto.setPrecio(new BigDecimal(tokens.nextToken()));
                    listadoProductos.agregar(producto);                    
                }
            }
            bufferRead.close();
        }        
    }
}
