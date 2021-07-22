package draft;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, Sasha");

        Square sq = new Square(4);

        System.out.println("Площа квадрата зі стороною " + sq.side + " = " + area(sq));

        Rectangle rec = new Rectangle(2,3);

        System.out.println("Площа прямокутника зі сторонами " + rec.a + " і " + rec.b + " = " + area(rec));

    }

    public static int area(Square s) {
        return s.side * s.side;
    }

    public static int area(Rectangle r) {
        return r.a * r.b;
    }
}
