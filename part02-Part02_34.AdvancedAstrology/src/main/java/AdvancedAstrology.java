
public class AdvancedAstrology {

    public static void printStars(int number) {
        for(int j=1;j<=number;j++){
            System.out.print("*");
        }
        System.out.println();
    }
        // part 1 of the exercise

    public static void printSpaces(int number) {
        for(int i=0;i<number;i++){
            System.out.print(" ");
        }
        // part 1 of the exercise
    }

    public static void printTriangle(int size) {
        for(int i=1;i<=size;i++){
            printSpaces(size-i);
            printStars(i);
            
        }
        // part 2 of the exercise
    }

    public static void christmasTree(int height) {
        for(int i=1;i<=height;i++){
            printSpaces(height-i);
            printStars(2*i-1);
        }
        for(int i=0;i<2;i++){
            printSpaces(height-2);
            printStars(3);
        }

        // part 3 of the exercise
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
        printSpaces(1);
        printStars(3);
    }
}
