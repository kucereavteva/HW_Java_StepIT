package L7HW; //1.	Уменьшить все элементы массива на 25%

public class HW1 {

    public static void main(String[] args) {

        double[] array = new double[]{100, 20, 8, 77};

        for (int i = 0; i < array.length; i++) {

            array[i] -= array[i]*25/100;


            System.out.println(array[i]);
        }

    }
}

