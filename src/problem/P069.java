package problem;

public class P069 {
    public static void main(String[] args) {
        new P069().mySqrt(4);
    }

    public int mySqrt(int x) {
        double err = 0.1;
        double root = x;
        while (Math.abs(x - root * root) > err){
            root = (x/root + root) / 2.0;
        }
        return (int)root;
    }
}
