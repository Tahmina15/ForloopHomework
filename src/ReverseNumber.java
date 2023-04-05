import java.util.Scanner;

public class ReverseNumber {
         //main method
         public static void main(String[] args) {
         int num=0;
         int reverse=0;
         //Using scanner class for user input feasibility
         Scanner scanner = new Scanner(System.in);
         //Print the text and acknowledge the user what to do
         System.out.println("Input any number and press enter : ");
         num = scanner.nextInt();
         //Using for loop without initialization, increment and decrement to find out reverse number
         for (;num !=0;) {
            reverse = reverse*10;
            reverse= reverse+num%10;
            num=num/10;

         }//Print the result
         System.out.println("Reverse of the number is :"+reverse);
      }
     }
