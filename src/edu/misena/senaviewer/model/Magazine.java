package edu.misena.senaviewer.model;

import java.util.List;

public class Magazine {// Atributos
    private String id;
    private String title;
    private String edititionDate;
    private String editorial;
    private List<String> authors;


    public Magazine( String id, String title, String edititionDate, String editorial) {
        this.id = id;
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getEdititionDate() {
        return edititionDate;
    }

    public void setEdititionDate(String edititionDate) {
        this.edititionDate = edititionDate;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public List<String> getAuthors() {
        return authors;
    }

    public void setAuthors(List<String> authors) {
        this.authors = authors;
    }
}
