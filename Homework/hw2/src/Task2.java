import java.util.Scanner;

public class Task2
{
public static void main(String[] args)
  {
	Scanner scan = new Scanner(System.in);
	
	System.out.print("Enter the number of elements:");
		
	int a = scan.nextInt();
	int num[] = new int[a];
	
	System.out.println("Enter your elements:");
 
	for (int i = 0; i < a; i++)
	{
        num[i] = scan.nextInt();
    }
	System.out.println("Elements in reverse order:");
	
    for (int i = num.length - 1; i >= 0; i--) 
	{
        System.out.println(num[i]);
	}
  }

}