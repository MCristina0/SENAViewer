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

}
