import java.util.*;
public class HR_Migratory_Birds {
    public static void main(String[]args){
        int a;
        Scanner sc = new Scanner(System.in);
         a=sc.nextInt();
        int[]s=new int[5];
        for(int i=0;i<a;i++){
            s[sc.nextInt()-1]++;
        }
        int max=0;
        int id=0;
        for(int i=0;i<5;i++){
            if(s[i]>max){
                max=s[i];
                id=i+1;
            }
        }
        System.out.println(id);
    }
}
