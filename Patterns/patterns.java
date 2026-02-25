public class patterns {
    public static void main(String[] args) {
    // PRINTING OF PATTERNS
    int n= 5;
    int m= 5;


    //1 SOLID RECTANGLE
     System.out.println("SOLID RECTANGLE");
    
    //outer loop
    for(int i = 1; i<=n ; i++) {
      //inner loop
      for(int j = 1; j<=m; j++) {
        System.out.print("*"+" ");        
      }
      System.out.println(); 
    }


   //2 HOLLOW RECTANGLE
   System.out.println("HOLLOW RECTANGLE");    

    //outer loop
    for(int i =1; i<=n; i++) {      
      //inner loop
      for(int j=1; j<=m; j++) {        
        //cell => (i,j)
        if(i==1 || j==1 || i== n || j==m) {
          System.out.print("*"+" ");
        } else{
          System.out.print(" "+" ");
        }
      }
      System.out.println();
    }


    //3 HALF PYRAMID
    System.out.println("HALF PYRAMID");

    // outer loop
    for(int i = 1; i<=n; i++) {

      // inner loop
      for(int j=1; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    
    //4 INVERTED HALF PYRAMID
    System.out.println("INVERTED HALF PYRAMID");

    //outer loop
    for(int i=n; i>=1 ; i-- ){
      //inner loop
      for(int j=1; j<=i ; j++) {
        System.out.print("*");
      }
      System.out.println();
    }


    //5 INVERTED HALF PYRAMID[rotated by 180 deg]
    System.out.println("INVERTED HALF PYRAMID [rotated by 180 deg]");

    //outer loop
    for(int i=1; i<=n; i++) {
      //inner loop = space printing
      for(int j=1; j<=n-i; j++) {
        System.out.print(" ");
      }
      //inner loop = star printing
      for(int j =1; j<=i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }


    //6 HALF PYRAMID WITH NUMBERS 
    System.out.println("HALF PYRAMID WITH NUMBERS ");
    
    //outer loop
    for(int i=1; i<=n; i++ ) {
      //inner loop
      for(int j=1; j<=i; j++) {
        System.out.print(j+" ");
      }
      System.out.println();     
      
    }


    //7 INVERTED HALF PYRAMID WITH NUMBERS
    System.out.println("INVERTED HALF PYRAMID WITH NUMBERS");

    //outer loop
    for(int i=1; i<=n; i++) {
      //inner loop
      for(int j=1; j<=n-i+1; j++) {
        System.out.print(j+" ");
      }
      System.out.println();
    }


   //8 FLOYD's TRIANGLE
   System.out.println("FLOYD's TRIANGLE"); 

   int number = 1;
   //outer loop
   for(int i=1; i<=n; i++) {
    //inner loop
    for(int j=1; j<=i; j++) {
      System.out.print(number+" ");
      number++;      
    }
    System.out.println();    
   }


   //9 0-1 TRIANGLE
   System.out.println("0-1 TRIANGLE");

   //OUTER LOOP
   for(int i=1; i<=n; i++) {
    //inner loop
    for(int j=1; j<=i; j++) {
      int sum = i+j;
      if(sum % 2 == 0 ) { //even
        System.out.print("1"+" ");      
      } else{
        System.out.print("0"+" ");
      }
    }
    System.out.println();
   }
   

   
  }
}