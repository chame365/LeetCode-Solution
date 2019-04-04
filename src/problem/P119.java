package problem;

import java.util.ArrayList;
import java.util.List;

public class P119 {
    public static void main(String[] args) {
        new P119().getRow(1);
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (rowIndex == 0) return list;
        list.add(1);
        if (rowIndex == 1) return list;
        for (int i = 2; i <= rowIndex; i++) {
            List<Integer> nextLine = new ArrayList<>();
            nextLine.add(1);
            for (int j = 0; j < list.size() - 1; j++) {
                nextLine.add(list.get(j) + list.get(j + 1));
            }
            nextLine.add(1);
            list = nextLine;
        }

        return list;
    }
}
