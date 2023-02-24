
public class primes_in_range {
    public static void prINrange(int s, int e){
        for(int i = s; i<=e; i++){
            boolean flag = true;
            for(int j = 2; j<= Math.sqrt(i); j++){
                if(i%j==0){
                    flag = false;
                }
            }
            if(flag==true){
                System.out.println(i);
            }
        }
    }

    public static void main(String[] args) {
        prINrange(2, 100);
    }
}
