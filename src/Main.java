public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Круг", 100);
        Triangle triangle = new Triangle("Треугольник", 12, 32, 45);
        Square square = new Square("Квадрат", 15);
        Rectangle rectangle = new Rectangle("Прямоугольник", 32, 71);

        Dog dog = new Dog("Rudy");
        Cat cat = new Cat("Nana");

        // Полиморфизм
        Drawable [] drawables = {circle, triangle, square, rectangle, dog, cat};

        for (int i = 0; i < drawables.length; i++) {

            //проверка является ли
            if (drawables[i] instanceof Figure){
                // приведение типов
                System.out.println(((Figure) drawables[i]).getName() + " Периметр -> " +
                        ((Figure) drawables[i]).calculatePerimeter());
            }
            if (drawables[i] instanceof Animal){
                System.out.println(((Animal) drawables[i]).getName());
            }

            drawables[i].draw();

        }
        System.out.println("--------------------------");

        createObject("iPhone");
        createObject("Samsung");
        createObject("Xiaomi");

        Printable [] printable = {createObject("iPhone"), createObject("Samsung"), createObject("Xiaomi")};
        for (Printable a : printable) {
            a.print();
            System.out.println("------------------------");

        }



        //System.out.println(circle.getName() + " Периметр -> " + circle.calculatePerimeter());
        //System.out.println(triangle.getName() + " Периметр -> " + triangle.calculatePerimeter());
        //System.out.println(square.getName() + " Периметр -> " + square.calculatePerimeter());
        //System.out.println(rectangle.getName() + " Периметр -> " + rectangle.calculatePerimeter());
    }

    public static Phone createObject(String className) {
        switch (className) {
            case "iPhone":
                iPhone iphone = new iPhone(2022, 256, "USA", "Face ID", 4323);
                return iphone;

                case "Samsung":
                Samsung samsung = new Samsung(2023, 512, "Korea", "Touch ID", 168);
                return samsung;

            case "Xiaomi":
                Xiaomi xiaomi = new Xiaomi(2022, 128, "China", 6.36, "2400 * 1080");
                return xiaomi;

        }
        return null;
    }
}