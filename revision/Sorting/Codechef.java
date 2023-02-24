/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i=0; i<n; i++){
		    int m = sc.nextInt();
		    int arr[] = new int[m];
		    for(int j=0; j<m; j++){
		        arr[j] = sc.nextInt();
		    }
		    
		    int sum1 = 0;
		    int sum2 = 0;
		    for(int p =0; p<arr.length; p++){
		        if(p%2==0){
		            sum1 = sum1+arr[p];
		        }else{
		            sum2 = sum2+arr[p];
		        }
		    }
		    
		   if((sum1%2!=0)&&(sum2%2!=0)){
		      if((sum1*sum2)%2!=0){
		          System.out.println("YES");
		      }
		      else{
		       System.out.println("NO");
		   }
		   }
		   else{
		       System.out.println("NO");
		   }
		    
		}
	}
}
