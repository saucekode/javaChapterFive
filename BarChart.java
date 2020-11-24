package Chapter5;

import java.util.Scanner;

public class BarChart {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        String asterisk = "";

       for(int count = 1; count <= 5; count++){
           System.out.println("Enter a number between 1 and 30:");
            int inputs = userInput.nextInt();
            if(inputs > 30){
                inputs = 30;
            }
            for(int j = 1; j <= inputs; j++){
                asterisk = asterisk + "*";
            }

           asterisk = asterisk + "\n";
       }
        System.out.println(asterisk);
    }
}
