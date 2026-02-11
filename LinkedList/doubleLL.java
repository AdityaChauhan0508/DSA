// public class doubleLL {

//     public class Node{
//         int data;
//         Node next;
//         Node prev;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//             this.prev = null;
//         }
//     }

//     public Node head;
//     public Node tail;
//     public int size;

//     //Add First in DLL
//     public void addFirst(int data) {
//         Node newNode = new Node(data);
//         size++;

//         if (head == null) {
//             head = tail = newNode;
//             return;
//         }

//         newNode.next = head;
//         head.prev = newNode;
//         head = newNode;
//     }

//     //Print Function
//     public void print() {
//         Node temp = head;
//         while (temp != null) {
//             System.out.print(temp.data + "<->");
//             temp = temp.next;
//         }
//         System.out.println("null");
//     }
    
//     //Remove First in DLL
//     public int removeFirst() {
//         if(head == null){
//             System.out.println("DLL is Empty");
//             return Integer.MIN_VALUE;
//         }
//         if(size == 1 ) {
//             int val = head.data;
//             head = tail = null;
//             size--;
//             return val;
//         }
        
//         int val = head.data;
//         head = head.next;
//         head.prev = null;
//         size--;
//         return val;
//     }

//     //Reverse a Doubly LL
//     public void reverse() {
//         Node curr = head;
//         Node prev = null;
//         Node next;

//         while (curr != null) {
//             next = curr.next;
//             curr.next = prev;
//             curr.prev = next;
//             prev = curr;
//             curr = next;
//         }
//         head = prev;
//     }

//     public static void main(String[] args) {
//         doubleLL dll = new doubleLL();
//         dll.addFirst(3);
//         dll.addFirst(2);
//         dll.addFirst(1);

//         dll.print();
//         System.out.println("Size of Doubly Linked List = " + dll.size);

//         // dll.removeFirst();
//         // dll.print();
//         // System.out.println("Size of Doubly Linked List = " + dll.size);
//         // dll.removeFirst();
//         // dll.print();
//         // System.out.println("Size of Doubly Linked List = " + dll.size);

//         //reverse 
//         System.out.println("Before Reverse = ");
//         dll.print();
//         System.out.println("After Reverse = ");
//         dll.reverse();
//         dll.print();
//     }
    
// }
