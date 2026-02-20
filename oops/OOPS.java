public class OOPS {

    public static void main(String[] args) {
        // Pen p1 = new Pen();//created a pen object called p1
        // p1.setColor("Blue");
        // System.out.println(p1.getColor());
        // p1.setTip(5);
        // System.out.println(p1.getTip());
        // p1.setColor("Yellow");
        // System.out.println(p1.getColor());

        // //Abstarct classes
        // horse h = new horse();
        // h.eat();
        // h.walk();
        // System.out.println(h.color);
        // chicken c = new chicken();
        // c.eat();
        // c.walk();

        //interfaces
        Queen q = new Queen();
        q.moves();

    }
    
}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }

    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int Tip){
        //this.tip = tip;
    }
}
 

//Abstract classes
abstract class Animal{
    String color;

    Animal(){
        color = "brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();
    
}

class horse extends Animal{
    void changeColor(){
        color = "dark brown";
    }
    void walk(){
        System.out.println("walks on four legs");
    }
}

class chicken extends Animal{
    void changeColor(){
        color = "yellow";
    }
     
   void walk(){
    System.out.println("wals on 2 legs");
   }
}


//Intefaces
interface chessPlayer{
    void moves();
}

class Queen implements chessPlayer{
    public void moves (){
        System.out.println("up , down , left , right , diagonal (by 1 moves)");
    }
}

class Rook implements chessPlayer{
    public void moves (){
        System.out.println("up , down , left , right ");
    }
}

class King implements chessPlayer{
    public void moves (){
        System.out.println("up , down , left , right , diagonal (in all four directions)");
    }
}