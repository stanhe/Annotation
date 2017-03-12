package com.example.Test;

/**
 * Created by stan on 2017/3/11.
 */
public enum AnimalType {
    DOG("DOG"),CAT("CAT");
    private String name;
    AnimalType(String name) {
        this.name = name;
    }
    public String getName() {
        return name();
    }
}
