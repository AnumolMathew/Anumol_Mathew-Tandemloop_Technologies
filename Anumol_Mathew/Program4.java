import java.util.Scanner;
import java.util.HashMap;


public class Program4 
{
 public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers: ");
        int size = sc.nextInt();
        int[] list = new int[size];
        HashMap<Integer, Integer> outPutList = new HashMap<>();

        System.out.println("Enter " + size + " integers for the List:");
        for(int i=0; i<size; i++)
        {
            list[i] = sc.nextInt();
        }

        for(int i=1; i<=9; i++)
        {
            int count = 0;
            for(int j=0; j<size; j++)
            {
                if( (list[j] % i) == 0 )
                {
                    count += 1;
                }
            }
            outPutList.put(i, count);
        }

        System.out.println(outPutList);
        sc.close();
    }
}