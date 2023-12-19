public class task4{
    public static void main(String[] args){
		int[] array;
		array = new int[] { 9, 3, 15, 65, 5, 4, 72, 13, 46 };
		int minimum = array[0];
		int maximum = array[0];
		for (int i = 0; i < 9; i++){ 
			if ( maximum < array[i])
			maximum = array[i];
		
			if ( minimum > array[i])
			minimum = array[i];
		}
		System.out.println("maximum: " + maximum); 
		System.out.println("minimum: " + minimum);
	}    
}
