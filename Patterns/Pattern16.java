import java.util.Scanner;

public class Pattern16 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int x = sc.nextInt();
        pattern1(x);
    }

    private static void pattern1(int x) {
        for(int i=0; i<x; i++)
        {
            for(int j=0; j<=i; j++)
            {
                System.out.print((char)(65+i)+" ");
            }
            System.out.println();
        }
    }
}
