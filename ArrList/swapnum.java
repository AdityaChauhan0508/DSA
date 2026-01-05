
import java.util.*;

public class swapnum {

    public static void swap(ArrayList<Integer> list , int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        int idx1 = 3 , idx2 = 4;
        System.out.println(" List before swap = "+ list);
        swap(list, idx1, idx2 );
        System.out.println(" List After swap = "+ list);



    }
    
}
