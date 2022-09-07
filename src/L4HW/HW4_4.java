package L4HW;//4.	Создайте программу,
// которая принимает 5 численных значений (либо буквенных символов одного регистра)
// и возвращает их в порядке возрастания (или в алфавитном порядке, если пользователь ввёл буквы)

import java.util.Arrays;
import java.util.Scanner;

public class HW4_4 {

    public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            int[] myArray = new int[5];
            System.out.println("Enter the elements of the array :");

            for(int i = 0; i<5; i++) {
                myArray[i] = sc.nextInt();
            }
            for(int i = 0; i<5; i++) {
                for (int j = i+1; j<myArray.length; j++) {
                    if(myArray[i] > myArray[j]) {
                        int temp = myArray[i];
                        myArray[i] = myArray[j];
                        myArray[j] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(myArray));
        }





    static void bubblesort(int[] arr) {
        for (int i = 0; i < arr.length-1; i++){
            for (int j = i+1; j < arr.length; j++){
                if (arr[i] < arr[j]) {
                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }
        }
    }

}

