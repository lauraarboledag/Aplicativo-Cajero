package com.iudigital.actividad.compra;

import com.iudigital.actividad.compra.cliente.producto.ClienteProducto;
import com.iudigital.actividad.compra.cliente.producto.Producto;
import java.util.ArrayList;
import java.util.List;

public class ClienteCajero {

    public static void main(String[] args) {
        
        List<Producto> productos = new ArrayList<>();
        setProductos(productos);
        
        ClienteProducto cliente1 = new ClienteProducto("Carlos", productos);
        ClienteProducto cliente2 = new ClienteProducto("Lupita", productos);
        
        long tiempoInicial = System.currentTimeMillis();
        CajeraProducto cajera1 = new CajeraProducto("Laura");
        CajeraProducto cajera2 = new CajeraProducto("Manuela");
        
        cajera1.procesarCompra(cliente1, tiempoInicial);
        cajera2.procesarCompra(cliente2, tiempoInicial);
    }
    
    private static void setProductos(List<Producto> productos){
        Producto producto1 = new Producto("Masmelos", 1500, 1);
        Producto producto2 = new Producto("Chocolate", 10000, 5);
        Producto producto3 = new Producto("Helado", 7000, 1);
        Producto producto4 = new Producto("Galletas", 5000, 3);
        
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        productos.add(producto4);
        
        
}
}