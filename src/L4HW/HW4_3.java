package L4HW;//3.	Создайте программу, определяющую является число чётным или нечётным.

import java.util.Scanner;

public class HW4_3 {
    public static void main(String[] args){

        int num;
        Scanner input = new Scanner(System.in);

        System.out.println("please enter the number");
        num = input.nextInt();

        if (num%2==0)System.out.println("The number is even");
        else System.out.println("The number is odd");
    }
}
