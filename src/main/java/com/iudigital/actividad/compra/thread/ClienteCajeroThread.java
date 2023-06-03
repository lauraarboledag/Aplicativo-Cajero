package com.iudigital.actividad.compra.thread;

import com.iudigital.actividad.compra.CajeraProducto;
import com.iudigital.actividad.compra.cliente.producto.ClienteProducto;
import com.iudigital.actividad.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class ClienteCajeroThread {

    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();
        setProductos(productos);

        ClienteProducto cliente1 = new ClienteProducto("Carlos", productos);
        ClienteProducto cliente2 = new ClienteProducto("Lupita", productos);

        long tiempoInicial = System.currentTimeMillis();
        CajeraThreadProducto cajera1 = new CajeraThreadProducto("Laura", cliente1, tiempoInicial);
        CajeraThreadProducto cajera2 = new CajeraThreadProducto("Manuela", cliente2, tiempoInicial);
        
        cajera1.start();
        cajera2.start();
    }
    
    public static void setProductos(List<Producto> productos){
        
        Producto p1 = new Producto("Bombones", 4000, 2);
        Producto p2 = new Producto("Cerezas", 5000, 1);
        Producto p3 = new Producto("Gomitas", 8000, 8);
        Producto p4 = new Producto("Chicles", 800, 1);
        
        productos.add(p4);
        productos.add(p3);
        productos.add(p2);
        productos.add(p1);
               
    }

}
