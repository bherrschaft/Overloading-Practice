public class TvShow {
    private String name;
    private int numEpisodes;
    private String genre;

    // Constructor with all attributes
    public TvShow(String name, int numEpisodes, String genre) {
        this.name = name;
        this.numEpisodes = numEpisodes;
        this.genre = genre;
    }

    // Constructor with name and number of episodes, assumes unknown genre
    public TvShow(String name, int numEpisodes) {
        this(name, numEpisodes, "Unknown");
    }

    // Default constructor, assumes unknown name, 0 episodes, and unknown genre
    public TvShow() {
        this("Unknown", 0, "Unknown");
    }

    public String getName() {
        return name;
    }

    public int getNumEpisodes() {
        return numEpisodes;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return "The TV show '" + name + "' has " + numEpisodes + " episodes and belongs to the " + genre + " genre.";
    }
}
