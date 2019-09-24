import java.awt.*;
import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;
import java.util.HashMap;
import java.util.Map;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[][] dp = new int[n][3];
        dp[0][0] = sc.nextInt();
        dp[0][1] = sc.nextInt();
        dp[0][2] = sc.nextInt();
        int x;
        for (int i = 1; i < n; i++) {
            x = sc.nextInt();
            dp[i][0] = Integer.max(dp[i - 1][1] + x, dp[i - 1][2] + x);
 
            x = sc.nextInt();
            dp[i][1] = Integer.max(dp[i - 1][0] + x, dp[i - 1][2] + x);
 
            x = sc.nextInt();
            dp[i][2] = Integer.max(dp[i - 1][0] + x, dp[i - 1][1] + x);
        }
        x = dp[n - 1][0];
        if (x < dp[n - 1][1]) x = dp[n - 1][1];
        if (x < dp[n - 1][2]) x = dp[n - 1][2];
        System.out.println(x);
    }
}
 
