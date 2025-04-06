import java.util.Scanner;
public class SquareRootCalculator {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);
 System.out.print("Enter a number: ");
 double number = scanner.nextDouble();
 if (number < 0) {
 System.out.println("Square root of a negative number is not
real.");
 } else {
 double squareRoot = Math.sqrt(number);
 System.out.println("The square root of " + number + " is: " +
squareRoot);
 }
 scanner.close();
 }
}