import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

class GridPutSignException extends Exception {
    GridPutSignException() {
        super("GridPutSignException: You couldn't put sign here");
    }
}

class GridPutSignNumberException extends Exception {
    GridPutSignNumberException() {
        super("GridPutSignNumberException: Grid have dimensions 3x3");
    }
}

class GridPutSignGameOverException extends Exception {
    GridPutSignGameOverException() {
        super("GridPutSignGameOverException: Game over");
    }
}


public class Task1 {
    private static String[][] grid = new String[3][3];
    private static String currentSign = "O";

    static void putSign(int x, int y) throws GridPutSignNumberException, GridPutSignException, GridPutSignGameOverException {
        if (x > 3 || y > 3 || x < 0 || y < 0) {
            throw new GridPutSignNumberException();
        }
        if (Objects.equals(grid[x][y], "") || grid[x][y] == null) {
            grid[x][y] = currentSign;
            currentSign = Objects.equals(currentSign, "O") ? "X" : "O";
        } else {
            throw new GridPutSignException();
        }
        if (isGameOver()) {
            throw new GridPutSignGameOverException();
        }
    }

    static void printGrid() {
        System.out.println("-------------");
        for (String[] strings : grid) {
            for (int j = 0; j < strings.length; j++) {
                System.out.print("| " + (strings[j] == null ? " " : strings[j]) + " ");
            }
            System.out.println("|\n-------------");
        }
    }

    static boolean isGameOver() {
        AtomicBoolean isGameOver = new AtomicBoolean(false);
        // Line vertical
        Arrays.stream(grid).forEach((g) -> {
            isGameOver.set(isGameOver.get() || Arrays.stream(g).filter((val) -> Objects.equals(val, g[0]) && val != null).toArray().length == 3);
        });

        boolean localIsGameOver = true;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][0] == null) {
                localIsGameOver = false;
            }
            localIsGameOver = localIsGameOver && Objects.equals(grid[i][0], grid[0][0]);
        }
        isGameOver.set(isGameOver.get() || localIsGameOver);

        localIsGameOver = true;
        for (int i = 0; i < grid.length; i++) {
            if (grid[i][i] == null) {
                localIsGameOver = false;
            }
            localIsGameOver = localIsGameOver && Objects.equals(grid[i][i], grid[0][0]);
        }
        isGameOver.set(isGameOver.get() || localIsGameOver);

        localIsGameOver = true;
        for (int i = 0; i < grid.length; i++) {
            if (grid[grid.length - i - 1][grid.length - i - 1] == null) {
                localIsGameOver = false;
            }
            localIsGameOver = localIsGameOver && Objects.equals(grid[grid.length - i - 1][grid.length - i - 1], grid[grid.length - 1][grid.length - 1]);
        }
        isGameOver.set(isGameOver.get() || localIsGameOver);

        return isGameOver.get();
    }

    public static void clear() {
        grid = new String[3][3];
    }

    public static void main(String[] args) {
        try {
            putSign(0, 0);
        } catch (GridPutSignNumberException | GridPutSignException e) {
            e.printStackTrace();
        } catch (GridPutSignGameOverException e) {
            System.out.println("Game over!");
            printGrid();
            return;
        }
        System.out.println("Current grid:");
        printGrid();

        try {
            putSign(1, 0);
        } catch (GridPutSignNumberException | GridPutSignException e) {
            e.printStackTrace();
        } catch (GridPutSignGameOverException e) {
            System.out.println("Game over!");
            printGrid();
            return;
        }
        System.out.println("Current grid:");
        printGrid();

        try {
            putSign(0, 1);
        } catch (GridPutSignNumberException | GridPutSignException e) {
            e.printStackTrace();
        } catch (GridPutSignGameOverException e) {
            System.out.println("Game over!");
            printGrid();
            return;
        }
        System.out.println("Current grid:");
        printGrid();

        try {
            putSign(2, 1);
        } catch (GridPutSignNumberException | GridPutSignException e) {
            e.printStackTrace();
        } catch (GridPutSignGameOverException e) {
            System.out.println("Game over!");
            printGrid();
            return;
        }
        System.out.println("Current grid:");
        printGrid();

        try {
            putSign(0, 2);
        } catch (GridPutSignNumberException | GridPutSignException e) {
            e.printStackTrace();
        } catch (GridPutSignGameOverException e) {
            System.out.println("Game over!");
            printGrid();
            return;
        }
        System.out.println("Current grid:");
        printGrid();
    }
}
