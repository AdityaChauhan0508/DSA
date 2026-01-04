import java.util.*;

public class ArrayListdemo {
    public static void main(String[] args) {
        //ArrayList creation
        ArrayList <Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        //Operations on ArrayList 
        //Add element
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println("list is " + list);

        //get element
        System.out.println("Get element = " + list.get(2));
        System.out.println("Get element = " + list.get(3));

        //Remove element
        System.out.println("list after remove " + list.remove(2)+ " " + list);

        //set element
        System.out.println("set at index - " + list.set(2, 3) + " " + list);

        //contains element
        System.out.println("list conatins 1 = " + list.contains(1) );
        System.out.println("list conatins 12 = " + list.contains(12) );

        //size of ArrayList
        System.out.println("Size of an ArrayList " + list.size());

        //Reverse of an ArrayList
        System.out.print("Reverse of an ArrayList = ");
        for(int i = list.size()-1; i>= 0; i--){
            System.out.print( + list.get(i));
        }
        System.out.println();

        //Maximum in an ArrayList
        int max = Integer.MIN_VALUE;
        for(int i=0; i<list.size(); i++){
            max = Math.max(max, list.get(i));
        }
        System.out.println("Maximun in an ArrayList = " + max);


    }
    
}
