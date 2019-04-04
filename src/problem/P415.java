package problem;

public class P415 {
    public static void main(String[] args) {
        new P415().addStrings("1", "9");
    }

    public String addStrings(String num1, String num2) {
        int carry = 0;
        StringBuilder longStr, shortStr;
        if (num1.length() > num2.length()) {
            longStr = new StringBuilder(num1);
            shortStr = new StringBuilder(num2);
        } else {
            longStr = new StringBuilder(num2);
            shortStr = new StringBuilder(num1);
        }

        int ld = longStr.length() - shortStr.length();
        for (int i = longStr.length() - 1; i >= 0; i--) {
            int shortInt;
            if (i - ld >= 0) {
                shortInt = (shortStr.charAt(i - ld) - '0');
            } else {
                shortInt = 0;
            }
            int temp = shortInt + (longStr.charAt(i) - '0') + carry;
            if (temp > 9) {
                carry = 1;
                temp %= 10;
            } else {
                carry = 0;
            }

            longStr.replace(i, i + 1, String.valueOf(temp));
        }

        if (carry == 1) {
            longStr.insert(0, 1);
        }

        return longStr.toString();
    }
}
