import java.util.Scanner;
public class HR_Hurdels {
    public static void main(String[]args){
        int i,d; Scanner obj = new Scanner(System.in);

        int b=obj.nextInt();
        int a = obj.nextInt();
        int n[]= new int[b];

        for( i=0;i<b;i++) { n[i]=obj.nextInt(); }

        int max=n[0]; for( i=0;i<b;i++)
        { if ( max < n[i])
            max=n[i]; }

        if(max>a){
        d = max - a;
        System.out.print(Math.abs(d));}
        if(max<=a){
            System.out.print(0);
        }
    } }
