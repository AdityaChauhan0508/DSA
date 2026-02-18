import java.util.*;
public class loops {
    public static void main(String[] args) {


        //Syntax of for loop ; for(intialisation;condition;updation){
            // do something 
        //}
        //counter++ => counter = counter +1
        for(int counter = 0; counter < 3; counter++) {
            System.out.println("hello world");
        }

        for(int i = 0;i<11;i++) {
            System.out.print(i+"  ");
        }




        //syntax of while loop ; while(condition){
            //do something
        //}
        int i = 0;
        while(i<11) {
            System.out.println(i);
            i++;
        }




        //syntax of do while loop ;  do{
            //do something
        //}while(condition);
        int j =1;
        do{
            System.out.println(j);
            j++;
        } while(j<11);




        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();
        

        //print the sum of first n natural number
        int sum = 0;
        for(int k=0; k<=n; k++) {
            sum = sum + k ;
        }
        System.out.println(sum);
        


        //print the table of a number input by the user
        for(int t=1 ; t<11 ; t++) {
            System.out.println(t*n);
            
        }

     sc.close();
    
    }
    
}
