import java.util.*;
public class HR_Beautiful_Days_at_Movies {
    public static void main(String args[]){
        int a,b = 0;
        int x,y,z;//for loop
        String k;
        Scanner sc = new Scanner(System.in);

        int i=sc.nextInt();
        int j=sc.nextInt();

        for(x=i;x<=j;x++){
            a = x % 10;
            b = b * 10 + a;
            x = x/10;

        }
        System.out.println(b);
    }

}
