package Java_Core.Home_Work_1;

import java.util.ArrayList;
import java.util.List;

/**
 * Задачи 1-3
 */

public class First {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    public static void task1(){
        System.out.println("Задача 1");

        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        List<Object> objects=new ArrayList<>(List.of(dog,cat,paper));
        printer(objects);

    }

    public static void task2(){
        System.out.println("Задача 2");

        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        dog+=4;
        cat+=4;
        paper+=4;

        List<Object> objects=new ArrayList<>(List.of(dog,cat,paper));
        printer(objects);
    }

    public static void task3(){
        System.out.println("Задача 3");

        var dog=8.0;
        var cat=3.6;
        var paper=763789;

        dog-=3.5;
        cat-=1.6;
        paper-=7639;

        List<Object> objects=new ArrayList<>(List.of(dog,cat,paper));

        printer(objects);
    }

    public static void printer(List<Object> param){
        int counter=0;
        for (var element:param) {
            System.out.print("Переменная " + (++counter) + " | " );
            System.out.print(element + " |  ");
            System.out.print(element. getClass().getSimpleName()+"\n");
        }
        System.out.println("-".repeat(50));
    }
}
