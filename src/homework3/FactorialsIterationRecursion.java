package homework3;
import java.util.Scanner;

public class FactorialsIterationRecursion {

    private static int factRecursive(int number) {
        // base condition
        if (number == 1)
            return 1;

        // calculate the homework3.factorial of all number
        return number * factRecursive(number - 1);
    }

    private static int factIterative(int number) {

        int factorial = 1;
        for (int iNumber = 1; iNumber <= number; iNumber++) {
            factorial = factorial * iNumber;
        }
        return factorial;
    }
//hw
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {

            /* Calculate homework3.factorial for input number */
            System.out.printf(" Enter input number : ");
            int number = scanner.nextInt();

            int factNumber = factRecursive(number);
            System.out.printf("homework3.factorial(%d) - Recursive method: %d\n",number,factNumber);

            factNumber = factIterative(number);
            System.out.printf("homework3.factorial(%d) - Iterative method: %d\n",number,factNumber);
        }
    }
}

