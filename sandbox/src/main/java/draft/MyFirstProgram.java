package draft;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("Hello, Sasha");

        Square s = new Square(4);

        System.out.println("Площа квадрата зі стороною " + s.side + " = " + s.area());

        Rectangle r = new Rectangle(2, 3);

        System.out.println("Площа прямокутника зі сторонами " + r.a + " і " + r.b + " = " + r.area());

    }

}
