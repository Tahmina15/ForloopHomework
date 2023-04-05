import java.util.Scanner;

public class SumOfRange {
    //Main method
    public static void main(String[] args) {
        //declare variable to store sum
      int num1,num2,sum=0;
        //scanner class declared
        Scanner scanner=new Scanner(System.in);
        //input from user where the range number start from
        System.out.println("Enter the starting of range number: ");
         num1= scanner.nextInt();
        System.out.println("Enter the end of range number :");
        num2= scanner.nextInt();
         //loop to add n natural numbers
        for (int i = num1; i <=num2; i++) {
            sum=sum+i;}
            System.out.println("Sum of range number from\t"+num1+"\tto\t"+num2+"\t=\t"+sum);





    }
}
