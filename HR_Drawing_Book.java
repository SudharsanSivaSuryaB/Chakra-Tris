import  java.util.*;
public class HR_Drawing_Book {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int p=in.nextInt();
        int t=n/2;
        int plr=p/2;
        int prl=t-plr;
        if(plr<prl){
            System.out.println(plr);
        }
        else{
            System.out.println(prl);
        }
    }
}
