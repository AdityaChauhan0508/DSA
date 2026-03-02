public class simplePattern {
    public static void main(String[] args) {
        //Sqaure pattern
        System.out.println("Sqaure Pattern");
        for(int i=1 ; i<=4 ; i++){
             System.out.println("* * * *");

        }  
        //Triangle pattern
        System.out.println("Triangle pattern");
        for(int i = 1 ; i <=7 ; i++){
            for(int j=1 ; j<=i ; j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //inverted star pattern
        System.out.println("Inverted star pattern");
        int n = 7;
        for(int i = 1; i<=n ; i++){
            for(int j = 1 ; j<=(n-i+1) ;j++){
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        //Half pyaramid pattern
        System.out.println("Half Pyaramid pattern");
        for(int i = 1 ; i<=5 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }


        //Character triangle pattern
        System.out.println("Character triangle");
        char ch = 'A';
        for(int i=1 ; i <= 7 ; i++){
            for(int j = 1 ; j<=i ; j++){
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }


        //Numbers Triangle
        System.out.println("NUmbers triangle");
        int o = 1;
        for(int i=1; i<=5 ; i++){
            for(int j=1; j<=i ; j++){
                System.out.print(o + " ");
                o++;
            }
            System.out.println();
        }
        
        
    }

}

