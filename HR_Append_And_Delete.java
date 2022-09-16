import java.util.*;
public class HR_Append_And_Delete {
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String a=sc.next();
        String b=sc.next();
        int n=sc.nextInt();
        int del=0;
        int i=0;
        while(i<a.length() && i<b.length() && a.charAt(i)==b.charAt(i)) {
            i++;
        }
            del=a.length()-i;
            int tot=del+(b.length()-i);
        if (tot<= n && ((n - tot) % 2 == 0 || (n - tot) > 2 * i)) {
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }


    }
}
