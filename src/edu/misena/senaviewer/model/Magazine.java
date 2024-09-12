package edu.misena.senaviewer.model;

public class Magazine extends Publication {
    private int id;

    // Constructor
    public Magazine(String title, String editionDate, String editorial) {
        super(title, editionDate, editorial);
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    // toString() Method
    @Override
    public String toString() {
        return "Magazine{" +
                super.toString() +
                ", id=" + id +
                '}';
    }
}
