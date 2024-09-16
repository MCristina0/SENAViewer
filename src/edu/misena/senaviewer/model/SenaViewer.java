package edu.misena.senaviewer.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SenaViewer {

    private static final Scanner scanner = new Scanner(System.in);
    private static final List<Movie> movies = new ArrayList<>();
    private static final List<Serie> series = new ArrayList<>();
    private static final List<Book> books = new ArrayList<>();
    private static final List<Magazine> magazines = new ArrayList<>();

    public static void main(String[] args) {
        inicializarDatos();

        while (true) {
            mostrarMenuPrincipal();
            int respuesta = leerOpcion();
            procesarMenuPrincipal(respuesta);

            if (respuesta == 0) {
                System.out.println("Saliendo de la aplicación...");
                break;
            }
        }
    }

    private static void inicializarDatos() {
        movies.add(new Movie("Inception", "Sci-Fi", "Christopher Nolan", 148, 2010));
        series.add(new Serie("Breaking Bad", "Drama", "Vince Gilligan", 47, 2008));
        books.add(new Book("Clean Code", "2008", "Prentice Hall", "9780132350884"));
        magazines.add(new Magazine("National Geographic", "Septiembre 2023", "National Geographic Society"));
    }


    private static void mostrarMenuPrincipal() {
        System.out.println("Bienvenido a Sena Viewer");
        System.out.println("1. Movies");
        System.out.println("2. Series");
        System.out.println("3. Books");
        System.out.println("4. Magazines");
        System.out.println("5. Reportes");
        System.out.println("0. Exit");
        System.out.print("Seleccione una opción: ");
    }

    private static int leerOpcion() {
        int opcion = -1;
        try {
            opcion = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Error: Ingrese un número válido.");
        }
        return opcion;
    }

    private static void procesarMenuPrincipal(int opcion) {
        switch (opcion) {
            case 1:
                mostrarPeliculas();
                mostrarSubMenuListMovie();
                break;
            case 2:
                mostrarSeries();
                mostrarSubMenuListSerie();
                break;
            case 3:
                mostrarLibros();
                mostrarSubMenuListBook();
                break;
            case 4:
                mostrarRevistas();
                mostrarSubMenuListMagazine();
                break;
            case 5:
                mostrarSubMenuReportes();
                break;
            case 0:
                System.out.println("ADIOS ...");
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    private static void mostrarSubMenuReportes() {
        while (true) {
            System.out.println("\n--- Submenú Reportes ---");
            System.out.println("1. Reporte completo de Movies");
            System.out.println("2. Reporte completo de Series");
            System.out.println("3. Reporte completo de Books");
            System.out.println("4. Reporte completo de Magazines");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = leerOpcion();
            procesarSubMenuReportes(opcion);

            if (opcion == 0) {
                System.out.println("Volviendo al menú principal...");
                break;
            }
        }
    }

    private static void procesarSubMenuReportes(int opcion) {
        switch (opcion) {
            case 1:
                reportMovies();
                break;
            case 2:
                reportSeries();
                break;
            case 3:
                reportBooks();
                break;
            case 4:
                reportMagazines();
                break;


            case 0:
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }


    private static void reportMovies() {
        System.out.println("\n--- Reporte completo de películas ---");
        for (Movie movie : movies) {
            System.out.println("Título: " + movie.getTitle() + ", Director: " + movie.getCreator() + ", Fecha de estreno: " + movie.getYear());
        }
    }


    private static void reportSeries() {
        System.out.println("\n--- Reporte completo de series ---");
        for (Serie serie : series) {
            System.out.println("Título: " + serie.getTitle() + ", Creador: " + serie.getCreator() + ", Fecha de estreno: " + serie.getYear());
        }
    }



    private static void reportBooks() {
        System.out.println("\n--- Reporte completo de libros ---");
        for (Book book : books) {
            System.out.println("Título: " + book.getTitle() + ", editorial: " + book.getEditorial() + ", Fecha de publicación: " + book.getEditionDate());
        }
    }



    private static void reportMagazines() {
        System.out.println("\n--- Reporte completo de revistas ---");
        for (Magazine magazine : magazines) {
            System.out.println("Título: " + magazine.getTitle() + ", Editorial: " + magazine.getEditorial() + ", Fecha de edición: " + magazine.getEditionDate());
        }
    }




    private static void mostrarSubMenuListMovie() {
        while (true) {
            System.out.println("\n--- Submenú Métodos List ---");
            System.out.println("1. Agregar película");
            System.out.println("2. Eliminar película");
            System.out.println("3. Buscar película por título");
            System.out.println("4. Mostrar tamaño de la lista de películas");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = leerOpcion();
            procesarSubMenuListMovie(opcion);

            if (opcion == 0) {
                System.out.println("Volviendo al menú principal...");
                break;
            }
        }
    }

    private static void procesarSubMenuListMovie(int opcion) {
        switch (opcion) {
            case 1:
                agregarPelicula();
                break;
            case 2:
                eliminarPelicula();
                break;
            case 3:
                buscarPelicula();
                break;
            case 4:
                mostrarTamanoListaPeliculas();
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    private static void mostrarSubMenuListSerie() {
        while (true) {
            System.out.println("\n--- Submenú Métodos List serie ---");
            System.out.println("1. Agregar serie");
            System.out.println("2. Eliminar serie");
            System.out.println("3. Buscar serie por título");
            System.out.println("4. Mostrar tamaño de la lista de series");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = leerOpcion();
            procesarSubMenuListSerie(opcion);

            if (opcion == 0) {
                System.out.println("Volviendo al menú principal...");
                break;
            }
        }
    }

    private static void procesarSubMenuListSerie(int opcion) {
        switch (opcion) {
            case 1:
                agregarSerie();
                break;
            case 2:
                eliminarSerie();
                break;
            case 3:
                buscarSerie();
                break;
            case 4:
                mostrarTamanoListaSeries();
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    private static void mostrarSubMenuListBook() {
        while (true) {
            System.out.println("\n--- Submenú Métodos List book ---");
            System.out.println("1. Agregar libro");
            System.out.println("2. Eliminar libro");
            System.out.println("3. Buscar libro por título");
            System.out.println("4. Mostrar tamaño de la lista de libros");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = leerOpcion();
            procesarSubMenuListBook(opcion);

            if (opcion == 0) {
                System.out.println("Volviendo al menú principal...");
                break;
            }
        }
    }

    private static void procesarSubMenuListBook(int opcion) {
        switch (opcion) {
            case 1:
                agregarLibro();
                break;
            case 2:
                eliminarLibro();
                break;
            case 3:
                buscarLibro();
                break;
            case 4:
                mostrarTamanoListaLibros();
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    private static void mostrarSubMenuListMagazine() {
        while (true) {
            System.out.println("\n--- Submenú Métodos List magazine ---");
            System.out.println("1. Agregar revista");
            System.out.println("2. Eliminar revista");
            System.out.println("3. Buscar revista por título");
            System.out.println("4. Mostrar tamaño de la lista de revistas");
            System.out.println("0. Volver al menú principal");
            System.out.print("Seleccione una opción: ");

            int opcion = leerOpcion();
            procesarSubMenuListMagazine(opcion);

            if (opcion == 0) {
                System.out.println("Volviendo al menú principal...");
                break;
            }
        }
    }

    private static void procesarSubMenuListMagazine(int opcion) {
        switch (opcion) {
            case 1:
                agregarRevista();
                break;
            case 2:
                eliminarRevista();
                break;
            case 3:
                buscarRevista();
                break;
            case 4:
                mostrarTamanoListaRevistas();
                break;
            case 0:
                break;
            default:
                System.out.println("Opción no válida.");
                break;
        }
    }

    private static void agregarRevista() {
        System.out.print("Ingrese el título de la revista: ");
        String title = scanner.nextLine();
        System.out.print("Ingrese la fecha de edición de la revista: ");
        String editionDate = scanner.nextLine();
        System.out.print("Ingrese la editorial de la revista: ");
        String editorial = scanner.nextLine();

        magazines.add(new Magazine(title, editionDate, editorial));
        System.out.println("Revista agregada exitosamente.");
    }

    private static void eliminarRevista() {
        System.out.print("Ingrese el título de la revista que desea eliminar: ");
        String title = scanner.nextLine();

        Magazine revistaAEliminar = null;
        for (Magazine magazine : magazines) {
            if (magazine.getTitle().equalsIgnoreCase(title)) {
                revistaAEliminar = magazine;
                break;
            }
        }

        if (revistaAEliminar != null) {
            magazines.remove(revistaAEliminar);
            System.out.println("Revista eliminada exitosamente.");
        } else {
            System.out.println("Revista no encontrada.");
        }
    }

    private static void buscarRevista() {
        System.out.print("Ingrese el título de la revista que desea buscar: ");
        String title = scanner.nextLine();

        for (Magazine magazine : magazines) {
            if (magazine.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Revista encontrada: " + magazine);
                return;
            }
        }

        System.out.println("Revista no encontrada.");
    }

    private static void mostrarTamanoListaRevistas() {
        System.out.println("El tamaño de la lista de revistas es: " + magazines.size());
    }


    private static void agregarLibro() {
        System.out.print("Ingrese el título del libro: ");
        String title = scanner.nextLine();
        System.out.print("Ingrese la fecha de edición del libro: ");
        String editionDate = scanner.nextLine();
        System.out.print("Ingrese la editorial del libro: ");
        String editorial = scanner.nextLine();
        System.out.print("Ingrese el ISBN del libro: ");
        String isbn = scanner.nextLine();

        books.add(new Book(title, editionDate, editorial, isbn));
        System.out.println("Libro agregado exitosamente.");
    }

    private static void eliminarLibro() {
        System.out.print("Ingrese el título del libro que desea eliminar: ");
        String title = scanner.nextLine();

        Book libroAEliminar = null;
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                libroAEliminar = book;
                break;
            }
        }

        if (libroAEliminar != null) {
            books.remove(libroAEliminar);
            System.out.println("Libro eliminado exitosamente.");
        } else {
            System.out.println("Libro no encontrado.");
        }
    }

    private static void buscarLibro() {
        System.out.print("Ingrese el título del libro que desea buscar: ");
        String title = scanner.nextLine();

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Libro encontrado: " + book);
                return;
            }
        }

        System.out.println("Libro no encontrado.");
    }

    private static void mostrarTamanoListaLibros() {
        System.out.println("El tamaño de la lista de libros es: " + books.size());
    }



    private static void agregarSerie() {
        System.out.print("Ingrese el título de la serie: ");
        String title = scanner.nextLine();
        System.out.print("Ingrese el género de la serie: ");
        String genre = scanner.nextLine();
        System.out.print("Ingrese el creador de la serie: ");
        String creator = scanner.nextLine();
        System.out.print("Ingrese la duración de la serie (minutos por episodio): ");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el año de la serie: ");
        int year = Integer.parseInt(scanner.nextLine());

        series.add(new Serie(title, genre, creator, duration, year));
        System.out.println("Serie agregada exitosamente.");
    }

    private static void eliminarSerie() {
        System.out.print("Ingrese el título de la serie que desea eliminar: ");
        String title = scanner.nextLine();

        Serie serieAEliminar = null;
        for (Serie serie : series) {
            if (serie.getTitle().equalsIgnoreCase(title)) {
                serieAEliminar = serie;
                break;
            }
        }

        if (serieAEliminar != null) {
            series.remove(serieAEliminar);
            System.out.println("Serie eliminada exitosamente.");
        } else {
            System.out.println("Serie no encontrada.");
        }
    }

    private static void buscarSerie() {
        System.out.print("Ingrese el título de la serie que desea buscar: ");
        String title = scanner.nextLine();

        for (Serie serie : series) {
            if (serie.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Serie encontrada: " + serie);
                return;
            }
        }

        System.out.println("Serie no encontrada.");
    }

    private static void mostrarTamanoListaSeries() {
        System.out.println("El tamaño de la lista de series es: " + series.size());
    }



    private static void agregarPelicula() {
        System.out.print("Ingrese el título de la película: ");
        String title = scanner.nextLine();
        System.out.print("Ingrese el género de la película: ");
        String genre = scanner.nextLine();
        System.out.print("Ingrese el creador de la película: ");
        String creator = scanner.nextLine();
        System.out.print("Ingrese la duración de la película (minutos): ");
        int duration = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese el año de la película: ");
        int year = Integer.parseInt(scanner.nextLine());

        movies.add(new Movie(title, genre, creator, duration, year));
        System.out.println("Película agregada exitosamente.");
    }

    private static void eliminarPelicula() {
        System.out.print("Ingrese el título de la película que desea eliminar: ");
        String title = scanner.nextLine();

        Movie peliculaAEliminar = null;
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                peliculaAEliminar = movie;
                break;
            }
        }

        if (peliculaAEliminar != null) {
            movies.remove(peliculaAEliminar);
            System.out.println("Película eliminada exitosamente.");
        } else {
            System.out.println("Película no encontrada.");
        }
    }

    private static void buscarPelicula() {
        System.out.print("Ingrese el título de la película que desea buscar: ");
        String title = scanner.nextLine();

        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Película encontrada: " + movie);
                return;
            }
        }

        System.out.println("Película no encontrada.");
    }

    private static void mostrarTamanoListaPeliculas() {
        System.out.println("El tamaño de la lista de películas es: " + movies.size());
    }

    private static void mostrarPeliculas() {
        System.out.println("Mostrando lista de películas");
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
        System.out.println("Mostrando lista de libros");
        for (Book book : books) {
            System.out.println("Título: " + book.getTitle() + ", Editorial: " + book.getEditorial() + ", Fecha de edición: " + book.getEditionDate());
        }
    }

    private static void mostrarRevistas() {
        System.out.println("Mostrando lista de revistas.");
        for (Magazine magazine : magazines) {
            System.out.println("Título: " + magazine.getTitle() + ", Editorial: " + magazine.getEditorial() + ", Fecha de edición: " + magazine.getEditionDate());
        }
    }
}
