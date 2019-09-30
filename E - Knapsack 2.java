import java.text.DecimalFormat;
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
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int w=sc.nextInt();
        int[] a=new int[n+1];
        int[] v=new int[n+1];
        int sum=0;
        for(int i=1;i<=n;i++){
            a[i]=sc.nextInt();
            v[i]=sc.nextInt();
            sum=sum+v[i];
        }
        long[] dp=new long[sum+1];
        Arrays.fill(dp,(long)1e18);
        dp[0]=0;
 
        for(int i=1;i<=n;i++){
            for(int j=sum;j>=v[i];j--){
                dp[j]=Math.min(dp[j],dp[j-v[i]]+a[i]);
            }
        }
 
        int ans=0;
        for (int i=0;i<=sum;i++){
            if (dp[i]<=w)ans=Math.max(i,ans);
        }
        System.out.println(ans);
    }
}
