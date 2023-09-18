package com.rzktype;


public class Main {
    public static byte byteMaxVal = Byte.MAX_VALUE;
    public static int intMaxVal = Integer.MAX_VALUE;
    public static double doubleMaxVal = Double.MAX_VALUE;

    public static void main(String[] args) {
        //переполнение при вычислении byte
        System.out.println("### Результат переполнения byte: " + (byte) (byteMaxVal + 1));
        //переполнение при вычислении int
        System.out.println("### Результат переполнения int: " + (intMaxVal + 1));
        //конкатенация строк, оператор "+" не учитывается как математический и используется для склеивания строк преобразуя все выражение в тип String
        System.out.println("### Результат переполнения int: " + 123 + 1);
        //переполнение double
        double result = doubleMaxVal + 12.23D;
        System.out.println("### Результат переполнения double: " + result);
        if (result == doubleMaxVal) {
            System.out.println("Значения идентичны - для типа Double переполнение не встречается");
        } else {
            System.out.println("Значения различаются");
        }

        //сравнение через тернарные операторы
        String answer = (result == doubleMaxVal) ? "Значения идентичны - для типа Double переполнение не встречается" : "Значения различаются";
        System.out.println(answer);

        //умножение double * double = double
        new Main().multiple(2.34D,2.56D);

        //умножение float * float = float
        new Main().multiple(2.34F,2.56F);


        //умножение double * float = double,
        new Main().multiple(2.34D,2.56F);

        /* при перемножении разных типов вещественных чисел из-за различий в размере памяти,
        различается и точность (кол-во знаком после запятой),
        поэтому результат вычисления отличается если перемножать одинаковые типы данных
        */

        //Вещественные числа нельза сравнивать через
        double f1 = 0.0;
        for (int i = 1; i <= 11; i++) {
            f1 += .1;
        }

        //Умножаем 0.1 на 11
        double f2 = 0.1 * 11;

        //должно получиться одно и то же - 1.1 в обоих случаях
        System.out.println("f1 = " + f1);
        System.out.println("f2 = " + f2);

        // Проверим!
        if (f1 == f2)
            System.out.println("### f1 и f2 равны!");
        else
            System.out.println("### f1 и f2 не равны!");

        /*сравнить можно через объявление заданной точности
        Проверим!
         */

        final double threshold = 0.0001;
        if (Math.abs(f1 - f2) < threshold)
            System.out.println("### f1 и f2 равны");
        else
            System.out.println("### f1 и f2 не равны");

        //умножение double * int = double
        new Main().multiple(2.34D,32);
    }

    public void multiple(double first, double second){
        System.out.println("### Результат умножения:" + first + " на " + second + " равен: " + (first*second));
    }

    public void multiple(float first, float second){
        System.out.println("### Результат умножения:" + first + " на " + second + " равен: " + (first*second));
    }

    public void multiple(double first, int second){
        System.out.println("### Результат умножения:" + first + " на " + second + " равен: " + (first*second));
    }

    public void multiple(double first, float second){
        System.out.println("### Результат умножения:" + first + " на " + second + " равен: " + (first*second));
    }

}