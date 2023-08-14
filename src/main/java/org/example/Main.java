package org.example;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        /*First order*/
        OrdenCompra ordenCompra = new OrdenCompra("Compras componentes PC");
        ordenCompra.setCliente(new Cliente("Maria", "Martinez"));
        ordenCompra.setDate(new Date());
        ordenCompra.addProduct(new Product("Samsumg", "Samsumg A2", 14000));
        ordenCompra.addProduct(new Product("MSI", "Monitor Optix 6271",36394));
        ordenCompra.addProduct(new Product("AMD", "Procesador AMD rayzen 9", 59992));
        ordenCompra.addProduct(new Product("EVGA", "Tarjeta de video", 18949990));

        /*Second order*/
        OrdenCompra ordenCompra1 = new OrdenCompra("Compras Electrodomesticos");
        ordenCompra1.setCliente(new Cliente("Sam", "Smith"));
        ordenCompra1.setDate(new Date());
        ordenCompra1.addProduct(new Product("Frensa", "Cocina", 23950));
        ordenCompra1.addProduct(new Product("Samsumg", "Refigerador", 254000));
        ordenCompra1.addProduct(new Product("Midea", "Lavadora", 14990));
        ordenCompra1.addProduct(new Product("Aspiradora", "IRobot", 199990));

        OrdenCompra ordenCompra2 = new OrdenCompra("Compra materiales de construccion");
        ordenCompra2.setCliente(new Cliente("Ramiro", "Bermudez"));
        ordenCompra2.setDate(new Date());

        ordenCompra2.addProduct(new Product("Melon","Cemento", 4870));
        ordenCompra2.addProduct(new Product("Grau", "Hormigon", 6490));
        ordenCompra2.addProduct(new Product("Ceramica Santiago", "Ladrillo", 790));
        ordenCompra2.addProduct(new Product("Redline", "Aluminio", 4890));

        OrdenCompra [] orders = {ordenCompra, ordenCompra1, ordenCompra2};

        for (OrdenCompra ordenes : orders) {
            System.out.println(ordenes.getTotalProducts());
        }
    }

}
