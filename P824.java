package problem;

public class P824 {
    public static void main(String[] args) {
        new P824().toGoatLatin("I speak Goat Latin");
    }

    public String toGoatLatin(String S) {
        StringBuilder sb = new StringBuilder();
        int acount = 1;
        for (String s : S.split(" ")) {
            StringBuilder astring = new StringBuilder();
            for (int i = 1; i <= acount; i++) {
                astring.append('a');
            }
            if (isVowel(s.charAt(0))) {
                sb.append(s + "ma" + astring + " ");
            } else {
                sb.append(s.substring(1) + s.charAt(0) + "ma" + astring + " ");
            }
            acount++;
        }
        return sb.toString().trim();
    }

    public boolean isVowel(char c) {
        if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
            return true;
        }
        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            return true;
        }
        return false;
    }
}
