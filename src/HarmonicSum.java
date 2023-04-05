import java.util.Scanner;

public class HarmonicSum {
    //Main method
    public static void main(String[] args) {
            double s=0.0;
        //create an object of scanner class
            Scanner scanner = new Scanner(System.in);
            //print the text and acknowledge user what to do
            System.out.println("Enter any positive number");
            int n = scanner.nextInt();

            for(double i=1;i<=n;i++){
                s=s+1/i;
                System.out.println(s+"");



            }

        }
        }


