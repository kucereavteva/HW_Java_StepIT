package L7HW; //4.	Переписать массив в обратном направлении

import java.util.Arrays;
import java.util.Collections;

public class HW4 {

        public static void main(String[] args)
        {
            Integer[] nums = {1, 2, 3, 4, 5};

            Collections.reverse(Arrays.asList(nums));
            System.out.println(Arrays.toString(nums));
        }
    }

