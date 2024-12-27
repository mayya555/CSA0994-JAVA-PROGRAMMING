import java.util.Scanner;

public class inverted {
    public static void main(String[] ar)
    {
        System.out.println("enter the number:");
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        for(int i=0;i<n;i++)
        {
            //space
            for(int j=0;j<i;j++)
            {
                System.out.print(" ");
            }
            //star
            for(int k=0;k<(n-i);k++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
