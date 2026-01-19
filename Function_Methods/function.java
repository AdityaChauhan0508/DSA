import java.util.Scanner;
public class function  {
  ////// 1= program to print name
  
    //public static void printMyName(String name) {
      //  System.out.println(name);
      //  return;
   // }
   // public static void main (String args[]) {
      //  Scanner sc = new Scanner(System.in);
      //  String name = sc.next();

       // printMyName(name);  // Calling function
   // }


    ////// 2 = program to add two numbers and print their sum

    //public static int calculateSum(int a , int b) {
      //  int sum = a + b ;
        //return sum;

    //}
    //public static void main(String args[]) {
      //  Scanner sc = new Scanner (System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        
        //int sum = calculateSum(a,b);   // Calling function
        //System.out.println("sum of two numbers:" + sum);        
    //}


    ///// 3 = program to find product of 2 numbers
    
    //public static int calculateProduct(int a, int b) {
      //  return a*b;
    //}
    //public static void main(String args[]) {
      //  Scanner sc = new Scanner(System.in);
        //int a = sc.nextInt();
        //int b = sc.nextInt();
        
        ///System.out.println("poduct of two numbers is:"+ calculateProduct(a, b));
    //}


    ////// 4 = print factorial of a number

    public static void printFactorial(int n) {
      //loop
      if(n<0) {
        System.out.println("invalid number");
        return;
      }
      int factorial = 1;
      for(int i=n ; i>=1; i--) {
        factorial = factorial * i;
      }
      System.out.println(factorial);
      return;
    }
    public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      printFactorial(n);
      sc.close();
    }

}
