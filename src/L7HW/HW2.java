package L7HW; //2.	Найти минимальный элемент целочисленного массива заполненного случайными числами
                // в заданном диапазоне

public class HW2 {
    public static void main(String[] args) {

        int[] list = {19, 44, 3, -78, 16, 21, 55, -7, -19, 12, 30};

        int min = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (list[i] < min)
                min = list[i];
        }

        System.out.println("Min is " + min);

    }
}

