//Завдання 4
//Використовуючи Intelij IDEA, створити проект, пакет. (Наново!) Створити клас Машина з полями рік(int),
// швидкість(double), вага(int) колір(String). Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а,
// 3-а, 4-а. Перевантажити конструктори викликаючи конструктор із конструктора. Створити клас Main, де створити
// екземпляри класу Машина з різними параметрами.
public class Car {
    private int year;
    private double speed;
    private int weight;
    private String color;

    public Car() {
        this(0, 200, 1600, "unknow");
    }

    public Car(int year) {
        this.year = year;
    }

    public Car(int year, String color) {
        this.year = year;
        this.color = color;
    }

    public Car(int year, String color, double speed) {
        this.year = year;
        this.color = color;
        this.speed = speed;
    }

    public Car(int year, double speed, int weight, String color) {
        this.year = year;
        this.speed = speed;
        this.weight = weight;
        this.color = color;
    }
}
