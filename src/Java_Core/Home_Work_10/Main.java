package Java_Core.Home_Work_10;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {
        task1(2023);
        task2(0, 2015);
        // Запутался в условиях задания. Нужно ли выводить текст или нет?
        // По итогу написал по основной формулировке задания - написать метод, который возвращает кол-во дней
        task3(50);
    }

    private static void task1(int year) {
        print("Задача 1");

        if (isLeapYear(year)) {
            print(year + " год является високосным");
        } else print(year + " год не является високосным");

        print("-".repeat(40));
    }

    private static void task2(int os, int clientDeviceYear) {
        print("Задача 2");
        print("Установите " + typeOs(clientDeviceYear) + " версию приложения для " + varietyOs(os) + " по ссылке");
        print("-".repeat(40));
    }


    private static void task3(int distance) {
        print("Задача 3");
        System.out.println(calcDistance(distance));
        print("-".repeat(40));
    }

    private static int calcDistance(int deliveryDistance) {
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            return 1;
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            return 3;
        } else return -1;
    }

    private static boolean isLeapYear(int year) {
        return new GregorianCalendar().isLeapYear(year);
    }

    private static String varietyOs(int os) {
        return os == 0 ? "iOS" : "Android ";
    }

    private static String typeOs(int clientDeviceYear) {
        return clientDeviceYear >= 2015 ? "обычную" : "облегченную";
    }

    private static void print(String str) {
        System.out.println(str);
    }
}
