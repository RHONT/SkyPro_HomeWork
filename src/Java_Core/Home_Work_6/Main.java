package Java_Core.Home_Work_6;

import java.time.LocalDate;
import java.util.Scanner;

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

    }

    private static void task1() {
        System.out.println("Задача 1");
        int accumulation = 0;
        int contribution = 15_000;
        int month = 0;
        while (accumulation < 2_459_000) {
            accumulation += contribution;
            month++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n", month, accumulation);
        }

        System.out.println("===".repeat(10));
    }

    private static void task2() {
        System.out.println("Задача 2");
        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.print(counter + " ");
        }
        System.out.println();
        for (; counter > 0; counter--) {
            System.out.print(counter + " ");
        }


        System.out.println("===".repeat(10));
    }

    private static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int birthRate = 17;
        int mortalityRate = 8;

        int populationGrowthPerYear;
        int mortalityGrowthPerYear;

        for (int i = 2023; i < 2033; i++) {
            populationGrowthPerYear = (population / 1000) * birthRate;
            mortalityGrowthPerYear = (population / 1000) * mortalityRate;
            population += populationGrowthPerYear - mortalityGrowthPerYear;

            System.out.printf("Год %d, численность населения составляет %d \n", i, population);
        }
        System.out.println("===".repeat(10));
    }

    private static void task4() {
        System.out.println("Задача 4");
        double accumulation = 15_000;
        int percent = 7;
        int month = 1;

        while (accumulation < 12_000_000) {
            accumulation += accumulation / 100 * percent;
            System.out.printf("Месяц %d сумма вклада = %.2f\n", month, accumulation);
            month++;
        }

        System.out.println("===".repeat(10));
    }

    private static void task5() {
        System.out.println("Задача 5");

        double accumulation = 15_000;
        int percent = 7;
        int month = 1;

        while (accumulation < 12_000_000) {
            accumulation += accumulation / 100 * percent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d сумма вклада = %.2f\n", month, accumulation);
            }

            month++;
        }

        System.out.println("===".repeat(10));

    }

    private static void task6() {
        System.out.println("Задача 6");

        double accumulation = 15_000;
        int percent = 7;
        int month = 1;
        int wishYear = 9;
        int sumMonth = wishYear * 12;

        while (month <= sumMonth) {
            accumulation += accumulation / 100 * percent;
            if (month % 6 == 0) {
                System.out.printf("Месяц %d сумма вклада = %.2f\n", month, accumulation);
            }

            month++;
        }

        System.out.println("===".repeat(10));
    }

    private static void task7() {
        System.out.println("Задача 7");
        int friday = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число первой пятницы");
        friday = sc.nextInt();

        for (int i = friday; i < 31; i += 7) {
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет\n", i);

        }


        System.out.println("===".repeat(10));
    }

    private static void task8() {
        System.out.println("Задача 8");

        int nowYear = LocalDate.now().getYear();
        int pastYear = 200;
        int nextYear = 100;
        int currentCount = 0;

        while (currentCount <= (nowYear + nextYear)) {

            if ((currentCount >= (nowYear - pastYear)) && currentCount < nowYear) {
                System.out.println(currentCount);
            }
            if (currentCount >= nowYear) {
                System.out.println(currentCount);
            }
            currentCount += 79;
        }

        System.out.println("===".repeat(10));
    }

}
