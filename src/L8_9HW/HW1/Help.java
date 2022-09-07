package L8_9HW.HW1;

import java.util.Scanner;

public class Help {

    static int a = 0;

    public static void main(String[] args) {

        for (; ; ) {
            if (a == 0) {
                helpOn();
                showMenu();
            } else if (a==1){
                break;
            } else if (a==2){
                isValid();
                a=a-2;}
        }

    }

    static void helpOn() {
        String caseIf = "If";
        String caseSwitch = "Switch";
        String caseFor = "For";
        String caseWhile = "While";
        String caseDoWhile = "Do While";
        String caseBreak = "Break";
        String caseContinue = "Continue";

        System.out.println("Справка ");

        System.out.println("1. " + caseIf);
        System.out.println("2. " + caseSwitch);
        System.out.println("3. " + caseFor);
        System.out.println("4. " + caseWhile);
        System.out.println("5. " + caseDoWhile);
        System.out.println("6. " + caseBreak);
        System.out.println("7. " + caseContinue);
        System.out.println("8. Press q to quit the programm. ");


        System.out.println("Write the name of your case: ");
    }

    static int showMenu() {
        Scanner scan = new Scanner(System.in);

        String choose = scan.nextLine();


        switch (choose) {
            case ("If"):
                System.out.println("Oпepaтop if:\n");
                System.out.println("if(ycлoвиe) оператор;");
                System.out.println("else оператор;");
                break;
            case ("Switch"):
                System.out.println("Oпepaтop switch:\n");
                System.out.println("switch(выpaжeниe) {");
                System.out.println(" case константа:");
                System.out.println(" последовательность операторов");
                System.out.println(" break;");
                break;
            case ("For"):
                System.out.println("Oпepaтop for:\n");
                System.out.print("for(инициaлизaция; условие; итерация)");
                System.out.println(" оператор;");
                break;
            case ("While"):
                System.out.println("Oпepaтop while:\n");
                System.out.println("while(ycлoвиe) оператор;");
                break;
            case ("Do While"):
                System.out.println("Oпepaтop do-while:\n");
                System.out.println("do {");
                System.out.println(" оператор;");
                System.out.println("} while (условие};");
                break;
            case ("Break"):
                System.out.println("Oпepaтop break:\n");
                System.out.println("break; или break метка;");
                break;
            case ("Continue"):
                System.out.println("Oпepaтop continue:\n");
                System.out.println("continue; или continue метка;");
                break;
            case ("q"):
                return a++;
            default:
                a=a+2;
        }
        return 0;
    }

    static void isValid(){
        System.out.println("Проверьте правильность написания");
    }
}























