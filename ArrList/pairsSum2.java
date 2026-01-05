import java.util.ArrayList;

public class pairsSum2 {

    // //Brute force approach O(n^2)
    // public static boolean pairSum2(ArrayList<Integer> list , int target){
    //     for(int i=0; i<list.size(); i++){
    //         for(int j=i+1; j<list.size(); j++){
    //             if(list.get(i) + list.get(j) == target){
    //                 return true;
    //             }
    //         }
    //     }
    //     return false;
    // }

    //2 pointer approach O(n) Linear time complexity
    public static boolean pairSum2(ArrayList<Integer> list , int target){

        int bp = -1;
        int n = list.size();

        for(int i=0; i<list.size(); i++){
            if(list.get(i) > list.get(i+1)){ //condition to find out pivot element or breaking point becuase it is a rotated sorted array
                bp = i;
                break;
            }
        }

        int rp = bp;
        int lp = bp+1;

        while (lp != rp) {
            //case 1
            if(list.get(lp) + list.get(rp) == target){
                return true;
            } 
            //case 2
            if(list.get(lp) + list.get(rp) < target){
                lp = (lp+1) % n;
            }else{
                rp = (n+rp-1) % n;
            }
            
        }return false;

    }

    public static void main(String[] args) {
        int target = 16;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        System.out.println("Pair Exist = " + pairSum2(list, target));

    }


}
