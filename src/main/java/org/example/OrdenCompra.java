package org.example;
import java.util.*;

public class OrdenCompra {

    public OrdenCompra (String description) {
        this.description = description;
        this.products = new Product[4];
    }

    /*Metodos getter*/

    public Integer getIdentifier() {
        return identifier;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Product[] getProducts() {
        return products;
    }

    /*Methods setters*/
    public void setCliente (Cliente cliente) {
        this.cliente = cliente;
    }

    public  void setDate(Date date) {
            this.date = date;
    }

    public  void  addProduct(Product product) {
            if (indexProduct < this.products.length) {
                this.products[indexProduct++] = product;
            }
    }

    public int getTotalProducts() {
        int total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }


    private Integer identifier;
    private String description;
    private Date date;
    private Cliente cliente;
    private Product[]products;
    private int  indexProduct;

}
