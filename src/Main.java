import java.util.ArrayList;
import java.util.Scanner;

import edu.misena.senaviewer.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public List<Movie> movies;
    public List<Serie> series;
    public List<Book> books;
    public List<Magazine> magazines;
    public Report report;
    public ReportToday reportToday;

    public Main() {
        movies = new ArrayList<>();
        series = new ArrayList<>();


        books = new ArrayList<>();
        magazines = new ArrayList<>();
        report = new Report();
        reportToday = new ReportToday();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        int option;

        while (true) {
            System.out.println("Sena Viewer");
            System.out.println("-----------");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Report");
            System.out.println("6. Report Today");
            System.out.println("0. Exit");
            System.out.print("Select an option: ");

            option = scanner.nextInt();

            switch (option) {
                case 1:
                    showMovies();
                    break;
                case 2:
                    showSeries();
                    break;
                case 3:
                    showBooks();
                    break;
                case 4:
                    showMagazines();
                    break;
                case 5:
                    generateReport();
                    break;
                case 6:
                    generateReportToday();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }

    
    public void showMovies() {
        System.out.println("Movies:");
        for (Movie movie : movies) {
            System.out.println(movie.getTitle());
        }
    }

    public void showSeries() {
        System.out.println("Series:");
        for (Serie serie : series) {
            System.out.println(serie.getTitle());
        }
    }

    public void showBooks() {
        System.out.println("Books:");
        for (Book book : books) {
            System.out.println(book.getTitle());
        }
    }

    public void showMagazines() {
        System.out.println("Magazines:");
        for (Magazine magazine : magazines) {
            System.out.println(magazine.getTitle());
        }
    }

    public void generateReport() {
        System.out.println("Generating report...");

    }

    public void generateReportToday() {
        System.out.println("Generating report for today...");

    }

    public static void main(String[] args) {
        Main viewer = new Main();
        viewer.run();
    }
}