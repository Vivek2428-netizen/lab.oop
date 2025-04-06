import java.util.Scanner;
public class Main6 {
 public static void main(String[] args) {
 Scanner scanner = new Scanner(System.in);

 System.out.print("Enter coefficient a: ");
 double a = scanner.nextDouble();

 System.out.print("Enter coefficient b: ");
 double b = scanner.nextDouble();

 System.out.print("Enter coefficient c: ");
 double c = scanner.nextDouble();

 double discriminant = b * b - 4 * a * c;

 if (discriminant > 0) {
 double root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
 double root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
 System.out.println("Roots are real and distinct: " + root1 + "
and " + root2);
 } else if (discriminant == 0) {
 double root = -b / (2 * a);
 System.out.println("Roots are real and equal: " + root);
 } else {
 double realPart = -b / (2 * a);
 double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
 System.out.println("Roots are imaginary: " + realPart + " ± "
+ imaginaryPart + "i");
 }
scanner.close();
 }
}
