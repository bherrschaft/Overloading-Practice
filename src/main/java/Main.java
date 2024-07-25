import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Animal examples
        System.out.println("Animal Menu");
        System.out.println("Entering nothing will stop the loop");
        Scanner scanner = new Scanner(System.in);
        List<Animal> animals = new ArrayList<>();

        while (true) {
            System.out.print("Enter the name of your animal (or press Enter to stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Is it a dog? (yes/no): ");
            String isDogInput = scanner.nextLine();
            boolean isDog = isDogInput.equalsIgnoreCase("yes");

            animals.add(new Animal(name, isDog));
        }

        System.out.println("List of animals:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }

        // Using overloaded constructors for Animal
        Animal animal1 = new Animal("Buddy", true);
        Animal animal2 = new Animal("Whiskers");
        System.out.println(animal1);
        System.out.println(animal2);


        // TvShow examples
        List<TvShow> tvShows = new ArrayList<>();
        while (true) {
            System.out.print("Enter the name of the TV show (or press Enter to stop): ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of episodes: ");
            int numEpisodes = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the genre: ");
            String genre = scanner.nextLine();

            tvShows.add(new TvShow(name, numEpisodes, genre));
        }

        System.out.println("List of TV shows:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }

        // Using overloaded constructors for TvShow
        TvShow tvShow1 = new TvShow("GOT", 10, "Fantasy");
        TvShow tvShow2 = new TvShow("Friends", 236, "Drama" );
        System.out.println(tvShow1);
        System.out.println(tvShow2);

        // Book examples
        List<Book> books = new ArrayList<>();
        while (true) {
            System.out.print("Enter the title of the book (or press Enter to stop): ");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }

            System.out.print("Enter the number of pages: ");
            int numPages = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            System.out.print("Enter the publication year: ");
            int pubYear = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            books.add(new Book(title, numPages, pubYear));
        }

        System.out.print("What do you want to print? (everything/name): ");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equalsIgnoreCase("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        } else {
            System.out.println("Invalid choice");
        }

        // Using overloaded constructors for Book
        Book book1 = new Book("Lord of the Rings", 1178, 1954);
        Book book2 = new Book("1984", 328, 1949);
        System.out.println(book1);
        System.out.println(book2);

        // Counter examples
        Counter counter1 = new Counter(10);
        Counter counter2 = new Counter();

        System.out.println("Initial value of counter1: " + counter1.value());
        System.out.println("Initial value of counter2: " + counter2.value());

        counter1.increase();
        counter1.increase(1);
        counter2.decrease();
        counter2.decrease(1);

        System.out.println("Value of counter1 after increases: " + counter1.value());
        System.out.println("Value of counter2 after decreases: " + counter2.value());

        scanner.close();
    }
}
