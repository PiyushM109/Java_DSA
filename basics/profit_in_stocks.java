public class profit_in_stocks {
    public static int profit(int prices[]){
        int buy_price = prices[0];
        int pro[] = new int[prices.length];
        int tot=0;
        for(int i =1; i<prices.length; i++){
            if(prices[i]>buy_price){
                pro[i] = prices[i]-buy_price;
              tot += pro[i];
            }else{
                pro[i] =0;
            }
            buy_price = Math.min(buy_price, prices[i]);
        }
        int max = Integer.MIN_VALUE;
        for(int i =0; i<pro.length-1; i++){
            max = Math.max(pro[i], pro[i+1]);
        }
        return max;
    }
    public static void main(String[] args) {
        int price[] ={7,1,5,3,6,4};
        System.out.println(profit(price));
    }
    
}
