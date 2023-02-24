public class recur {

    public static void printincreasing(int n){
        if(n==1){
            System.out.print(1+" ");
            return ;
        }
        printincreasing(n-1);
        System.out.print(n+" ");
    }

    public static int fibo(int n){
        if(n==1 || n==0){
            return n;
        }
        return fibo(n-1)+fibo(n-2);
    }

    public static int fact(int n){
        if(n==1){
            return 1;
        }
        return n*fact(n-1);
    }

    public static int sumOFfirst(int n){
        if(n==1){
            return 1;
        }
        return n+sumOFfirst(n-1);
    }

    public static boolean sortedORnot(int[] nums, int i){
        if(i==nums.length-1){
            return true;
        }

        if(nums[i]>nums[i+1]){
            return false;
        }

        return sortedORnot(nums, i+1);
    
    }

    public static boolean ispoweroftwo(int n){
        if (n <= 0) {
            return false;
        }
        if (n == 1) {
            return true;
        }
        if (n % 2 != 0) {
            return false;
        }
        return ispoweroftwo(n / 2);
    }

    public static int FirstOccu(int[] nums, int i, int key){
        if(i>nums.length-1){
            return -1;
        }
        if(nums[i]==key){
            return i;
        }

        return FirstOccu(nums, i+1, key);
    }

    public static int lastOccu(int[] nums,int i,int key){
        if(i<0){
            return -1;
        }
        if(nums[i]==key){
            return i;
        }
        return lastOccu(nums, i-1, key);
    }

    public static int pow(int x,int n){
        if(n==0){
            return 1;
        }
        return x*pow(x,n-1);
    }

    public static int OptiPow(int x,int n){
        if(n==0){
            return 1;
        }
        // if(n%2==0){
        //     int h = OptiPow(x, n/2);
        //     return h*h;
        // }else{
        //     int h = OptiPow(x, n/2);
        //     return x*h*h;
        // }
        int h=OptiPow(x, n/2);
        int halpsq = h*h;
        if(n%2 != 0){
            halpsq = x*halpsq;
        }
        return halpsq;
    }

    public static int tiling(int n){
        if(n==0 || n==1){
            return 1;
        }

        return tiling(n-1)+tiling(n-2);
    } 
    // public static StringBuilder removedupli(String str){
    //     //bruteforce
    //     StringBuilder newstr ;
    //     newstr.append(str.charAt(0));
    //     for(int i=1; i<str.length(); i++){
    //         for(int j=0; j<i; j++){
                
    //         }
    //     }
    // }

    public static int pairing(int n){
        if(n==2 || n==1){
            return n;
        }

        return pairing(n-1)+(n-1)*pairing(n-2);
    }
    
    public static void main(String[] args) {
        int[] num = {2,4,60,80,4,100, 60};
        // System.out.println(sortedORnot(num, 0));
        // System.out.println(ispoweroftwo(10));
        // System.out.println(lastOccu(num, num.length-1, 4));
        // System.out.println(pow(5,1));
        // System.out.println(OptiPow(2, 10));
        // System.out.println(tiling(4));
       System.out.println( pairing(3));
    }
}
