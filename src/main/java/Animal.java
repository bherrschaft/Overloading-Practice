public class Animal {
    private String name;
    private boolean isDog;

    // Constructor with all attributes
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Constructor with only name, assumes not a dog
    public Animal(String name) {
        this(name, false);
    }

    // Default constructor, assumes no name and not a dog
    public Animal() {
        this("Unknown", false);
    }

    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }
}
