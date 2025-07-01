import java.util.Scanner;

public class Program2
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a = sc.nextInt();
        int i = 1, j = 1;
        System.out.println(+(i));
        for(i= 1; j < a ; i+=2 )
        {
            j += 1;
            System.out.println("\n"+(i+2));
        }
        sc.close();
    }
}