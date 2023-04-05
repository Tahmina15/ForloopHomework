import java.util.Scanner;

public class FactorialNumber {
    //main method
    public static void main(String[] args) {
        //using scanner class for user input feasibility
        Scanner scanner = new Scanner(System.in);
        //print the text and acknowledge the user what to do
        System.out.println("Enter any number");
        //User can input any number
        int num= scanner.nextInt();
        int fact=1;
        //using for loop to find out factorial number
        for (int i = 1; i <= num; i++) {
            fact*=i;
            System.out.println(i);

        }
        System.out.println("Factorial of "+num+" is "+fact);

    }







}
