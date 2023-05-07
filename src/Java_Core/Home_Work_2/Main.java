package Java_Core.Home_Work_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

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

        int a = 1024;
        byte b = 64;
        short c = 1_536;
        long d = 2_000_000L;
        float e = 435.567f;
        double f = 467.333333d;
        System.out.println("Значение переменной a с типом int = " + a);
        System.out.println("Значение переменной b с типом byte = " + b);
        System.out.println("Значение переменной c с типом short = " + c);
        System.out.println("Значение переменной d с типом long = " + d);
        System.out.println("Значение переменной e с типом float = " + e);
        System.out.println("Значение переменной f с типом double = " + f);

        System.out.println("-".repeat(40));
    }

    private static void task2() {
        System.out.println("Задача 2");

        float a = 27.12f;
        long b = 987_678_965_549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;

        System.out.println("-".repeat(40));
    }

    private static void task3() {
        System.out.println("Задача 3");

        byte lp = 23;
        byte as = 27;
        byte ea = 30;
        short paper = 480;
        short result = (short) (paper / (lp + as + ea));

        System.out.println("На каждого ученика рассчитано " + result + " листов бумаги");

        System.out.println("-".repeat(40));
    }

    private static void task4() {
        System.out.println("Задача 4");
        short speedMachine = 16;

        class Calculator {
            public Calculator(int... paramMinutes) {
                printAnswer(paramMinutes);
            }

            void printAnswer(int... paramMinutes) {
                for (int element : paramMinutes) {
                    int result = ((element / 2) * speedMachine);
                    System.out.println("За " + element + " минут машина произвела " + result + " штук бутылок");
                }
            }
        }

        Calculator calc = new Calculator(20, 1440, 4320, 43200);
        System.out.println("-".repeat(40));
    }

    private static void task5() {
        System.out.println("Задача 5");

        byte sumCans = 120;
        byte whiteColor = 2;
        byte brownColor = 4;
        byte sumClasses = (byte) (sumCans / (whiteColor + brownColor));
        System.out.printf("В школе, где %d классов, нужно %d банок белой краски и %d банок коричневой краски\n",
                sumClasses, whiteColor, brownColor);

        System.out.println("-".repeat(40));
    }

    private static void task6() {
        System.out.println("Задача 6");
        Map<Product, Integer> recipe = new HashMap<>();
        Float[] total;

        Function<Map<Product, Integer>, Float[]> resultFunc = (a) -> {

            Float[] totalResult = new Float[2];
            int weightGramm = 0;

            for (var element : a.entrySet()) {
                weightGramm += element.getKey().getWeight() * element.getValue();

            }
            totalResult[0] = (float) weightGramm;
            totalResult[1] = (float) weightGramm / 1000;

            return totalResult;
        };


        recipe.put(Product.BANANAS, 5);
        recipe.put(Product.MILK, 200);
        recipe.put(Product.ICE_CREAM, 2);
        recipe.put(Product.EGGS, 4);

        total = resultFunc.apply(recipe);

        System.out.println("Выбранный завтрак чемпиона состоит из:");
        System.out.printf("Вес в граммах: %.2f\nВес в килограммах: %.2f\n", total[0], total[1]);

        System.out.println("-".repeat(40));
    }

    private static void task7() {
        System.out.println("Задача 7");

        byte targetWeight = 7;
        float param_1 = 0.25f;
        float param_2 = 0.5f;

        System.out.println("Каждый день по 250 грамм = " + targetWeight / param_1 + " дней");
        System.out.println("Каждый день по 500 грамм = " + targetWeight / param_2 + " дней");
        System.out.printf("А в среднем = %.1f дней\n", targetWeight / ((param_2 + param_1) / 2));
        System.out.println("-".repeat(40));
    }

    private static void task8() {
        System.out.println("Задача 8");

        class Employee {
            private final String name;
            private int salary;

            public Employee(String name, int salary) {
                this.name = name;
                this.salary = salary;
            }

            public String getName() {
                return name;
            }

            public int getSalary() {
                return salary;
            }

            public void setSalary(int salary) {
                this.salary = salary;
            }
        }

        Employee masha = new Employee("Маша", 67_760);
        Employee den = new Employee("Денис", 83_690);
        Employee christina = new Employee("Кристина", 76_230);
        List<Employee> employees = new ArrayList<>(List.of(masha, den, christina));

        for (var element : employees) {
            int difference = element.getSalary() / 10;
            element.setSalary(difference + element.getSalary());
            System.out.printf("%s теперь получает %d рублей. Годовой доход вырос на %d рублей\n",
                    element.getName(), element.getSalary(), difference * 12);
        }


        System.out.println("-".repeat(40));
    }
}

