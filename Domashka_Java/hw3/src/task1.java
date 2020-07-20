public class task1{
	public static void main(String[] args){ 
		int[] array;
		array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		for(int i = 0; i < 9; i++){ 
			if(array[i] % 2 == 0)
			System.out.print( array[i] );
		}
		System.out.println();
		for(int i = 0; i < 9; i++){
			if(array[i] % 2 != 0)
			System.out.print( array[i] );
		}
	}
}
