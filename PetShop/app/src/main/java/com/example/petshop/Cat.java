package com.example.petshop;

import java.util.Date;

public class Cat extends Pet implements Pettable {

    public Cat(String name) {
        super(name);
    }

    public Cat(String name, Date birthDate) {
        super(name, birthDate);
    }

    @Override  // Overriding the original function and giving it a new definition
    public String speak() {
        return "meow";
    }

    @Override
    public Void pet() {
        return null;
    }

}