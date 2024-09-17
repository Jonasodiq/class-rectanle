// 17 sep 2024 Jonas N Övning-1 - Klasser och Objekt. Skapa en klass Rectangle

public class Main {
    public static void main(String[] args) {

        // Skapa med den tomma konstruktören
        Rectangle rect0 = new Rectangle();
        System.out.println("Rect0: " + rect0.toString());

        // Skapa med den w/h konstruktören
        Rectangle rect1 = new Rectangle( 30, 40);
        System.out.println("Rect1 w/h: " + rect1.toString());

        // Skapa med den x/y w/h konstruktören
        Rectangle rect2 = new Rectangle( 10, 20, 30, 40);
        System.out.println("Rect2 x/y & w/h: " + rect2.toString());

        // Set x/y
        rect1.setXY(5,8);
        System.out.println("Rect1 x: " + rect1.toString());

        // Set Width
        rect2.setWidth(20);
        System.out.println("Rect2 x: " + rect2.toString());

        // Beräkna och visa area och omkrets för rect2
        System.out.println("rect2.calcArea = " + rect2.calcArea());
        System.out.println("rect2.calcOmkrets = " + rect2.calcPerimeter());

        // Ändra rect2:s position till (10, 15) och storlek till (7, 12)
        rect2.setXY(10, 15);
        rect2.setWidth(7);
        rect2.setHeight(12);
        System.out.println("Updated Rect2: " + rect2);
    }
}