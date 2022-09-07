package L4HW;//5.	Создайте программу, которая возвращает все пары множителей введённого числа (если таковые есть).

import java.io.IOException;
import java.util.Scanner;

public class HW4_5 {
    public static void main(String[] args) throws IOException {

        Scanner input = new Scanner(System.in);
        System.out.println("Vvedite cislo");

        int num = input.nextInt();

        for (int i=1; i<num; i++){
            for (int j=1; j<num; j++ ){
                if (i*j == num & i<j){
                    System.out.println(i + "*" + j + "=" + (i*j) );
                }
            }
        }

    }
}

