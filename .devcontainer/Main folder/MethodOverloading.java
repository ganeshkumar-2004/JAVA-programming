public class MethodOverloading {
    public static void main(String[] args) {
        int x = 4;
        int y = 6;
        int r = 4;
        int Area1=AreaOfRectangle(x, y);
        System.out.println("The area of the Rectangle: "+Area1);
        double Area2 = AreaOfCircle(r);
        System.out.println("The area of the Circle: " +Area2);

    }

    public static int AreaOfRectangle(int a, int b) {
        int AreaOfCircle = a * b;
        return AreaOfCircle;
    }

    public static double AreaOfCircle(int b) {
        double AreaOfCircle = (3.14) * b * b;
        return AreaOfCircle;
    }
}
