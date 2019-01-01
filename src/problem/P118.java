package probleams;

import java.util.LinkedList;
import java.util.List;

public class P118 {
    public static void main(String[] args) {
        new P118().generate(5);
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new LinkedList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> integers = new LinkedList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i){
                  integers.add(1);
                } else {
                    integers.add(result.get(i-1).get(j-1) + result.get(i-1).get(j));
                }
            }
            result.add(integers);
        }

        return result;
    }
}
