import java.util.*;
public class Hackerrank_MinMax {
    public static void main(String[]args){


                long sum=0,b,u;
                int n;

                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the number of elements you want to store: ");

                n=sc.nextInt();

            int[] array = new int[n];
                System.out.println("Enter the elements of the array: ");
                for(int i=0; i<n; i++)
                {

                    array[i]=sc.nextInt();
                }


                for (int i=0; i<n; i++)
                {
                    sum+=array[i];

                }
                b=sum-array[n-1];
                u=sum-array[0];


                System.out.println(b+" "+u);
            }
        }


