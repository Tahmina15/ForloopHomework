import java.util.Scanner;

public class MultiplicationTable {
    //Main method
    public static void main(String[] args) {
        // using scanner class for user input
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter any number whose multiplication table you wanted to ");
        //reading a number whose vtable is to be print
        int num =scanner.nextInt();
        for(int i=1;i<=10;i++){
            //Prints table of the entered number
            System.out.println(num+"*"+i+"="+num*i);
        }

    }

}
