package edu.misena.senaviewer.model;
public class chapter {

    private String id;
    private String title;
    private int duration;
    private int year;
    private boolean viewed;
    private int timeViewed;
    private int sessionNumber;


    public chapter(String title, int duration, int year) {
        this.title = title;
        this.duration = duration;
        this.year = year;
        this.viewed = false; // Por defecto, el capítulo no ha sido visualizado
        this.timeViewed = 0; // Por defecto, el tiempo visualizado es 0
        this.sessionNumber = 0; // Por defecto, el número de sesión es 0
    }


}
