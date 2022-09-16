import java.util.*;
public class HR_Electronic_Shop {
    public static void main(String[]args){
        int amt,key,mou,i,j,sum,max=0;
        Scanner sc = new Scanner(System.in);
        amt=sc.nextInt();
        key=sc.nextInt();
        mou=sc.nextInt();
        int[]a=new int[key];
        int[]b=new int[mou];
        for(i=0;i<key;i++){
            a[i]=sc.nextInt();
        }
        for(j=0;j<mou;j++){
            b[j]=sc.nextInt();
        }
        for(i=0;i<key;i++){
            for(j=0;j<mou;j++){
                sum=a[i]+b[j];
                if(sum<=amt){
                    if(max<sum) {
                        max = sum;
                    }
                }
            }
        }
        if(max==0){
            System.out.println("-1");
        }
        else{
            System.out.println(max);
        }
    }
}
