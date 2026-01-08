package com.example.petshop;

import java.util.Date;

public class Sad extends Mood {

    public Sad() {
        super();
    }

    public Sad(Date date) {
        super(date);
    }

    @Override  // Overriding the original function and giving it a new definition
    public String emotion() {
        return "boohoo";
    }
}
