package org.example;

public class Product {
    public Product (String maker, String name, int price ) {
            this.maker = maker;
            this.name = name;
            this.price =price;
    }


    public  String getMaker () {
        return maker;
    }

    public  String getName(){
        return  name;
    }

    public int getPrice () {
        return  price;
    }

    private String maker;
    private String name;
    private int price;
}
