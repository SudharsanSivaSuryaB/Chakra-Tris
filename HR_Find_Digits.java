import java.util.*;
public class HR_Find_Digits {
    public static void main(String[] args) {
        int a;
        int i;//for loop
        int n, x,m ;//for loop interior
        int count ;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        for (i = 0; i < a; i++) {
            count=0;
            n = sc.nextInt();
            m=n;
            while (m != 0) {


                x = (int) m % 10;
                m = m/ 10;
                if (x == 0)
                    continue;
                if (n % x == 0)
                    count++;

            }

            System.out.println(count);
        }

    }
}
