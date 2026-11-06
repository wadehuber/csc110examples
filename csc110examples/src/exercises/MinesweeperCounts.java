package exercises;
/**
 * CSC 110 Bonus Exercise: Minesweeper Counts
 * Name:
 *
 * Replace every empty square ('.') with the number of mines ('*')
 * among its eight neighbors.
 */
public class MinesweeperCounts {

    public static void main(String[] args) {
        String[] rows = {
            "*.....",
            "...*..",
            ".*....",
            "....**",
            "*....."
        };

        char[][] field = toGrid(rows);

        System.out.println("Field:");
        printGrid(field);

        System.out.println();
        System.out.println("Counts:");
        printGrid(buildCounts(field));
    }

    /** Converts an array of equal-length strings into a 2D char array. (Provided.) */
    public static char[][] toGrid(String[] rows) {
        char[][] grid = new char[rows.length][];
        for (int r = 0; r < rows.length; r++) {
            grid[r] = rows[r].toCharArray();
        }
        return grid;
    }

    /** Step 1: Prints the grid with one space between squares. */
    public static void printGrid(char[][] grid) {
        // TODO
    }

    /** Step 2: Returns true if (r, c) is a valid position in the grid. */
    public static boolean inBounds(char[][] grid, int r, int c) {
        return false; // TODO
    }

    /** Step 3: Returns true if (r, c) is on the grid AND holds a mine. */
    public static boolean isMine(char[][] grid, int r, int c) {
        return false; // TODO
    }

    /** Step 4: Counts the mines among the (up to) eight neighbors of (r, c). */
    public static int countNeighbors(char[][] grid, int r, int c) {
        return 0; // TODO
    }

    /** Step 5: Returns a new grid with every '.' replaced by its neighbor count. */
    public static char[][] buildCounts(char[][] field) {
        return field; // TODO
    }
}
