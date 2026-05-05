package Assignment.receiver;

// is the receiver class
// has all the real logic for this to work

public class Pixel {

    private final int size = 10;
    private int[][] grid = new int[size][size];

    private int cursorX = 0;
    private int cursorY = 0;

    public int[][] getGrid() {
        return grid;
    }

    public int getCursorX() {
        return cursorX;
    }

    public int getCursorY() {
        return cursorY;
    }

    public void moveUp() {
        if (cursorY > 0) {
            cursorY--;
        }
    }

    public void moveDown() {
        if (cursorY < size - 1) {
            cursorY++;
        }
    }

    public void moveLeft() {
        if (cursorX > 0) {
            cursorX--;
        }
    }

    public void moveRight() {
        if (cursorX < size - 1) {
            cursorX++;
        }
    }

    public void draw() {
        grid[cursorY][cursorX] = 1; // Mark the current position as drawn
    }
}
