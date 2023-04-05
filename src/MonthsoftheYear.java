import java.util.Scanner;
public class MonthsoftheYear {
    //User defined method
    public void count() {
        // create Scanner class to input user value
        Scanner scanner = new Scanner(System.in);
        //print the text and acknowledge the user what to do
        System.out.println("Enter any number of month (1-12)");
        int number= scanner.nextInt();
        //Through this condition user can find the month by typing (1-12)number
        switch (number){
            case 1:
                System.out.println("First Month of the year is January");
                break;
            case 2:
                System.out.println("Second Month of the year is February");
                break;
            case 3:
                System.out.println("Third month of the year is March");
                break;
            case 4:
                System.out.println("Fourth Month of the year is April");
                break;
            case 5:
                System.out.println("Fifth month of the year is May");
                break;
            case 6:
                System.out.println("Sixth Month of the year is June");
                break;
            case 7:
                System.out.println("Seventh month of the year is July");
                break;
            case 8:
                System.out.println("Eighth month of the year is August");
                break;
            case 9:
                System.out.println("Ninth month of the year is September");
                break;
            case 10:
                System.out.println("Tenth month of the year is October");
                break;
            case 11:
                System.out.println("Eleventh Month of the year is November");
                break;
            case 12:
                System.out.println("Twelfth Month of the year is January");
                break;
            default:
                System.out.println("The number of the month is invalid");

        }

    }//Calling main method
    public static void main(String[] args) {

        MonthsoftheYear monthsoftheYear=new MonthsoftheYear();
        monthsoftheYear.count();
    }
}
