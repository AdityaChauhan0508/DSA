public class linearSearch_Array {
    public static int linearSearch (int numbers [] , int key){
        for(int i = 1 ; i<numbers.length ; i++){
            if(numbers[i] == key ){
                return i ;
            }
        }
        return -1 ;
    }


    public static void main(String[] args) {
        int numbers [] = {1,2,3,4,5,6,7,8,9,10,12};
        int key = 10;

        int num = linearSearch(numbers, key);
        if (num == -1 ){
            System.out.println("Number is not present in the array ");
        }else{
            System.out.println("Number is at index : " + num);
        }
        
    }
    
}
