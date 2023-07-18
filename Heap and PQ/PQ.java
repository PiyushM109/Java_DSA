import java.util.Comparator;
import java.util.PriorityQueue;

public class PQ{
    public class Student implements Comparable<Student>{
        String name;
        int rank;
        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
    
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(Comparator.reverseOrder());

        pq.add(new PQ().new Student("RK", 4));
        pq.add(new PQ().new Student("Sush", 15));
        pq.add(new PQ().new Student("Piyu", 8));
        pq.add(new PQ().new Student("Avi", 1));
        

        while(!pq.isEmpty()){
            System.out.print(pq.peek().name+"->"+pq.remove().rank+" ");
        }
    }
}