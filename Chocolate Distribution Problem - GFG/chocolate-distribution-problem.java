//{ Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;
class GfG
{
    public static void main (String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-- > 0)
        {
            int n = sc.nextInt();
            ArrayList<Integer> arr = new ArrayList<>();
            for(int i = 0;i<n;i++)
                {
                    int x = sc.nextInt();
                    arr.add(x);
                }
            int m = sc.nextInt();
            
            Solution ob = new Solution();
            
    		System.out.println(ob.findMinDiff(arr,n,m));
        }
        
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        int diff = Integer.MAX_VALUE;
        Collections.sort(a);
        //for(int i=0, j=m-1; i<m || j<n;i++,j++)
          //  diff = Math.min(diff,(a.get(j)-a.get(i)));
        
        for(int i=0, j=m-1; j<n; j++, i++)
        {
            diff = Math.min(diff, a.get(j) - a.get(i));
        }
        
        return diff;
    }
}