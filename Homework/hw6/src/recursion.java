import java.util.Scanner;
public class recursion{
    //METHOD SEQUENCE//
   void sequence(int number){
        if (number == 0){
            return;
        }
        else {
            sequence(number - 1);
        }
        System.out.println(number);
    }
    //METHOD OF SUM//
     void sumOfNumber(int number){
        if (number < 10){
            System.out.println(number);
        }
          else{
            System.out.println( (number / 10) + number % 10);
          }
    }
    //MAIN METHOD//
     public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        recursion n = new recursion();
        n.sequence(number);
        n.sumOfNumber(number);
    }
}