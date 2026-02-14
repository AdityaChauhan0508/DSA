// public class LLdemo2 {

//     public static class Node{
//         int data;
//         Node next;

//         public Node(int data){
//             this.data = data;
//             this.next = null;
//         }
//     }
//     // Head and Tail in LL
//     public static Node head;
//     public static Node tail;
//     public static int size; 

//     //Detecting a Cycle/Loop in LL
//     public static  boolean isCycle(){ // FCA -> Floyd's Cycle finding Algorithm
//         Node slow = head;
//         Node fast = head;

//         while (fast != null && fast.next != null) {
//             slow = slow.next; //+1
//             fast = fast.next.next; //+2
//             if (slow == fast) {
//                 return true; // Cycle Exist
//             }
//         }
//         return false; //Cycle doesn't Exist
//     }

//     //Remove a Loop/Cycle in a LL
//     public static void removeCycle(){
//         //detect cycle
//         Node slow = head;
//         Node fast = head;
//         boolean cycle = false;
//         while (fast != null && fast.next != null) {
//             slow = slow.next;
//             fast = fast.next.next;
//             if (slow == fast) {
//                 cycle = true;
//                 break;
//             }
//         }
//         if (cycle == false) {
//             return;
//         }

//         //find meeting point
//         slow = head;
//         Node prev = null; //last Node
//         while (slow != fast) {
//             prev = fast;
//             slow = slow.next; //+1
//             fast = fast.next; //+1
//         }

//         //remove cycle -> lastNode.next = null;
//         prev.next = null; 
//     }
    

//     public static void main(String[] args) {
//         head = new Node(1);
//         Node temp = new Node(2);
//         head.next = temp;
//         head.next.next = new Node(3); 
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = temp;
//         //1->2->3->4->2
//         System.out.println("Before cycle remove cycle exist = ");
//         System.out.println(isCycle());
//         removeCycle();
//         System.out.println("After cycle remove cycle exist = ");
//         System.out.println(isCycle());


        
//     }
    
// }
