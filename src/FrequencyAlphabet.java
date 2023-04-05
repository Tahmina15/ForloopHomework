import java.util.Locale;
import java.util.Scanner;

public class FrequencyAlphabet {
    //main method
        public static void main(String[] args) {
        //Using scanner class for user input feasibility
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter a Sentence");
        String s =scanner.nextLine();
        //convert the input string to lower case
        s = s.toLowerCase(Locale.ROOT);
        //to count each letter frequency
        System.out.println("Character\tFrequency");
        for(char ch='a'; ch =='a';ch++)
        //counter variable
        {int count=0;
            for(int i=0; i<s.length();i++){ //Checking the string length
                if(ch==s.charAt(i))
                    count++;
            }
        if(count!=0)
            System.out.println(ch +"\t\t\t\t" +count);
        }

    }





}
