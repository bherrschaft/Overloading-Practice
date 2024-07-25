public class Book {
    private String title;
    private int numPages;
    private int pubYear;

    // Constructor with all attributes
    public Book(String title, int numPages, int pubYear) {
        this.title = title;
        this.numPages = numPages;
        this.pubYear = pubYear;
    }

    // Constructor with title and number of pages, assumes unknown publication year
    public Book(String title, int numPages) {
        this(title, numPages, 0);
    }

    // Default constructor, assumes unknown title, 0 pages, and unknown publication year
    public Book() {
        this("Unknown", 0, 0);
    }

    public String getTitle() {
        return title;
    }

    public int getNumPages() {
        return numPages;
    }

    public int getPubYear() {
        return pubYear;
    }

    @Override
    public String toString() {
        return "The book '" + title + "' has " + numPages + " pages and was published in " + pubYear + ".";
    }
}
