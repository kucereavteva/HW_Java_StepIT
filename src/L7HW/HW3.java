package L7HW; //3.	Найти самое длинное слово в предложении
import java.util.Scanner;

public class HW3 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Vvedite predlojenie: ");
        String sentence = scan.nextLine();
        String[] words = sentence.split(" ");
        int longestWord= 0;
        for (int i = 0; i < words.length; i++){
            if (words[i].length()>words[longestWord].length()  ) {
                 longestWord = i;
            }
        }
        System.out.println(words[longestWord]);
        System.out.println("Dlina etogo slova = " + words[longestWord].length());
    }
}











