package problem;

public class P069 {
    public static void main(String[] args) {
        new P069().mySqrt(8);
    }

    public int mySqrt(int x) {
        double y = x;
        while (Math.abs(x - y * y) > 0.1){
            y = (x/y + y) / 2.0;
        }
        return (int)y;
    }
}
