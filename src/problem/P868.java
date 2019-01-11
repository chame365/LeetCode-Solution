package problem;

import java.util.ArrayList;
import java.util.List;

public class P868 {
    public static void main(String[] args) {
        new P868().binaryGap(6);
    }

    public int binaryGap(int N) {
        int result = 0;
        int i = 0;
        List<Integer> list = new ArrayList<>();
        while (N > 0) {
            if (N % 2 == 1){
                list.add(i);
            }
            N /= 2;
            i++;
        }
        for (int j = 0; j < list.size()-1; j++) {
            if (list.get(j+1) - list.get(j) > result){
                result = list.get(j+1) - list.get(j);
            }
        }
        return result;
    }

}
