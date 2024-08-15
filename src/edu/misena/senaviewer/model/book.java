package edu.misena.senaviewer.model;

import java.util.List;

public class book {

    private String id;
    private String title;
    private String edititionDate;
    private String editorial;
    private List<String> authors;
    private String isbn;
    private boolean readed;
    private int timeReaded;



    public book(String title, String edititionDate, String editorial, String isbn) {
        this.title = title;
        this.edititionDate = edititionDate;
        this.editorial = editorial;
        this.isbn = isbn;
        this.readed = false; // Por defecto, el libro no ha sido leído
        this.timeReaded = 0; // Por defecto, el tiempo leído es 0
    }


}
