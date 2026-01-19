import java.util.*;
public class function_methods {

    //Function to print hello world
    public static void printHelloworld(){
        System.out.println("Hello world");
        System.out.println("Hello world");
        System.out.println("Hello world");
        return;
    }

    //Function to calculate sum of two numbers
    public static int calculateSum(int a , int b){
       
        int sum = a+b;
        return sum;
        
    }

    //Function to multiply two numbers
    public static int multiply(int a , int b ){
        int mul = a*b;
        return mul;

    }

    //Function to calculate factorial of a number
    public static int factorial(int p){
        int f = 1;
        for(int i = 1 ; i<=p ; i++){
            f = f*i;
        }
        return f;

    }

    //function to calculate binomial coefficient
    public static int bincoeff(int n , int r ){
        int fact_n = factorial(n);
        int fact_r = factorial(r);
        int fact_nmr = factorial(n-r);

        int bincoeff = fact_n / (fact_r*fact_nmr);
        return bincoeff;
    }

    //function overloading with parameters
    public static int sum(int a , int b){
        return a+b;

    }
    
    public static int sum(int a , int b , int c){
        return a+b+c;
    }

    //Function for to check a number is prime or not
    public static boolean isPrime(int n){
        //corner cases
        if(n==2){
            return true;
        }

        
        for(int i = 2 ; i<=n-1 ; i++){
            if(n%i==0){//completely dividing
                return false ; 
            }
        }
        return true;
    }

    //for optimized condition to check prime i<=math.sqrt(n);

    //function to find prime number in a range
    public static void rangePrime(int n ){
        for(int i = 2 ; i<=n ; i++){
            if(isPrime(i)){
                System.out.print( i +" ");
            }
        }
        System.out.println();
    }

    //Function to convert bin to dec number
    public static void binToDec(int binNum ){
        int myNum = binNum;
        int pow = 0;
        int decNum = 0 ;

        while(binNum>0){
            int lastDigit = binNum%10;
            decNum = decNum + (lastDigit * (int) Math.pow(2,pow));
            pow++;
            binNum = binNum/10;
        }
        System.out.println("decimal number of " + myNum + " is :" + decNum);
    }

    //function to convert dec to bin
    public static void decToBin(int n ){
        int myNum = n;
        int pow = 0 ;
        int binNum = 0 ;

        while (n>0) {
            int rem = n%2;
            binNum = binNum + (rem * (int)Math.pow(10, pow));
            pow++;
            n /= 2;
            
        }
        System.out.println("Binary number of " + myNum + " is :"+ binNum);
    }




    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        // System.out.println("Enter first number");
        // int a = sc.nextInt();
        // System.out.println("Enter second number");
        // int b = sc.nextInt();
        // System.out.println("Enter number to calc factorial");
        // int p = sc.nextInt();
        // System.out.println("Enter n for factorial");
        // int n = sc.nextInt();
        // System.out.println("Enter r for factorial");
        // int r = sc.nextInt();

        // //code for sum of two number     
        // int su = calculateSum(a,b);
        // System.out.println("Sum is :" + su);
        
        
        // //code for multiply of two numbers
        // int mul = multiply(a, b);
        // System.out.println("multiply is :"  + mul);


        // //code for factorial of a number
        // int fact = factorial(p);
        // System.out.println("Factorial is" + fact);

        // //code for binomial coefficient
        // int bincoeff = bincoeff(n , r);
        // System.out.println("Binomial coefficient is :" + bincoeff);

        // //code for function overloading
        // System.out.println(sum(4, 5));
        // System.out.println(sum(56, 6, 7));

        // //code for prime number
        // System.out.println(isPrime(5));

        // //code for range prime
        // rangePrime(789);

        // //code for bin to dec
        // binToDec(1010);

        // //code for dec to bin
        // decToBin(5);
        
        sc.close();

        
        

    }
    
    
}
