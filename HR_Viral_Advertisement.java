import java.util.*;
public class HR_Viral_Advertisement {
    public static void main(String[] args) {
        int a,b=5;
        int i;//for loop
        int x=0;// for loop interior
        Scanner sc = new Scanner(System.in);
        a=sc.nextInt();
        for(i=0;i<a;i++){
            b=(b/2);
            x+=b;
            b*=3;
        }
        System.out.println(x);
    }
}