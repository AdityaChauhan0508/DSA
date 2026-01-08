//import java.util.*;
public class basicSortingAlgorithms {

    //Bubble sort O(n2)
    public static void bubblesort(int arr []){
        for(int i = 0 ; i<arr.length-1 ; i++){
            for(int j=0 ; j<arr.length-1-i ; j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("Bubble sorted array");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }


    //Selection sort O(n2)
    public static void selectionSort(int arr[]){
        for(int i=0 ; i<arr.length-1 ; i++){
            int minPos = i;
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[minPos] < arr[j]){
                    minPos = j;
                }
            }
            //swap
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
        System.out.println("Selection sort array");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }
    

    //Insertion sort O(n2)
    public static void insertionSort(int arr []){
        for(int i = 1 ; i<arr.length ; i++){
            int curr = arr[i];
            int prev = i-1;

            while (prev >=0  && arr[prev] >curr ) {
                arr[prev+1] = arr[prev];
                prev--;
                
            }
            arr[prev+1] =curr;
        }
        System.out.println("Insertion sorted array");
        for(int i=0 ;i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }


    //Counting sort
    public static void countingSort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0 ; i<arr.length ; i++){
            largest = Math.max(largest, arr[i]);

        }
        int count [] = new int[largest+1];
        for(int i = 0 ; i<arr.length ; i++){
            count[arr[i]]++;
        }
        int j = 0 ; 
        for(int i=0 ; i<count.length ; i++){
            while (count [i] > 0) {
                arr[j] = 1;
                j++;
                count[i]--;
            }
        }
        System.out.println("Counting sort");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }System.out.println();
    }

    public static void main(String[] args) {

        int arr []= {5,4,1,3,2,6};

        bubblesort(arr);

        selectionSort(arr);
        
        insertionSort(arr);

        countingSort(arr);               
    }   
}
