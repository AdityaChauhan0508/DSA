public class merSortLL {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Head and Tail in LL
    public Node head;
    public static Node tail;

    // Method to add a new node at the end
    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Print the Linked List
    public void print() { // T.C = O(n)
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("NULL");
    }

    // Get the middle node of the Linked List
    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    // Merge two sorted Linked Lists
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }
        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }
        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    // Merge Sort for Linked List
    public Node mergeSort(Node head) {
        // Base case
        if (head == null || head.next == null) {
            return head;
        }

        // Find the middle
        Node mid = getMid(head);

        // Divide the Linked List into two halves
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(rightHead);

        // Merge the sorted halves
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        merSortLL ll = new merSortLL();
        ll.add(5);
        ll.add(3);
        ll.add(8);
        ll.add(1);
        ll.add(7);

        System.out.println("Original Linked List:");
        ll.print();

        // Sorting the Linked List
        ll.head = ll.mergeSort(ll.head);

        System.out.println("Sorted Linked List:");
        ll.print();
    }
}
     