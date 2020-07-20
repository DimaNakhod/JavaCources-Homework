public class task3{
	private static boolean isDistinct(int x){
        int [] nums = new int[10];
        int tmpIndx;
        while (x != 0){
            tmpIndx = x % 10;
            if(nums[tmpIndx] == 1)
                return false;
            nums[tmpIndx]++;
            x /=10;
        }
        return true;
    }
	public static void main(String[] args){
        int[] arr = {12, 1234, 43641, 57, 676, 900, 8105};
        for (int elem : arr){
            if (isDistinct(elem))
               System.out.println(elem);
		}
	}
}
