public class Counter {
    private int value;

    // Constructor with start value
    public Counter(int startValue) {
        this.value = startValue;
    }

    // Default constructor, sets start value to 0
    public Counter() {
        this(0);
    }

    // Method to get the current value
    public int value() {
        return value;
    }

    // Method to increase the value by 1
    public void increase() {
        value++;
    }

    // Method to decrease the value by 1
    public void decrease() {
        value--;
    }

    // Overloaded method to increase by a specific value
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            value += increaseBy;
        }
    }

    // Overloaded method to decrease by a specific value
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0) {
            value -= decreaseBy;
        }
    }
}
