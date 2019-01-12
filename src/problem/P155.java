package problem;

import java.util.ArrayList;
import java.util.List;

public class P155 {
    private List<Long> data;
    private int top;

    public P155() {
        this.data = new ArrayList<>();
        this.top = -1;
    }

    public void push(int x) {
        this.data.add((long)x);
        this.top++;
    }

    public void pop() {
        this.top--;
    }

    public int top() {
        return this.data.get(top).intValue();
    }

    public int getMin() {
        Long min = Long.MAX_VALUE;
        for (int i = top; i >= 0 ; i--) {
            if (min > this.data.get(i)){
                min = this.data.get(i);
            }
        }
        return min.intValue();
    }

}
