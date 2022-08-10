package io.zipcoder.polymorphism;

public class Bunny extends Pet {

    public Bunny(String name) {
        super(name);
    }

    @Override
    public String speak() {
        return "nim nim nim";
    }

}
