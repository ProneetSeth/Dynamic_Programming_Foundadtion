import java.io.*;
import java.util.*;

public class ClimbStairMemoized {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(climbStairsDP(n, new int[n+1]));

    }

    public static int climbStairsDP(int n, int qb[]) {
        if (n == 0) {
            //dest
            qb[0] = 1;
            return 1;
        }
        
        
        if (qb[n] != 0) {
            //answer exists 
            return qb[n];
        }

        int tways = 0;
        
        if (n >= 1) {
            //length = 1
            tways += climbStairsDP(n - 1,qb);
        }

        if (n >= 2) {
            //length = 2
            tways += climbStairsDP(n - 2,qb);
        }
        if (n >= 3) {
            //length = 3
            tways += climbStairsDP(n - 3,qb);
        }
        
        
        qb[n] = tways;
        return tways;

    }
}