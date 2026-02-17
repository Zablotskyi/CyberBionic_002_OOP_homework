public class MyArea {
    private static final double PI = 3.14;
    private int radius;

    public MyArea() {
    }

    public MyArea(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MyArea{" +
                "radius=" + radius +
                '}';
    }

    public static void areaOfCircle(int radius) {
        double area = PI * Math.pow(radius, 2);

        System.out.println("Радіус кола дорівнює: " + area);
    }
}
