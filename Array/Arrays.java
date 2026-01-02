import java.util.*;
public class Arrays {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){
        //array creation
        int marks[] = new int[100];
        //int sum [] = {101 , 123 , 23 , 456};


        //array input
        
        marks [0] = 97;
        marks [1] = 98;
        marks [2] = 99;
        marks [3] = sc.nextInt();
        marks [5] = 100;


        //array output
        System.out.println("Marks [3] = " + marks[3]);
        System.out.println("Marks [5] = " + marks[5]);
        System.out.println("Marks [0] = " + marks[0]);
        System.out.println("Marks [1] = " + marks[1]);
        System.out.println("Marks [2] = " + marks[2]);

        
       
        //array update
        System.out.println("Array update");
        System.out.println("Marks [0] " + ( marks [0] += 1) ); //98
        System.out.println("Marks [1] " + (marks [1] = marks[1] + 2) ); //100
        System.out.println("Marks [2] " + ( marks [2] = marks[2] - 1) ); //98
        System.out.println("Marks [3] " + (marks [3] += 2) );
        
        }
    }
}
