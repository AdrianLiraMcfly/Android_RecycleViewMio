package com.example.reclyclerview;

public class Item {
    private String name;
    private int img;

    public Item(String name, int img) {
        this.name = name;
        this.img = img;
    }

    public String getName() { return name; }

    public int getImg() { return img; }
}
