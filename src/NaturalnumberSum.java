import java.util.Scanner;

public class NaturalnumberSum {
    //main method
    public static void main(String[] args) {
        //create Scanner class to input user value
        Scanner scanner=new Scanner(System.in);
        //print the text and acknowledge the user what to do
        System.out.println("Enter a number then click enter");
        int num=scanner.nextInt();
        int sum=0;
        //executes until the condition returns true
        for (int i = 1; i <= num ; i++) {
            sum+=i;}
            System.out.println("sum = "+sum);
        }




}
