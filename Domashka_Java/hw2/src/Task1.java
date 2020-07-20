import java.util.*;
 
public class Task1 {
   
    public static void main(String[] args) {
		   
		
		Scanner ott = new Scanner(System.in);
		
		System.out.print("Enter your name: ");
		
        String n = ott.nextLine();
          
        System.out.println("Hello, "+ n+ "!" );
        ott.close();
    }
}