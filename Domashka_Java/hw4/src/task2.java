public class task2{
    public static void main(String[] args){
		int[] array;
		array = new int[] { 3, 10, 54, 67, 666 };
		int minimum = array[0];
		int maximum = array[0];
		for (int i = 0; i < 5; i++){ 
			if ( maximum < array[i]){
			maximum = array[i];
			}
			if ( minimum > array[i]){
			minimum = array[i];
			}
		}	
		int num = (int)Math.log10(maximum)+1;
		int mun = (int)Math.log10(minimum)+1;
		System.out.println("The longest number : " + maximum +" " +"lenght: " + num ); 
		System.out.println("The shortest number: " + minimum +" "+"lenght: " + mun );
	}    
}

