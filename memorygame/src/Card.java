public class Card {
    private int value;
    private boolean isFound;
    private boolean isVisible;

    public Card(int value) {
        this.value = value;
        this.isFound = false;
        this.isVisible = false;
    }

    public boolean isVisible() {
        return isVisible;
    }

    public void setVisible(boolean visible) {
        isVisible = visible;
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
        return isVisible ? String.valueOf(value) : "#";
    }
}
