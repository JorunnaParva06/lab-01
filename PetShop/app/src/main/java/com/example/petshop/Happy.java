package com.example.petshop;

import java.util.Date;

public class Happy extends Mood {

    public Happy() {
        super();
    }

    public Happy(Date date) {
        super(date);
    }

    @Override  // Overriding the original function and giving it a new definition
    public String emotion() {
        return "yippee";
    }

}
