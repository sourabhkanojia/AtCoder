import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int[] a=new int[n+1];
        int[] b=new int[n+1];

        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
            b[i]=sc.nextInt();
        }
        long[][] dp=new long[n+1][w+1];

        for(int i=1;i<=n;i++) {
            for (int j = 1; j <= w; j++) {
                if (j < a[i]) dp[i][j] = dp[i - 1][j];
                else dp[i][j] = Long.max(b[i] + dp[i - 1][j - a[i]], dp[i - 1][j]);
            }
        }
        System.out.println(dp[n][w]);

    }
}

