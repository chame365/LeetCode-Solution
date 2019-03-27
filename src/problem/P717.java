package problem;

public class P717 {
    public static void main(String[] args) {
        int[] bits = {0, 1, 0, 0, 0};
        new P717().isOneBitCharacter(bits);
    }

    public boolean isOneBitCharacter(int[] bits) {
        int index = 0;
        while (index + 1 < bits.length) {
            if ((bits[index] == 1 && bits[index + 1] == 1) || (bits[index] == 1 && bits[index + 1] == 0)) {
                index += 2;
            } else if (bits[index] == 0) {
                index += 1;
            }
        }
        if (index == bits.length) {
            return false;
        } else {
            return bits[index] == 0;
        }
    }
}
