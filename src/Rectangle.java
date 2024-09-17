public class Rectangle {

    // instansvariabler
    int x,y, width, height;

    // 1.Const = 0
    public Rectangle() {}

    // 2.Const = x/y
    public Rectangle(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 3.Const = x/y & w&h
    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    // Metod beräkna area
    public double calcArea() {
        return width * height;
    }

    // Metod beräkna omkrets
    public double calcPerimeter() {
        return 2 * (width + height);
    }

    // Metod set x/y
    public void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Metod setWidth
    public void setWidth(int width) {
        this.width = width;
    }

    // Metod setHeight
    public void setHeight(int height) {
        this.height = height;
    }

    @Override // Metod toString visa info
    public String toString() {
        return "Rectangle [x=" + x + ", y=" + y + ", width=" + width + ", height=" + height + "]";
    }
}

