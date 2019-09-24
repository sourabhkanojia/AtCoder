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
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] h=new int[n];
        for(int i=0;i<n;i++){
            h[i]=sc.nextInt();
        }
        int[] dp=new int[n];
        dp[0]=0;
        dp[1]=Math.abs(h[0]-h[1]);
        for(int i=2;i<n;i++){
            dp[i]=Integer.min(dp[i-2]+Math.abs(h[i]-h[i-2]),dp[i-1]+Math.abs(h[i]-h[i-1]));
        }
        System.out.println(dp[n-1]);
    }
}
