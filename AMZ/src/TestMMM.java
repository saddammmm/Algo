import java.util.Scanner;


public class TestMMM {


	public static void main(String args[] ) throws Exception {

		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();

		for(int k=0;k<t;k++){
			int n=sc.nextInt();
			int arr[]=new int[n];
			for (int i = 0; i <n; i++)
			{

				arr[i]=sc.nextInt();  

			}
			System.out.print(findMinDP(arr,n));

		}
	}
     static int findMinDP(int arr[], int n)
    {
        int sum = 0; 
        for (int i = 0; i < n; i++)
            sum += arr[i];
     
        boolean dp[][] = new boolean[n + 1][sum + 1];
     
        
        for (int i = 0; i <= n; i++)
            dp[i][0] = true;
     
        
        for (int i = 1; i <= sum; i++)
            dp[0][i] = false;
     
       
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= sum; j++)
            {
                dp[i][j] = dp[i - 1][j];
     
                if (arr[i - 1] <= j)
                    dp[i][j] |= dp[i - 1][j - arr[i - 1]];
            }
        }
        
       
        int diff = Integer.MAX_VALUE;
         
       int count=0;
        for (int j = sum / 2; j >= 0; j--)
        {
            if (dp[n][j] == true)
            {
            	count++;
                diff = sum - 2 * j;
                if(count==2){
              // System.out.println(diff);
               break;
                }
            }
        }
        return diff;
    }

}
