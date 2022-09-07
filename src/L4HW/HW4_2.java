package L4HW;//2.	Создайте программу, которая выводит на экран приветствие на языке пользователя,
// который он указал заранее(3-4 варианта)

import java.util.Objects;
import java.util.Scanner;

public class HW4_2 {
    public static void main(String[] args) {

        String russian = "ru";
        String romanian = "ro";
        String english = "en";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your language");
        String lang = scanner.next();
        System.out.println("Enter your name");
        String name = scanner.next();
        if (Objects.equals(lang, russian))
        {System.out.println(name + " Привет! ");
        } else if  (Objects.equals(lang, romanian)) {System.out.println(name + " Salut! ");
        } else if (Objects.equals(lang, english)) {System.out.println(name + " Hello! ");
        } else System.out.println(name + " choose another language. ");
    }
}
