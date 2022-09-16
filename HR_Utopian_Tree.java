

import java.util.Scanner;

public class HR_Utopian_Tree {
    public static void main(String[] args) {
        final int
                MONSOON = 1,
                SUMMER = 2;
        Scanner input = new Scanner(System.in);
        int caseCount = input.nextInt();
        for (int i = 0; i <=caseCount; i++) {
            int treeHeight = 1;
            int cycleType = MONSOON;
            int cycleCount = input.nextInt();
            for (int j = 0; j < cycleCount; j++) {
                switch (cycleType) {
                    case MONSOON:
                        treeHeight = treeHeight * 2;
                        cycleType = SUMMER;
                        break;
                    case SUMMER:
                        treeHeight += 1;
                        cycleType = MONSOON;
                        break;
                }
            }
            System.out.println(treeHeight);
        }
    }
}