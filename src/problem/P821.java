package probleams;

public class P821 {
	public static void main(String[] args) {
		new P821().shortestToChar("aaba",'b');
	}

	public int[] shortestToChar(String S, char C) {
		int[] result = new int[S.length()];
		for (int i = 0; i < S.length(); i++) {
			int iLeft = i, iRight = i;
			int left = 0,right = 0;
			while (iLeft < S.length() && S.charAt(iLeft) != C){
				left++;
				iLeft++;
			}
			while (iRight >= 0 && S.charAt(iRight) != C){
				right++;
				iRight--;
			}

			if (iRight == -1){
				result[i] = left;
			}else if(iLeft == S.length()){
				result[i] = right;
			}
			else if (left >= right){
				result[i] = right;
			}else {
				result[i] = left;
			}

		}
		return result;
	}
	
	public int lengthOfSplit(StringBuilder sb) {
		return 0;
	}

}
