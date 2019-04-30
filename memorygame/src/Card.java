public class Card {
    private int value;
    private boolean isFound;

    public Card(int value, boolean isFound) {
        this.value = value;
        this.isFound = isFound;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public boolean isFound() {
        return isFound;
    }

    public void setFound(boolean found) {
        isFound = found;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }
}
