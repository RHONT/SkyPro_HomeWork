package Java_Core.Home_Work_4;

import java.util.GregorianCalendar;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
        task5();


    }

    private static void task1() {
        System.out.println("Задача 1");

        byte clientOS = 0;
        switch (clientOS) {
            case 0:
                System.out.println("Установите версию приложения для iOS по ссылке");
                break;
            case 1:
                System.out.println("Установите версию приложения для Android по ссылке");
                break;
            default:
                System.out.println("Неверный ввод данных");
        }
        System.out.println("-".repeat(40));
    }

    private static void task2() {
        System.out.println("Задача 2");
        byte clientOS = 0;
        int clientDeviceYear = 2015;
        String articlePhone = String.valueOf(clientOS);

        if (clientDeviceYear < 2015) articlePhone += "old";

        {
            switch (articlePhone) {
                case "0":
                    System.out.println("Установите версию приложения для iOS по ссылке");
                    break;
                case "0old":
                    System.out.println("Установите облегченную версию приложения для iOS по ссылке");
                    break;
                case "1":
                    System.out.println("Установите версию приложения для Android по ссылке");
                    break;
                case "1old":
                    System.out.println("Установите облегченную версию приложения для Android по ссылке");
                    break;
                default:
                    System.out.println("Неверный ввод данных");
            }
        }
        System.out.println("-".repeat(40));

    }

    private static void task3() {
        System.out.println("Задача 3");
        int year = 2021;
        if (new GregorianCalendar().isLeapYear(year)) {
            System.out.println(year + " год является високосным");
        } else System.out.println(year + " год не является високосным");
        System.out.println("-".repeat(40));
    }

    private static void task4() {
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        if (deliveryDistance > 0 && deliveryDistance <= 20) {
            System.out.println("Потребуется дней:" + 1 + " день");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("Потребуется дней:" + 2 + " дня");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("Потребуется дней:" + 3 + " дня");
        } else System.out.println("Доставки в такую даль не делаем");
        System.out.println("-".repeat(40));
    }

    private static void task5() {
        System.out.println("Задача 5");
        byte monthNumber = 12;
        switch (monthNumber) {
            case 6:
            case 7:
            case 8:
                System.out.println("Лето");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;

            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;

            default:
                System.out.println("Недопустимое значение");
        }
        System.out.println("-".repeat(40));

    }
}
