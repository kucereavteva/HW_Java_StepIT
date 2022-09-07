package L8_9HW.HW1;

import static L8_9HW.HW1.Help.*;

class HelpClassDemo extends Help{

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
}