package problem;

import java.util.Set;
import java.util.HashSet;

public class P575 {

    public static void main(String[] args) {
        int[] candies = {0,0,0,4};
        System.out.println(new P575().distributeCandies(candies));
    }

    public int distributeCandies(int[] candies) {
        Set<Integer> candySet = new HashSet<>();
        for (int candy: candies) {
            candySet.add(candy);
        }
        return (candySet.size() > candies.length / 2) ? candies.length / 2 : candySet.size();
    }
}
