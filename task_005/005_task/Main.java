import java.util.Scanner;

//Завдання 5
//Використовуючи Intelij IDEA, створити проект, пакет. Створити клас MyArea, в ньому оголосити константу PI = 3.14 та
//статичний метод areaOfCircle, який повинен приймати радіус та використовуючи PI порахувати площу кола. Створити клас
//Main, де запустити цей метод.
public class Main {
    static MyArea myArea = new MyArea();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введіть радіус кола (ціле число): ");
        myArea.setRadius(scanner.nextInt());
        MyArea.areaOfCircle(myArea.getRadius());
    }
}
