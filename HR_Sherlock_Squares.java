import java.util.Scanner;
public class HR_Sherlock_Squares
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=0;i<t;i++)
        {
            int m=sc.nextInt();
            int n=sc.nextInt();
            int count=0;
            int sq=(int) Math.pow(m,0.5);
            int a=sq*sq;
            if(a<m)
            {
                sq++;
                a=sq*sq;


            }
            while(a>=m && a<=n)
            {
                count++;
                sq++;
                a=sq*sq;


            }

            System.out.println(count);
        }
    }
}