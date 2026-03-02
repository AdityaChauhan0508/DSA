public class circularQueueUsingArray {
    static class Queue {
        int arr[]; 
        // Instance variable for the array
        int size;
        int rear;
        int front;

        // Constructor to initialize the queue
        Queue(int n) {
            arr = new int[n]; // Initialize the array with size n
            size = n;
            rear = -1;
            front = -1;
        }

        // Check if the queue is empty
        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        // Check if the queue is full
        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        // Add an element to the queue  T.C = O(1)
        public void add(int data) {
            if (isFull()) { // Queue is full
                System.out.println("Queue is full");
                return;
            }

            //add first element
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1)% size;
            arr[rear] = data; // Add the data at the rear
        }

        // Remove an element from the queue  T.C = O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            int result  = arr[front];
            
            //last element delete
            if (rear == front) {
                rear = front = -1;
            }else {
                front = (front + 1) % size;
            }
            return result;
        }

        // Peek at the front element of the queue
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }

            return arr[front];
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue(3); // Create a queue with size 5
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        // Print and remove all elements from the queue
        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
