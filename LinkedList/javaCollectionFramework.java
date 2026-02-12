import java.util.LinkedList;

public class javaCollectionFramework {
    public static void main(String[] args) {
        //Creation of LinkedList
        LinkedList<Integer> ll = new LinkedList<>();

        //Add in LinkedList
        ll.addLast(2);
        ll.addLast(3);
        ll.addFirst(1);
        ll.addFirst(0);
        System.out.println("LinkedList is = " + ll);

        //Remove in LinkedList
        ll.removeFirst();
        ll.removeLast();
        System.out.println("After Remove operation LinkedList is = " + ll );
    }
    
}
