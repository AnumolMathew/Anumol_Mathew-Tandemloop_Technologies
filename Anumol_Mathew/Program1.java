import java.util.Scanner;

public class Program1
{
    public static void main(String[] args)
    {
    double a, b = 0;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter operands a & b");
    a = sc.nextDouble();
    b = sc.nextDouble();
    sc.nextLine();

    System.out.println("Enter the type of operation (eg: Addition, Subtraction, Multiplication, Division)");
    String operation = sc.nextLine();
    switch(operation.toLowerCase())
    {
        case "addition" : System.out.println("Sum of a + b = "+ (a+b));
                          break;
        case "subtraction" : System.out.println("Difference of a - b = "+ (a-b));
                          break;
        case "multiplication" : System.out.println("Product of a * b = "+ (a*b));
                          break;
        case "division" : System.out.println("Quotient of a / b = "+ (a/b));
                          break;
        default: System.out.println("Invalid Operation");
            break;
    }
    sc.close();
    }
}