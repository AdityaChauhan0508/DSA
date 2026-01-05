import java.util.ArrayList;
import java.util.Collections;

public class sortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(78);
        list.add(12);
        list.add(154);
        list.add(16);
        list.add(12);
        list.add(17);
        list.add(155);
        list.add(145);

        //Ascending order sorting
        System.out.println("List Before Sorting = "+ list);
        Collections.sort(list);
        System.out.println("List After Sorting Ascending = "+ list);
        System.out.println("Size of ArrayList = "+list.size());

        //Descending order sorting
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("List After Sorting Descending = "+ list);

    }
    
}
