import java.util.Scanner;

public class Calculator {
    //main method
    public static void main(String[] args) {
        int first,second;
        char operator;
        //create an object of scanner class
        Scanner scanner=new Scanner(System.in);
        //ask user to enter number
        System.out.println("Enter first number");
        first=scanner.nextInt();
        System.out.println("Enter second number");
        second= scanner.nextInt();
        //ask user to enter operator
        System.out.println("Enter operator to calculate(+,-,*,/)");
        operator =scanner.next().charAt(0);

        int add = first + second;
        int subtract = first - second;
        int multiplication =first * second ;
        int divide =first / second ;

        switch (operator){
            //performs addition between numbers
            case '+':
                System.out.println("answer = "+ add);
                break;
            //performs subtraction between numbers
            case '-':
                System.out.println("Answer = "+ subtract);
                break;
            //performs multiplication between numbers
            case'*':
                System.out.println("answer = "+multiplication);
                break;
            //performs division between numbers
            case'/':
                System.out.println("answer = "+divide);
                break;
            default:
                System.out.println("Invalid operator");


    }}
}
