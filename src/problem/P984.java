package problem;

// todo error
public class P984 {
    public static void main(String[] args) {
        new P984().strWithout3a3b(1, 3);
    }

    public String strWithout3a3b(int A, int B) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < A; i++) {
            sb.append('a');
        }

        int index = 0;
        while (B != 0) {
            if (B != 1 && sb.length() != 1) {
                index += 2;
                sb.insert(index, "bb");
                index += 2;
                B -= 2;
            } else {
                if (A == 1){
                    index += 1;
                }else{
                    index += 2;
                }

                sb.insert(index, 'b');
                B -= 1;
            }

        }

        return sb.toString();
    }
}
