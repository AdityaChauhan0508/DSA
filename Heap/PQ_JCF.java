import java.util.PriorityQueue;

// package DSA in Java.Heaps;

public class PQ_JCF {

    static class Student implements Comparable<Student> {
        String name ;
        int rank ;

        public Student(String name, int rank) {
            this.name = name ;
            this.rank = rank ;
        }

        @Override
        public int compareTo( Student s2) {
            return this.rank - s2.rank ;
        }
    }
    
    public static void main(String[] args) {
        
        //1,2,3,4,5
        PriorityQueue<Student> pq = new PriorityQueue<>(); //Comparator.reverseOrder() -> to print in reverse order

        // pq.add(3);
        // pq.add(4);
        // pq.add(1);
        // pq.add(7);

        pq.add(new Student("A", 4));
        pq.add(new Student("B", 5));
        pq.add(new Student("C", 2));
        pq.add(new Student("D", 12));

        while (!pq . isEmpty()) {
            System.out.println(pq.peek().name + " => " + pq.peek().rank);
            pq.remove();   
        }
    }
}
