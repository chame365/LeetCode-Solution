package problem;

import java.util.ArrayList;
import java.util.List;

public class P492 {
    public static void main(String[] args) {
        new P492().constructRectangle(2);
    }

    public int[] constructRectangle(int area) {
        List<int[]> list = new ArrayList<>();

        for (int i = 1; i <= area; i++) {
            int[] t = new int[2];
            if (area % i == 0) {
                t[0] = i;
                t[1] = area/i;
                if (t[0] >= t[1]){
                    list.add(t);
                }

            }
        }
        int min = area - 1,flag = 0;

        for (int i = 0; i < list.size(); i++) {
            if (min >= list.get(i)[0] - list.get(i)[1]){
                min = list.get(i)[0] - list.get(i)[1];
                flag = i;
            }
        }
        return list.get(flag);
    }
}
