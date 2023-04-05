import java.util.Scanner;

public class RangeNumber {
    //calling main method
    public static void main(String[] args) {
        //using scanner class for user input
        Scanner scanner = new Scanner(System.in);
        //print the text and acknowledge the user what to do
        System.out.println("Enter number between 20-30");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number");
        int num2 = scanner.nextInt();


        for (int i = num1; i <num2; i++) {
            //increments the variable by i
            System.out.println(i);
        }
        }

       }