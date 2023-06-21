package HomeWork;

import java.util.Scanner;

public class HomeWorkCoffee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите номер напитка: " +
                " ( 1 = Эспрессо; 2 = Американо; 3 = Капучино; 4 = Чай)  ");
        int type = sc.nextInt();
        sc.close();

        switch (type) {
            case 1:
                Espresso();
                break;
            case 2:
                Americano();
                break;
            case 3:
                Cappucino();
                break;
            case 4:
                Tea();
                break;
            default:
                System.out.println("Ошибка");
                break;
        }
    }
    public static void Espresso() {
        System.out.println("Готовится Espresso...");
        System.out.println("Готово");
    }
    public static void Americano() {
        Espresso();
        System.out.println("Добавляется вода...");
        System.out.println("Americano готов");
    }
    public static void Cappucino() {
        Espresso();
        System.out.println("Добавляется молоко...");
        System.out.println("Cappucino готов");
    }

    public static void Tea() {
        System.out.println("Смешивается чай с водой");
        System.out.println("Чай готов");

    }
}
