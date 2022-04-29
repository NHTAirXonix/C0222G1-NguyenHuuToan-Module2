package free.practice_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Draw {
    public static void main(String[] args) {
        int[] arg1 = {-1, 150, 190, 170, -1, -1, 160, 180};
        int[] arg2 = new int[arg1.length];
        int count = 0;
        for (int i =0; i<arg1.length; i++){
            arg2[i] =arg1[i];
        }
        for (int i = 0; i < arg1.length; i++) {
            if (arg2[i] == -1) {
                arg2[i] = 9999999;
            }
        }
        Arrays.sort(arg2);
        for (int i = 0; i < arg1.length; i++) {
            if (arg1[i] != -1) {
                arg1[i] = arg2[count];
                count++;
            }
        }
        System.out.println(Arrays.toString(arg1));
    }
}

