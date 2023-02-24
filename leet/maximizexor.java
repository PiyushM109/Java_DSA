import java.util.Scanner;
public class maximizexor {
    public static void main (String[] args) throws java.lang.Exception
	{
	    Scanner sc = new Scanner(System.in);
	    
		int T = sc.nextInt();
		for(int  i=0; i<T; i++){
			String ans = "";
		    String A = sc.next();
		    String B = sc.next();
		    int ones=0, zeros=0;
		    for(int j=0; j<B.length(); j++){
		        if(B.charAt(j)=='1'){
		            ones++;
		        }else{
		            zeros++;
		        }
		    }
		    
		    for(int k=0; k<A.length(); k++){
		        if(A.charAt(k)=='1' && zeros!=0){
		            ans=ans.concat("1");
		            zeros--;
		        }
		        else if(A.charAt(k)=='0' && ones!=0){
		            ans=ans.concat("1");
		            ones--;
		        }
		        else{
		            ans=ans.concat("0");
		        }
		    }
		    System.out.println(ans);
		    
		}
		
	}
}
