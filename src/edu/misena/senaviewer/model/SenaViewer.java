package edu.misena.senaviewer.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

    public class SenaViewer {

        private static final Scanner scanner = new Scanner(System.in);
        private static final List<Movie> movies = new ArrayList<>();
        private static final List<Serie> series = new ArrayList<>();
        private static final List<book> books = new ArrayList<>();
        private static final List<Magazine> magazines = new ArrayList<>();

        public static void main(String[] args) {
            while (true) {
                Menu();
                int respuesta = Opcion();
                procesarMenu(respuesta);

                if (respuesta == 0) {
                    System.out.println("Saliendo de la aplicación...");
                    break;
                }
            }
        }

        private static void Menu() {
            System.out.println("Bienvenido a Sena Viewer");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("0. Exit");
            System.out.print("Seleccione una opción: ");
        }

        private static int Opcion() {
            int opcion = -1;
            try {
                opcion = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Error: Ingrese un número válido.");
            }
            return opcion;
        }

        private static void procesarMenu(int opcion) {
            switch (opcion) {
                case 1:
                    mostrarPeliculas();
                    break;
                case 2:
                    mostrarSeries();
                    break;
                case 3:
                    mostrarLibros();
                    break;
                case 4:
                    mostrarRevistas();
                case 0:
                    System.out.println("ADIOS ...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor.....");
                    break;
            }
        }


        private static void mostrarPeliculas() {
            System.out.println("Mostrando lista de películas...");
            for (Movie movie : movies) {
                System.out.println("Título: " + movie.getTitle() + ", Año: " + movie.getYear() + ", Duración: " + movie.getDuration() + " minutos");
            }

        }

        private static void mostrarSeries() {
            System.out.println("Mostrando lista de series...");
            for (Serie serie : series) {
                System.out.println("Título: " + serie.getTitle() + ", Año: " + serie.getYear() + ", Duración: " + serie.getDuration() + " minutos");
            }

        }

        private static void mostrarLibros() {
            System.out.println("Mostrando lista de libros...");
            for (book book : books) {
                System.out.println("Título: " + book.getTitle() + ", Editorial: " + book.getEditorial() + ", Fecha de edición: " + book.getEdititionDate());
            }

        }

        private static void mostrarRevistas() {
            System.out.println("Mostrando lista de revistas...");
            for (Magazine magazine : magazines) {
                System.out.println("Título: " + magazine.getTitle() + ", Editorial: " + magazine.getEditorial() + ", Fecha de edición: " + magazine.getEdititionDate());
            }

        }


    }



