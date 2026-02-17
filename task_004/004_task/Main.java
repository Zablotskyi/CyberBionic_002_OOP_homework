public class Main {
    public static void main(String[] args) {
        Car car1 = new Car();
        Car car2 = new Car(1998);
        Car car3 = new Car(1998, "Black/white");
        Car car4 = new Car(1998, "Black/white", 220);
        Car car5 = new Car(1998, 220, 2100, "Black/white");
    }
}
