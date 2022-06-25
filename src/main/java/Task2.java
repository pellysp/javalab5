public class Task2 {
    public static void main(String[] args) {
        Line line = new Line(0, 0, 7, 5);
        System.out.println(line);
        System.out.println("Length of line: " + line.length());
        System.out.println("Move line:");
        line.setStartPoint(-1, -1).setEndPoint(9, 9).move(3, 4);
        System.out.println(line);
        System.out.println("Length of line: " + line.length());
    }
}
