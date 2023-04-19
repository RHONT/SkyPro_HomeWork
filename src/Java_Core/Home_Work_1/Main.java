package Java_Core.Home_Work_1;

import java.util.*;

/**
 * Задачи 1-3
 */

public class Main {
    // накопитель сообщений для метода printet()
    private static Deque<String> infoLogger=new ArrayDeque<>();

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

    public static void task1(){
        System.out.println("Задача 1");

        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        infoLogger.add("Собака");
        infoLogger.add("Кошка");
        infoLogger.add("Бумага");

        printer(dog,cat,paper);
    }

    public static void task2(){
        System.out.println("Задача 2");

        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        infoLogger.add(dog + "+ 4 =");
        dog+=4;

        infoLogger.add(cat + "+ 4 =");
        cat+=4;

        infoLogger.add(paper + "+ 4 =");
        paper+=4;

        printer(dog,cat,paper);
    }

    public static void task3(){
        System.out.println("Задача 3");

        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        infoLogger.add(dog + "- 3.5 =");
        dog-=3.5;

        infoLogger.add(cat + "- 1.6 =");
        cat-=1.6;

        infoLogger.add(cat + "- 7639 =");
        paper-=7639;

        printer(dog,cat,paper);
    }

    public static void task4(){
        System.out.println("Задача 4");

        var friend=19;
        infoLogger.add("input value:");
        printer(friend);

        infoLogger.add(friend+" + 2 =");
        friend+=2;
        printer(friend);

        infoLogger.add(friend+" / 7 =");
        friend/=7;
        printer(friend);

    }

    public static void task5(){
        System.out.println("Задача 5");

        var frog=3.5;
        infoLogger.add("input value:");
        printer(frog);

        infoLogger.add(frog+" * 10 =");
        frog*=10;
        printer(frog);

        infoLogger.add(frog+" / 3.5 =");
        frog/=3.5;
        printer(frog);

        infoLogger.add(frog+" + 4 =");
        frog+=4;
        printer(frog);
    }

    public static void task6(){
        System.out.println("Задача 6");
        var firstWeightBoxer=78.2;
        var secondWeightBoxer=82.7;
        System.out.println("Общий вес двух бойцов:  " + (firstWeightBoxer+secondWeightBoxer));
        System.out.println("Разница в весе двух бойцов: " + Math.abs(firstWeightBoxer-secondWeightBoxer));
        System.out.println("-".repeat(40));
    }

    public static void task7(){
        System.out.println("Задача 7");

        var firstWeightBoxer=78.2;
        var secondWeightBoxer=82.7;

        var maxWeight=Math.max(firstWeightBoxer,secondWeightBoxer);
        var minWeight=Math.min(firstWeightBoxer,secondWeightBoxer);

        System.out.println("Вычитание из большего веса меньшего");
        System.out.println(maxWeight +" - " + minWeight+" = " + (maxWeight-minWeight));

        System.out.println("С помощь функции остаток от деления");
        System.out.println(maxWeight +" % " + minWeight+" = " + (maxWeight%minWeight));

        System.out.println("-".repeat(40));
    }

    public static void task8(){
        System.out.println("Задача 8");
        System.out.println("Всего работников в компании —" +(640/8)+" человек");
        System.out.println("Если в компании работает " + (640/8+94) + " человек, то всего " + (640/8+94)*8 +
                " часов работы может быть поделено между сотрудниками");

    }

    public static void printer(Object... param){

        for (var element:param) {
            System.out.printf("%-12s | ",infoLogger.poll());
            System.out.printf( "%-7s |  ",element.toString());
            System.out.print(element. getClass().getSimpleName()+"\n");
        }
        System.out.println("-".repeat(40));
    }


}
