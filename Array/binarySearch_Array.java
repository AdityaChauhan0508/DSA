public class binarySearch_Array {

    public static int binarySearch (int numbers[] , int key){
        int start = 0 ; int end = numbers.length-1 ;

        while(start <= end){
            int mid = (start + end) / 2 ;
            
            if(numbers[mid] == key){
                return mid ;
            }
            else if(mid<key){
                start = mid+1;
            }else{
                end = mid -1 ;
            }
        }
        return -1 ;
    }
    public static void main(String[] args) {
        int numbers[] = { 2,3,4,5,6,7,9,10,12};
        int key = 10;
        System.out.println("Index for key is : " + binarySearch(numbers, key));
    }
    
}
