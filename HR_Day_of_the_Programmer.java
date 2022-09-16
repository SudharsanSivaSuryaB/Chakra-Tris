import java.util.*;
public class HR_Day_of_the_Programmer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if (year == 1918) {
            System.out.println("12.09." + year);
        }
        else if(year>=1919)
        {
            if(year%400==0 || (year%4==0 && year%100!=0))
            {
                System.out.println("12.09." + year);
            }
            else
            {
                System.out.println("13.09." + year);
            }
        }
        else if(year<=1917)
        {
            if(year%4==0)
            {
                System.out.println("12.09." + year);
            }
            else
            {
                System.out.println("13.09." + year);
            }
        }
    }
    }
