package common;

public class IntegerStack {
    private int[] data;
    private int maxSize;
    private int top;

    public IntegerStack(int maxSize) {
        this.maxSize = maxSize;
        this.data = new int[maxSize];
        this.top = -1;
    }
    public void push(int num) {
        this.data[top] = num;
        this.top++;
    }

    public void pop(){
        this.top--;
    }

    public int top(){
        return this.data[this.top];
    }

    public int getMin(){
        int result = Integer.MAX_VALUE;
        for (int i = top; i >= 0 ; i--) {
            if (this.data[i] < result){
                result = this.data[i];
            }
        }
        return result;
    }

}
