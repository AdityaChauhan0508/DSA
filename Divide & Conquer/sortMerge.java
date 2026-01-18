public class sortMerge {

    public static void printArr(int arr[]){
        for(int i=0 ; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


    public static void mergeSort(int arr[] , int si , int ei){

        //base case
        if(si >= ei){
            return;
        }

        int mid = si + (ei - si )/2; //to divide the array in to mid (or = (si + ei)/2;)
        mergeSort(arr, si, mid); // to sort the left part
        mergeSort(arr, mid+1, ei); // to sort the right part

        merge(arr , si , mid , ei); // to merge the both sorted part


    }

    //merge method to merge the sorted parts
    public static void merge(int arr[] , int si , int mid , int ei){
        int temp[] = new int[ei - si + 1];
        int i = si; //iterator for the left sorted part 
        int j = mid+1; //iterator for the right sorted part 
        int k = 0;  //iterator for the temp array 

        while(i <= mid && j <= ei ){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        //for left over elements of left sorted part
        while( i <= mid){
            temp[k++] = arr[i++];
        }

        //for left over elements of right sorted part
        while( j <= ei){
            temp[k++] = arr[j++];
        }

        //copy temp to original array 
        for(k=0 , i=si; k<temp.length ; k++ , i++){
            arr[i] = temp[k];
        }
    }

    public static void main(String[] args) {
        //T.C => O(nlogn) S.C => O(n)
        int arr [] = {6,3,9,5,2,8-2};
        mergeSort(arr, 0, arr.length-1);
        printArr(arr);
    }
    
}
