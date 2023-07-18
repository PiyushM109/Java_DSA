import java.util.*;

public class insertInHeap{
    static class Heap{
        ArrayList<Integer> arr = new ArrayList<>();
        

        public void add(int data) {
            arr.add(data);
            int n = arr.size()-1;
            int par = (n-1)/2;

            while(arr.get(n)<arr.get(par)){
                int temp = arr.get(n);
                arr.set(n, arr.get(par));
                arr.set(par, temp);

                n = par;
                par = (n-1)/2;
            }

        }
        public int peek(){
            int n = arr.get(0);
            return n;
        }


        private void heapify(int i){
            int left  = (2*i)+1;
            int right = (2*i)+2;
            int minIdx = i;

            if(left<arr.size() && arr.get(minIdx)>arr.get(left)){
                minIdx = left;
            }
            if(right<arr.size() && arr.get(minIdx)>arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);


                heapify(minIdx);
            }
        }
        public int remove(){
            int data = arr.get(0);

            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);

            arr.remove(arr.size()-1);

            heapify(0);

            return data;
        }

        public boolean isEmpty(){
            return arr.size()==0;
        }

    }

    public static void main(String[] args) {
        Heap h = new Heap();
        h.add(5);
        h.add(9);
        h.add(2);
        h.add(7);
        h.add(1);   
        while(!h.isEmpty()){
            System.out.println(h.peek());
            h.remove();
        }
    }
} 