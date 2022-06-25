import static org.junit.jupiter.api.Assertions.*;

class Task1Test {

    @org.junit.jupiter.api.Test
    void putSign() {
        assertDoesNotThrow(() -> Task1.putSign(0, 0));
        Throwable t = assertThrows(GridPutSignNumberException.class, () -> Task1.putSign(-1, -2));
        assertEquals(t.getMessage(), "GridPutSignNumberException: Grid have dimensions 3x3");
        Task1.printGrid();
        t = assertThrows(GridPutSignException.class, () -> Task1.putSign(0, 0));
        assertEquals(t.getMessage(), "GridPutSignException: You couldn't put sign here");
    }

    @org.junit.jupiter.api.Test
    void isGameOver() {
        Task1.clear();
        assertFalse(Task1.isGameOver());
        try {
            Task1.putSign(0, 0);
        } catch (GridPutSignNumberException | GridPutSignException | GridPutSignGameOverException e) {
            e.printStackTrace();
        }
        try {
            Task1.putSign(0, 1);
        } catch (GridPutSignNumberException | GridPutSignException | GridPutSignGameOverException e) {
            e.printStackTrace();
        }
        try {
            Task1.putSign(1, 0);
        } catch (GridPutSignNumberException | GridPutSignException | GridPutSignGameOverException e) {
            e.printStackTrace();
        }
        try {
            Task1.putSign(0, 2);
        } catch (GridPutSignNumberException | GridPutSignException | GridPutSignGameOverException e) {
            e.printStackTrace();
        }
        try {
            Task1.putSign(2, 0);
        } catch (GridPutSignNumberException | GridPutSignException | GridPutSignGameOverException e) {
            assertEquals(e.getMessage(), "GridPutSignGameOverException: Game over");
        }
        assertTrue(Task1.isGameOver());
    }
}