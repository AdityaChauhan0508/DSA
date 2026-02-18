import java.util.*;

// if || else conditional statement

public class ifelse {
    public static void main(String args[]) {
        Scanner sc= new Scanner(System.in);
        int age = sc.nextInt();

        if(age>18){
            System.out.println("you are adult");
        }else{
            System.out.println("you are not adult");
        }


        
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a==b) {
            System.out.println("a and b is equal");
        }else{
            if(a>b){
                System.out.println("a is greater");
            }else{
                System.out.println("a is lesser");
            } 
            sc.close();   
    }
    }            
              
}   
    
    