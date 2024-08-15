package edu.misena.senaviewer.model;

public class Serie {

        // Atributos
        private String id;
        private String title;
        private String genre;
        private String creator;
        private int duration;
        private int year;
        private boolean viewed;
        private int timeViewed;
        private int sessionQuantity;

        // Constructor con parámetros
        public Serie(String title, String genre, int duration) {
            this.title = title;
            this.genre = genre;
            this.duration = duration;
            this.year = 0; // Por defecto, el año es 0 si no se especifica
            this.viewed = false; // Por defecto, la serie no ha sido visualizada
            this.timeViewed = 0; // Por defecto, el tiempo visualizado es 0
            this.sessionQuantity = 0; // Por defecto, la cantidad de sesiones es 0
        }
    // Getters y Setters
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isViewed() {
        return viewed;
    }

    public void setViewed(boolean viewed) {
        this.viewed = viewed;
    }

    public int getTimeViewed() {
        return timeViewed;
    }

    public void setTimeViewed(int timeViewed) {
        this.timeViewed = timeViewed;
    }

    public int getSessionQuantity() {
        return sessionQuantity;
    }

    public void setSessionQuantity(int sessionQuantity) {
        this.sessionQuantity = sessionQuantity;
    }
}


