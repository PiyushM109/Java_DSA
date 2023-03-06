public class time_neede_to_buy_tickets {
    public static int timeRequiredToBuy(int[] tickets, int k) {
        int i = 0;
        int time = 0;
        int size = tickets.length;
        while(tickets[k]>0){
            if(tickets[(i+size)%size]>0){
                tickets[(i+size)%size]--;
                time++;
            }
            i++;
        }
        return time;
    }

    public static void main(String[] args) {
        int[] tickets = {2,3,2};
        System.out.println(timeRequiredToBuy(tickets, 2));
    }
}
