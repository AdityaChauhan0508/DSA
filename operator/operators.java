public class operators {
    public static void main(String[] args) {
        int p = 20 , q = 10;
        // Arithmetic operators
        System.out.println(p+q);
        System.out.println(p-q);
        System.out.println(p*q);
        System.out.println(p/q);
        System.out.println(p%q);
        
        // Relational operators
        int r = 10 , s = 15;

        System.out.println(r==s);//false
        System.out.println(r!=s);//true
        System.out.println(r<=s);//true
        System.out.println(r>=s);//false
        System.out.println(r >s);//false
        System.out.println(r< s);//true

        // Logical operators
        int a= 15, b = 10, c= 5;
        
        // && Operator
        System.out.println((a>b) && (a>c)); //true
        System.out.println((a>b) && (a<c)); //false
        
        // || Operator
        System.out.println((c<b) || (a<b)); //true
        System.out.println((a>b) || (b>c)); //true
        System.out.println((a<b) || (b<c)); //false

        // ! Operator
        System.out.println(!(a==b)); //true
        System.out.println(!(a>b )); //false

        // Assignment operator
        int x = 10;
        int y;

        // = 
        y = x;
        System.out.println(y); //10

        // +=
        x += y; // x = x + y , x=20
        System.out.println(x);

        // -=
        x -= y; // x = x - y , x=10
        System.out.println(x);

        // *=
        x *= y; // x = x * y , x=100
        System.out.println(x);

        // /=
        x /= y; // x = x / y , x=10
        System.out.println(x);

        // Unary operators on operator 2
         
        


    }
    
}
