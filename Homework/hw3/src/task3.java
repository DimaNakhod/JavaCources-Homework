public class task3 {
    public static void main(String[] args) {
		int[] array;
		array = new int[20];
		for( int i = 0; i< 21; i ++){
			if(i<2){
			array[i]=1;
			}
			else {
			array[i]= array[i-1]+array[i-2];
			}
			System.out.print(array[i]+" ");
		}
    }
}