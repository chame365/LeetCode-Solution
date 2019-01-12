package problem;

public class P844 {

    public static void main(String[] args) {
        new P844().backspaceCompare("ab#c","ad#c");
    }

    public boolean backspaceCompare(String S, String T) {
        StringBuilder sbS = new StringBuilder();
        StringBuilder sbT = new StringBuilder();

        for (int i = 0; i < S.toCharArray().length; i++) {
            if (S.charAt(i) == '#') {
                if (sbS.length() != 0){
                    sbS.deleteCharAt(sbS.length()-1);
                }
            } else {
                sbS.append(S.charAt(i));
            }
        }

        for (int i = 0; i < T.toCharArray().length; i++) {
            if (T.charAt(i) == '#') {
                if (sbT.length() != 0) {
                    sbT.deleteCharAt(sbT.length() - 1);
                }
            } else {
                sbT.append(T.charAt(i));
            }
        }

        return sbS.toString().equalsIgnoreCase(sbT.toString());
    }
}
