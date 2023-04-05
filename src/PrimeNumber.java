import java.util.Scanner;

public class PrimeNumber {
    //Main method declared
    public static void main(String[] args) {

        int count =0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number");
        //User will input the number what need to be checked .
        int number= scanner.nextInt();


        for (int i = 1; i <=number; i++) {
            //condition for non-prime number
            if (number % i == 0) {
                count++;
            }
           }
          //Condition for prime number
        { if (count == 2)
                    System.out.println( "Number is a Prime number");
               else
                    System.out.println("Number is not a prime number");
            }

            }
}














