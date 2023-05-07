package Java_Core.Home_Work_5;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
    }

    private static void task1() {
        System.out.println("Задача 1");
        for (int i = 1; i < 11; i++) {
            System.out.println(i);

        }
        System.out.println("-=-=".repeat(10));
    }

    private static void task2() {
        System.out.println("Задача 2");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);

        }
        System.out.println("-=-=".repeat(10));
    }

    private static void task3() {
        System.out.println("Задача 3");
        for (int i = 0; i < 18; i += 2) {
            System.out.println(i);

        }
        System.out.println("-=-=".repeat(10));
    }

    private static void task4() {
        System.out.println("Задача 4");
        for (int i = 10; i > -11; i--) {
            System.out.println(i);

        }
        System.out.println("-=-=".repeat(10));
    }

    private static void task5() {
        System.out.println("Задача 5");
        for (int i = 1904; i < 2096; i += 4) {
            System.out.println(i + " год является високосным");

        }
        System.out.println("-=-=".repeat(10));
    }

    private static void task6() {
        System.out.println("Задача 6");
        for (int i = 7; i < 100; i += 7) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("-=-=".repeat(10));
    }

    private static void task7() {
        System.out.println("Задача 7");
        for (int i = 1; i < 10; i++) {
            System.out.print((int) Math.pow(2, i) + " ");
        }
        System.out.println();
        System.out.println("-=-=".repeat(10));
    }

    private static void task8() {

        System.out.println("Задача 8");
        int sumSavings = 0;
        int investment = 29_000;
        for (int i = 1; i < 13; i++) {
            sumSavings += investment;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + sumSavings + " рублей");
        }
        System.out.println("-=-=".repeat(10));
    }

    private static void task9() {

        System.out.println("Задача 9");
        double sumSavings = 0;
        double investment = 29_000;
        double interestRate = 1.01;
        for (int i = 1; i < 13; i++) {
            sumSavings += investment;
            sumSavings *= interestRate;
            System.out.printf("Месяц " + i + ", сумма накоплений равна %.2f рублей\n", sumSavings);
        }
        System.out.println("-=-=".repeat(10));
    }

    private static void task10() {

        System.out.println("Задача 10");

        for (int i = 1; i < 11; i++) {
            System.out.printf("2 * %d = %d\n", i, 2 * i);
        }
        System.out.println("-=-=".repeat(10));
    }

}
