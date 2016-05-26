package com.patronus47;
import java.util.Scanner;
import java.lang.Math;

/**
 * Created by Fandorin on 25.05.2016.
 */
public class Main {
    public static void main(String[] args) {
        // Решение квадратного уравнения с пользовательским вводом переменных a, b, c

        System.out.println("a*x*x + b*x + c = 0");
        System.out.println();


        // Объявляем переменные a, b, c, d (дискриминант) и x

        double a = 0;
        double b = 0;
        double c = 0;
        double d;
        double x1;
        double x2;
        double x1_2;

        Scanner sc = new Scanner(System.in); // создаем объект класса Scanner

        // просим пользователя ввести переменные a, b, c

        System.out.print("Введите переменную a = ");
        a = sc.nextDouble();

        System.out.print("Введите переменную b = ");
        b = sc.nextDouble();


        System.out.print("Введите переменную c = ");
        c = sc.nextDouble();

        // считаем дискриминант и выводим его значение на экран

        d = b * b - 4 * a * c;

        System.out.println();
        System.out.println("D = b*b - 4*a*c = " + d);

        // в зависимости от значения дискриминанта определяем значения корней
        // и выводим их на экран (или указываем на отсутствие корней)

        if (d > 0) {
            x1 = (-b - Math.sqrt(d)) / (2 * a);
            x2 = (-b + Math.sqrt(d)) / (2 * a);
            System.out.println("У уравнения два корня: x1 = " + x1 + ";" + " x2 = " + x2);

        } else if (d == 0) {
            x1_2 = -b / (2 * a);
            System.out.println("У уравнения два равных друг другу корня: x1_2 = " + x1_2);

        } else {
            System.out.println("У уравнения нет корней");

        }

        // вывод введенных пользователем чисел в порядке возрастания

        // объявляем переменные для чисел, которые будет вводить пользователь

        int numb_1;
        int numb_2;
        int numb_3;

        Scanner numb = new Scanner(System.in);

        System.out.println();
        System.out.println("Выстраиваем последовательность трех чисел по возрастанию");
        System.out.print("Введите первое число: "); // Пользователь вводит первое число
        numb_1 = numb.nextInt();

        System.out.print("Ввведите второе число: "); // Пользователь вводит второе число
        numb_2 = numb.nextInt();

        System.out.print("Введите третье число: "); // Пользователь вводит третье число
        numb_3 = numb.nextInt();

        // сравнение введенных пользователем чисел и выстраивание последовательности
        // от меньшего к большему

        if ((numb_1 < numb_2) && (numb_1 < numb_3)) {
            if (numb_2 < numb_3) {
                System.out.print("Результат: " + numb_1 + ", " + numb_2 + ", " + numb_3);

            } else {
                if (numb_2 > numb_3);{
                    System.out.print("Результат: " + numb_1 + ", " + numb_3 + ", " + numb_2);
                }
            }
        }
        else if ((numb_2 < numb_1) && (numb_2 < numb_3)) {
            if (numb_1 < numb_3) {
                System.out.print("Результат: " + numb_2 + ", " + numb_1 + ", " + numb_3);

            } else {
                if (numb_1 > numb_3);{
                    System.out.print("Результат: " + numb_1 + ", " + numb_3 + ", " + numb_2);
                }
            }
        }
        else if ((numb_3 < numb_1) && (numb_3 < numb_2)) {
            if (numb_1 < numb_2) {
                System.out.print("Результат: " + numb_3 + ", " + numb_1 + ", " + numb_2);

            } else {
                if (numb_1 > numb_2);{
                    System.out.print("Результат: " + numb_3 + ", " + numb_2 + ", " + numb_1);
                }
            }

        }
    }
}
