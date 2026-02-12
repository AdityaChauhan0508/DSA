

public class LLdemo {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    // Head and Tail in LL
    public static Node head;
    public static Node tail;
    public static int size; //for size of LL

    //ADD First in LinkedList

    public void addFirst(int data){
        //step 1 - create a new node
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 - newNode next = head
        newNode.next = head;
        
        //step 3 - head = newNode
        head = newNode;
    }

    //ADD Last in LinkedList

    public void addLast (int data){
        //step 1
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        //step 2 
        tail.next = newNode;
        
        //step 3 
        tail = newNode;
    }

    //print in LL
    public void print() { // T.C = O(n) 
        if( head == null){
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

    //Add in Middle of LL
    public void add(int idx , int data){
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i =0;

        while (i < idx-1) {
            temp = temp.next;
            i++;
        }

        //i = idx-1; temp => prev
        newNode.next = temp.next;
        temp.next = newNode;
    }

    //Remove First in LL
    public int removeFirst(){
        if (size == 0) {
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    //Remove Last in LL
    public int removeLast() {
        if(size == 0 ){
            System.out.println("LL is Empty");
            return Integer.MIN_VALUE;
        }else if(size == 1){
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }
        //prev : i = size-2
        Node prev = head;
        for(int i=0; i<size-2; i++){
            prev = prev.next;
        }

        int val = prev.next.data;  //tail.data
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    //Iterative search
    public int itrSearch(int key) { // T.C = O(n)
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if(temp.data == key){ //Key found
                return i ;
            }
            temp = temp.next;
            i++;
        }
        //Key not found
        return -1;
    }

    //Recursive Search 

    public int helper(Node head , int key ) { // T.C = O(n)
        //base case
        if(head == null){
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if(idx == -1){
            return -1;
        }
        return idx+1;
    }

    public int recSearch(int key){
        return helper(head , key);
    }

    //Reverse a LL
    public void reverse(){ // T.C = O(n)
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    //Remove Nth Node from end
    public void deleteNthfromEnd(int n ) {
        //calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }
        if (n == sz) {
            head = head.next; //removeFirst
            return;
        }
        //sz-n
        int i=1;
        int iToFind = sz-n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        //return;
    }

    //Check if LL is Palindrome

    //Slow-Fast Approach
    public Node findMid(Node head){
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // slow is the midNode
    }

    public boolean checkPalindrome(){
        //base case
        if(head == null || head.next == null){
            return true;
        }
        //step 1 - Find midNode
        Node midNode = findMid(head);

        //step 2 - 2nd half reverse
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        //step 3 - check left half == right half
        Node right = prev;
        Node left = head;

        while (right != null) {
            if(left.data != right.data){
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }

    public static void main(String[] args) {
        LLdemo ll = new LLdemo();
       
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addFirst(1);
        ll.addLast(4);
        // ll.addLast(5);        
        ll.add(2,3);
        ll.add(2,3);
        ll.print(); 
        // System.out.println("Size of a LinkedList = " + ll.size);
        // System.out.println("Remove First in LL => the val is - " + ll.removeFirst());
        // ll.print();
        // ll.removeLast();
        // ll.print();
        // System.out.println(ll.size);

        // System.out.println("Itreative Search = " + ll.itrSearch(3));
        // System.out.println("Itreative Search = " + ll.itrSearch(10));
        // System.out.println("Recursive Search = " + ll.recSearch(3));
        // System.out.println("Recursive Search = " + ll.recSearch(10));

        // ll.reverse();
        // System.out.println("Reverse of a LL = ");
        // ll.print();

        // ll.deleteNthfromEnd(3);
        // System.out.println("LL after deleting Nth Node from end = ");
        // ll.print();

        //Palindrome

        // ll.addLast(1);
        // ll.addLast(2);
        // ll.addLast(2);
        // ll.addLast(1);

        // ll.print(); //1->2->2->1->NULL
        // System.out.println("LL is Palindrome = " + ll.checkPalindrome());

       

    }
}
