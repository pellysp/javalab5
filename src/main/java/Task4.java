public class Task4 {
    public static void main(String[] args) {
        System.out.println("Create figure: ");
        Figure figure = new Figure(new Point(3, 5), new Point(5, 5), new Point(7, 5), new Point(3, 3));
        System.out.println(figure);
        System.out.println("P of figure: " + figure.getP());
        System.out.println("Move to 5 points:");
        System.out.println(figure.move(5, 5));
        System.out.println("P of mooved figure: " + figure.getP());

        System.out.println("Create rectangle:");

        Rectangle rectangle;
        try {
            rectangle = new Rectangle(5, 10);
        } catch (RectangleOutboundException e) {
            e.printStackTrace();
            return;
        }

        System.out.println("P of Rectangle: " + rectangle.getP());
        System.out.println(rectangle);
        System.out.println("Moved:\n" + rectangle.move(5, 6));
        System.out.println("Resized:\n" + rectangle.resize(2, 1));
    }
}
