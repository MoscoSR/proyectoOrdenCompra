package org.example;

public class Cliente {
    public Cliente (String name, String lastName) {
            this.name= name;
            this.lastName = lastName;
    }

    public String getName() {
        return  name;
    }

    public  String getLastName () {
        return  lastName;
    }


    private String name;
    private String lastName;
}
