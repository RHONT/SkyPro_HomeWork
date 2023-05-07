package Java_Core.Home_Work_7;

import java.util.Arrays;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    private static void task1() {
        System.out.println("Задача 1");

        int[] ints = new int[]{1, 2, 3};
        double[] doubles = {1.11, 2.22, 3.33};
        String[] strings = new String[]{"One", "Two", "Three"};

        System.out.println("+++".repeat(20));
    }

    private static void task2() {
        System.out.println("Задача 2");

        Integer[] ints = new Integer[]{1, 2, 3};
        Double[] doubles = {1.57, 7.654, 9.986};
        String[] strings = new String[]{"One", "Two", "Three"};

        printArrays(ints);
        printArrays(doubles);
        printArrays(strings);
        System.out.println("+++".repeat(20));
    }

    private static void task3() {
        System.out.println("Задача 3");

        Integer[] ints = new Integer[]{1, 2, 3};
        Double[] doubles = {1.57, 7.654, 9.986};

        printReversArrays(ints);
        printReversArrays(doubles);

        System.out.println("+++".repeat(20));
    }

    private static void task4() {
        System.out.println("Задача 4");
        Integer[] ints = new Integer[]{1, 2, 3};
        Stream<Integer> stream = Stream.of(ints).map(a -> (a % 2 == 0 ? a : (a + 1)));
        printArrays(stream.toArray());
        System.out.println("+++".repeat(20));
    }

    private static void task5() {
        System.out.println("Задача 5");
        System.out.println("+++".repeat(20));
    }

    private static <T> void printArrays(T[] arr) {
        System.out.print(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.print(", " + arr[i]);
        }
        System.out.println();
    }

    private static <T> void printReversArrays(T[] arr) {
        System.out.print(arr[arr.length - 1]);
        for (int i = arr.length - 2; i >= 0; i--) {
            System.out.print(", " + arr[i]);
        }
        System.out.println();
    }

}
