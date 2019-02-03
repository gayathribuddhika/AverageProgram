
package averageprogram;

import java.util.Scanner;
public class AverageProgram {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Marks:");
        
        int total = 0;
        int counter = 1;
        int marks;
        double average;
        
        while(counter<=10){
            marks = input.nextInt();
            total = total + marks;
            counter++;
        }
        
        average = total/10;
        System.out.println("Your average mark is " + average);
    }
    
}
