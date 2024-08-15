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

    }
