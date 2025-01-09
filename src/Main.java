import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double numone, numtwo, sum;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        numone = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        numtwo = scanner.nextDouble();
        sum = numone + numtwo;
        System.out.println("The sum of " + numone + " and " + numtwo + " is " + sum);
    }
}