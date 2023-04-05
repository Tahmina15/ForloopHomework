import java.util.Scanner;
public class FibonacciNumber {
    //Main method
    public static void main(String[] args) {
        //declare variable
       int first =0,second=1,next;
        //create an object of scanner class
       Scanner scanner=new Scanner(System.in);
       //Print the text and acknowledge the user what to do
        System.out.println("Enter the number");
        int n= scanner.nextInt();
        System.out.println("First"+n+"terms of fibonacci series: ");
        //loop to add n number
        for (int i = 1; i <=n ; i++) {
            System.out.println(first+" ");
            //display fibonacci number
            next=first+second;
            first=second;
            second=next;



        }






    }
}
