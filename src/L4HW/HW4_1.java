package L4HW;//1.	Напишите калькулятор, который получает числа введенные пользователем,
// и производит с ними заданные действия – поиск суммы / среднего значения/ сравнение.

import java.util.Scanner;

public class HW4_1 {
    public static void main(String[] args){

        double num1;
        double num2;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the first number");
        num1 = input.nextInt();

        System.out.println("please enter the second number");
        num2 = input.nextInt();

        System.out.println("sum = " + (num1+num2));
        System.out.println("average = " + (num1+num2)/2);

        if(num1<num2)System.out.println("num1<num2");
        else System.out.println("num1>num2");
    }
}
