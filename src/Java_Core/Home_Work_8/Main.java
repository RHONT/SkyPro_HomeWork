package Java_Core.Home_Work_8;

import java.util.IntSummaryStatistics;
import java.util.Random;


public class Main {
    private static final IntSummaryStatistics costs =
            new Random().
                    ints(30, 100_000, 200_000).summaryStatistics();

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задача 1");

        System.out.println("Сумма трат за месяц составила " + costs.getSum() + " рублей");

        System.out.println("+++".repeat(20));
    }

    private static void task2() {
        System.out.println("Задача 2");

        System.out.println("Минимальная сумма трат за день составила " + costs.getMin() + " рублей");
        System.out.println("Максимальная сумма трат за день составила " + costs.getMax() + " рублей");

        System.out.println("+++".repeat(20));
    }

    private static void task3() {
        System.out.println("Задача 3");
        System.out.printf("Средняя сумма трат за месяц составилa %.2f рублей\n", costs.getAverage());
        System.out.println("+++".repeat(20));
    }

    private static void task4() {
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
        System.out.println();

        System.out.println("+++".repeat(20));
    }
}
