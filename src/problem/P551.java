package problem;

public class P551 {
    public static void main(String[] args) {
        new P551().checkRecord("AA");
    }

    public boolean checkRecord(String s) {
        int countA = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'A'){
                countA++;
                if (countA > 1){
                    return false;
                }
            }
            if (s.charAt(i) == 'L'){
                if (i+1 <= (s.length() - 1) && s.charAt(i+1) == 'L'){
                    if (i+2 <= (s.length() - 1) && s.charAt(i+2) == 'L'){
                        return false;
                    }
                }
            }
        }

        return true;
    }

}
