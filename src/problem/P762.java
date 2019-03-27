package problem;

import java.util.ArrayList;
import java.util.List;

public class P762 {
    public static void main(String[] args) {
        new P762().countPrimeSetBits(1, 1);
    }

    public int countPrimeSetBits(int L, int R) {
        List<Integer> primeList = new ArrayList<Integer>() {{
            add(2);
            add(3);
            add(5);
            add(7);
            add(11);
            add(13);
            add(17);
            add(19);
        }};
        int result = 0;
        for (int i = L; i <= R; i++) {
            int count1 = 0;
            for (int j = i; j != 0; j >>= 1) {
                count1 += j & 1;
            }
            if (primeList.contains(count1)) {
                result++;
            }
        }
        return result;
    }

}
