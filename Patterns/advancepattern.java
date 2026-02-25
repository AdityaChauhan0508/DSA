public class advancepattern {
    public static void main (String args[]) {

      
        int n= 100;

        //Butterfly pattern  

        //upper half
        for(int i=1; i<=n; i++) {
            // 1st part of *
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }

            // spaces
            int spaces = 2 *(n-i);
            for(int j=1; j<=spaces; j++) {
              System.out.print(" "+" ");
            }

            // 2nd part of *
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
          }

          //lower half
        for(int i=n; i>=1; i--) {
          //   1st part of *
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }

            // spaces
            int spaces = 2 * (n-i);
            for(int j=1; j<=spaces; j++) {
                System.out.print(" "+" ");
            }

            // 2nd part of *
            for(int j=1; j<=i; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();        
    
        }




        //Palindromic pattern

        for(int i=1; i<=n; i++) {
            //spacces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" "+" ");
            }

            //1st half numbers 
            for(int j=i; j>=1; j--) {
                System.out.print(j+" ");
            }

            //2nd half numbers
            for(int j=2; j<=i; j++)  {
                System.out.print(j+" ");
            }

            System.out.println();
        
        }
        
        
    }

}