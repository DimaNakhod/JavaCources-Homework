public class task1{
	public static void main(String[] args){
		int[] N;
		N = new int[] { 3, 10, 7, 2, 6, 8 };
		int[] M;
		M = new int[] {  7, 2, 6 };
        int i = 0;
        int j = 0;
        for (j = 0; j < M.length; j++, i++){
            while (i < N.length && N[i] != M[j]){
                i++;
            }
            if (i == N.length){
                break;
			}
        }
        if (j == M.length){
            System.out.println("{7, 2, 6} is a subsequence.");
		}
		else{
		System.out.println("{7, 2, 6} is not a subsequence.");
		}
	}
}