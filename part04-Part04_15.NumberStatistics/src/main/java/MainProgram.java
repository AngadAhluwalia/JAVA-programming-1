
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        // Create three Statistics objects in the specified order
        Statistics allNumbers = new Statistics();     // To count all numbers
        Statistics evenNumbers = new Statistics();    // To count even numbers
        Statistics oddNumbers = new Statistics();     // To count odd numbers
        
        
        System.out.println("Enter Numbers: ");

        while (true) {
            
            int number = scanner.nextInt();

            if (number == -1) {
                break;
            }

            // Update statistics for all numbers
            allNumbers.addNumber(number);
            

            // Check if the number is even or odd
            if (number % 2 == 0) {
                evenNumbers.addNumber(number);
                
            } else {
                oddNumbers.addNumber(number);
                
            }
        }

        System.out.println("Sum: " + allNumbers.sum());
        ;
        
        System.out.println("Sum of even numbers: " + evenNumbers.sum());
        
        
        System.out.println("Sum of odd numbers: " + oddNumbers.sum());
        

        scanner.close();
    }
}
;
        // you can write test code here
        // however, remove all unnecessary code when doing the final parts of the exercise

        // In order for the tests to work, the objects must be created in the
        // correct order in the main program. First the object that tracks the total
        // sum, secondly the object that tracks the sum of even numbers, 
        // and lastly the one that tracks the sum of odd numbers!
    
