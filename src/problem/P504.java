package problem;

public class P504 {
    public static void main(String[] args) {
        new P504().convertToBase7(-7);
    }

    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        boolean isPositive = true;
        if (num < 0) {
            isPositive = false;
            num = -num;
        }

        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }

        if (!isPositive) {
            return "-" + sb.reverse().toString();
        } else {
            return sb.reverse().toString();
        }
    }
}
