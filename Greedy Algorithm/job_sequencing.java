import java.util.ArrayList;

public class job_sequencing {
    static class Job{
        int deadline;
        int profit;
        int id;

        public Job(int i, int d, int p){
            id = i;
            deadline = d;
            profit = p;
        }
    }

    public static void main(String[] args) {
        int[][] jobInfo = {{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Jobs> jobs = new ArrayList<Jobs>();

        for(int i=0; i<jobs.length; i++){
            jobs[i] = new Job(i, jobInfo[i][0], jobInfo[i][1]);
        }
    }
}
