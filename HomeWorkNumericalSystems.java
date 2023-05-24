package HomeWork;

import java.util.Scanner;

public class HomeWorkNumericalSystems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Введите целое число: ");
        int q = sc.nextInt();

        System.out.println("Перевод числа в десятичную сис-му = " + q);


        System.out.println("Перевод числа в восьмиричную сис-му = " + Integer.toOctalString(q));


        System.out.println("Перевод числа в двоичную сис-му = " + Integer.toBinaryString(q));


        System.out.println("Перевод числа в шеснадцатиричную сис-му = " + Integer.toHexString(q));


        sc.close();
    }
}
