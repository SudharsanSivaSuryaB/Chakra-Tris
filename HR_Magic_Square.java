import java.util.*;

public class HR_Magic_Square {
//n=n(((n^2)+1)/2)-----Magic Square Formula
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] square = new int[9];
        for (int i = 0; i < 9; i++) {
            square[i] = scan.nextInt();
        }
        int[][] matrix={{4,9,2,3,5,7,8,1,6},//=>>^^vv
                        {2,7,6,9,5,1,4,3,8},//<<||^^vv
                        {6,1,8,7,5,3,2,9,4},//=<<vv^^
                        {8,3,4,1,5,9,6,7,2},//||>>vv^^
                        {2,9,4,7,5,3,6,1,8},//=<<^^vv
                        {6,7,2,1,5,9,8,3,4},//vv^^||<<
                        {8,1,6,3,5,7,4,9,2},//=>>vv^^
                        {4,3,8,9,5,1,2,7,6}};//^^vv||>>

        int a =100;
        for (int i = 0; i < 8; i++) {
            int b = 0;
            for (int j = 0; j < 9; j++) {
                if (square[j] != matrix[i][j]) {
                    b += Math.abs(square[j] - matrix[i][j]);
                }
            }
            if (b<a) a = b;
        }

        System.out.println(a);
    }
}
