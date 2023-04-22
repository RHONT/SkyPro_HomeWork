package Java_Core.Home_Work_3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    static public void task1() {
        System.out.println("Задача 1");

        ConditionGenerator conditionGenerator = new ConditionGenerator();


        conditionGenerator.setConditions(new int[]{0, 17}, "Если возраст человека равен %insertValue, " +
                "то он не достиг совершеннолетия, нужно немного подождать");
        conditionGenerator.setConditions(
                new int[]{18, 100},
                "Если возраст человека равен %insertValue, то он совершеннолетний");

        conditionGenerator.runConditions(conditionGenerator, "Введите возраст");
        System.out.println("-".repeat(40));
    }


    static public void task2() {
        System.out.println("Задача 2");

        ConditionGenerator conditionGenerator = new ConditionGenerator();

        conditionGenerator.setConditions
                (new int[]{-50, 4},
                        "На улице %insertValue градусов, нужно надеть шапку");

        conditionGenerator.setConditions(
                new int[]{5, 100},
                "На улице %insertValue градусов, можно идти без шапки");

        conditionGenerator.runConditions(conditionGenerator, "Введите температуру за окном");
        System.out.println("-".repeat(40));
    }

    static public void task3() {
        System.out.println("Задача 3");

        ConditionGenerator conditionGenerator = new ConditionGenerator();

        conditionGenerator.setConditions
                (new int[]{0, 59},
                        "Если скорость %insertValue, то придется заплатить штраф");

        conditionGenerator.setConditions(
                new int[]{60, 400},
                "Если скорость  %insertValue можно ездить спокойно");

        conditionGenerator.runConditions(conditionGenerator, "Введите вашу скорость");
        System.out.println("-".repeat(40));
    }

    static public void task4() {
        System.out.println("Задача 4");

        ConditionGenerator conditionGenerator = new ConditionGenerator();

        conditionGenerator.setConditions
                (new int[]{2, 6},
                        "Если человеку %insertValue, то ему нужно ходить в детский сад");
        conditionGenerator.setConditions
                (new int[]{7, 18},
                        "Если человеку %insertValue, то ему нужно ходить в школу");
        conditionGenerator.setConditions
                (new int[]{18, 24},
                        "Если человеку %insertValue, то его место в университете");
        conditionGenerator.setConditions
                (new int[]{25, 100},
                        "Если человеку %insertValue, то ему пора ходить на работу");

        conditionGenerator.runConditions(conditionGenerator, "Введите возраст человека");
        System.out.println("-".repeat(40));
    }

    static public void task5() {
        System.out.println("Задача 5");

        ConditionGenerator conditionGenerator = new ConditionGenerator();

        conditionGenerator.setConditions
                (new int[]{0, 4},
                        "Если возраст ребенка равен %insertValue, то он не может кататься на аттракционе");
        conditionGenerator.setConditions
                (new int[]{5, 13},
                        "Если возраст ребенка равен  %insertValue, то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        conditionGenerator.setConditions
                (new int[]{14, 100},
                        "Если возраст ребенка равен %insertValue, то он может кататься без сопровождения взрослого");

        conditionGenerator.runConditions(conditionGenerator, "Введите возраст ребенка");
        System.out.println("-".repeat(40));
    }

    static public void task6() {
        System.out.println("Задача 6");

        ConditionGenerator conditionGenerator = new ConditionGenerator();

        conditionGenerator.setConditions
                (new int[]{1, 60},
                        "Билет с номером %insertValue = сидячее место");
        conditionGenerator.setConditions
                (new int[]{61, 102},
                        "Билет с номером %insertValue = Стоячее место");
        conditionGenerator.setConditions
                (new int[]{103, 1000},
                        "Билет с номером %insertValue = место на крыше вагона");

        conditionGenerator.runConditions(conditionGenerator, "Введите возраст ребенка");
        System.out.println("-".repeat(40));
    }

    static public void task7() {
        Scanner sc = new Scanner(System.in);
        List<Integer> accum = new ArrayList<>(3);

        while (accum.size() < 3) {
            System.out.println("Введите число");
            accum.add(sc.nextInt());

        }
        int maxValue =
                accum.get(0) > accum.get(1) ?
                        accum.get(0) > accum.get(2) ? accum.get(0) : accum.get(2) :
                        accum.get(1) > accum.get(2) ? accum.get(1) : accum.get(2);
        System.out.println("Наибольшее число = " + maxValue);

    }


    static class ConditionGenerator {
        Map<int[], String> conditions = new HashMap<>();

        public ConditionGenerator() {
        }

        public void setConditions(int[] interval, String massage) {
            conditions.put(interval, massage);
        }

        public String[] returnAnswer(int param) {
            for (var element : conditions.entrySet()) {
                int[] temp = element.getKey();
                if (param >= temp[0] && param <= temp[1]) {
                    return new String[]{
                            String.valueOf(param),
                            String.valueOf(element.getValue())};
                }
            }
            return new String[]{
                    String.valueOf(param),
                    "Введен неверный параметр"};
        }

        public void runConditions(ConditionGenerator conditionGenerator, String startMessage) {
            Scanner sc = new Scanner(System.in);
            String strForScan;
            String[] answer;

            for (; ; ) {
                System.out.println("Для завершения программы введите  q");
                System.out.println(startMessage);

                strForScan = sc.next();
                if (strForScan.equals("q")) {
                    break;
                }
                answer = conditionGenerator.returnAnswer(Integer.parseInt(strForScan));
                answer[1] = answer[1].replaceFirst("%insertValue", answer[0]);
                System.out.println(answer[1]);
            }
        }
    }


}
