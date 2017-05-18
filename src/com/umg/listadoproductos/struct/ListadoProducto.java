/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.umg.listadoproductos.struct;

import com.umg.listadoproductos.model.Producto;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author UMG - Progra 3 - Seccion A - Grupo 3
 */
public class ListadoProducto implements Listado {

    private NodoProducto cabecera;

    @Override
    public void agregar(Producto elemento) {
        cabecera = agregarListado(cabecera, elemento);
    }

    private NodoProducto agregarListado(NodoProducto nodo, Producto elemento) {
        if (nodo == null) {
            nodo = new NodoProducto();
            nodo.setProducto(elemento);
            return nodo;
        } else {
            NodoProducto siguienteNodo = agregarListado(nodo.getSiguiente(), elemento);
            nodo.setSiguiente(siguienteNodo);
        }

        return nodo;
    }

    @Override
    public Producto obtener(Integer posicion) {
        int posicionActual = 0;
        return obtenerListado(cabecera, posicion, posicionActual);
    }

    private Producto obtenerListado(NodoProducto nodo, Integer posicion, Integer posicionActual) {
        if (posicion.equals(posicionActual)) {
            return nodo.getProducto();
        }
        posicionActual++;
        if (posicionActual <= posicion) {
            return obtenerListado(nodo.getSiguiente(), posicion, posicionActual);
        }

        return null;
    }

    @Override
    public Map<String, Object> obtener(Producto elemento) {
        int posicionActual = 0;
        return obtenerListado(cabecera, elemento, posicionActual);
    }

    private Map<String, Object> obtenerListado(NodoProducto nodo, Producto producto, Integer posicionActual) {
        if (nodo == null) {
            return null;
        }
        //Busqueda por código
        if (nodo.getProducto().getCodigo().equals(producto.getCodigo())) {
            Map<String, Object> map = new HashMap<>();
            map.put("posicion", posicionActual);
            map.put("producto", nodo.getProducto());
            return map;
        }
        posicionActual++;
        return obtenerListado(nodo.getSiguiente(), producto, posicionActual);
    }
        
    public NodoProducto obtenerNodo(Integer posicion) {
        int posicionActual = 0;
        return obtenerListadoNodo(cabecera, posicion, posicionActual);
    }

    private NodoProducto obtenerListadoNodo(NodoProducto nodo, Integer posicion, Integer posicionActual) {
        if (posicion.equals(posicionActual)) {
            return nodo;
        }
        posicionActual++;
        if (posicionActual <= posicion) {
            return obtenerListadoNodo(nodo.getSiguiente(), posicion, posicionActual);
        }

        return null;
    }

    @Override
    public void eliminar(Integer posicion) {
        int posicionActual = 0;
        cabecera = eliminarDeListado(cabecera, posicion, posicionActual);
    }

    private NodoProducto eliminarDeListado(NodoProducto cabecera, Integer posicion, int posicionActual) {
        if (posicion.equals(posicionActual)) {
            cabecera = cabecera.getSiguiente();
        } else {
            posicionActual++;
            if (posicionActual <= posicion) {
                NodoProducto nodoProducto = eliminarDeListado(cabecera.getSiguiente(), posicion, posicionActual);
                cabecera.setSiguiente(nodoProducto);
            }
        }
        return cabecera;
    }

    @Override
    public void eliminar(Producto elemento) {
        cabecera = eliminarDeListado(cabecera, elemento);
    }

    private NodoProducto eliminarDeListado(NodoProducto cabecera, Producto elemento) {
        if (cabecera != null) {
            if (cabecera.getProducto().getCodigo().equals(elemento.getCodigo())) {
                cabecera = cabecera.getSiguiente();
            } else {
                NodoProducto nodoProducto = eliminarDeListado(cabecera.getSiguiente(), elemento);
                cabecera.setSiguiente(nodoProducto);
            }
        }
        return cabecera;
    }

    @Override
    public boolean colocar(Integer posicion, Producto elemento) {
        if (posicion >= tamanio()) {
            return false;
        }

        NodoProducto nodo = obtenerNodo(posicion); // Obtener por posicion

        if (nodo != null) {
            nodo.setProducto(elemento);
            return true;
        }
        return false;
    }

    @Override
    public String[] obtenerArreglo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }    
    
    @Override
    public void limpiar() {
        cabecera = null;
    }       

    @Override
    public int tamanio() {
        int tamanio = 0;
        NodoProducto nodo = cabecera;
        while (nodo != null) {
            tamanio++;
            nodo = nodo.getSiguiente();
        }
        return tamanio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        NodoProducto nodo = cabecera;
        while (nodo != null) {
            sb.append("{").append(nodo.getProducto()).append("}\n");
            nodo = nodo.getSiguiente();
        }

        return sb.toString();
    }

}
