public class advancepattern2 {


    public static void hollow_rhombus(int n ){
        for(int i = 1 ; i<=n ; i++){
            //spaces
            for(int j = 1 ; j<=(n-i) ; j++){
                System.out.print(" " + " ");
            }

            //stars
            for(int j = 1 ; j<=n ; j++){
                if(i == 1 || i == n || j == 1 || j == n){
                    System.out.print("*"+ " ");
                }else{
                    System.out.print(" "+ " ");
                }
            }System.out.println();

        }
    }
    public  static void main(String args[]) {
        int n = 5;
        
        //Solid rhombus

        for(int i=1; i<=n; i++ ) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" "+" ");
            }

            //stars
            for(int j=1; j<=5; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }



        //Number pyramid

        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" "); 
            }
            //number
            for(int j=1; j<=i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


        //Diamond pattern

        //upper half
        for(int i=1; i<=n; i++) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" "+" ");
            }

            //stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        //lower half
        for(int i=n; i>=1; i--) {
            //spaces
            for(int j=1; j<=n-i; j++) {
                System.out.print(" "+" ");
            }
        
            //stars
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*"+" ");
            }
            System.out.println();
       }

       
    //calling hollow rhombus function    
    hollow_rhombus(5);
        
    }
    
}
