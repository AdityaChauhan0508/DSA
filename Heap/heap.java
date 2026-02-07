import java.util.ArrayList;

public class heap {
    
    static class heaps {
        ArrayList<Integer> arr = new ArrayList<>();


        public void add(int data) {  // O(logn)
            //Add at last index
            arr.add(data);

            int x = arr.size()-1;  // x is a child index
            int par = (x-1) / 2 ;  // par index

            //fix heap
            while (arr.get(x) < arr.get(par)) {
                //swap
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }
        }


        public int peek() {
            return arr.get(0);
        }


        private void heapify(int i) {  //O(logn)
            int left = 2*i + 1;
            int right = 2*i + 2;
            int minIdx = i;

            if (left < arr.size() && arr.get(minIdx) > arr.get(left)) {
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)) {
                minIdx = right;
            }

            if(minIdx != i) {
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx, temp);
            }
        }


        public int remove() {  //O(logn)
            int data = arr.get(0);

            //step-1 -> swap firat and last
            int temp = arr.get(0);
            arr.set(0, arr.get(arr.size()-1));
            arr.set(arr.size()-1, temp);
            
            //step-2 -> delete last
            arr.remove(arr.size()-1);

            //step-3 -> Heapify
            heapify(0);
            
            return data;
        }


        public boolean isEmpty() {
            return arr.isEmpty();
        }
    }


    public static void main(String[] args) {
        heaps h = new heaps();
        h.add(3);
        h.add(4);
        h.add(1);
        h.add(5);

        while (!h.isEmpty()) {  // heap sort bhi kehte hai isko or time compexity => O(n logn)
            System.out.println(h.peek());
            h.remove();
        }
    }
}
