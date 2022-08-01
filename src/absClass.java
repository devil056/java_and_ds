abstract class Shapes{
    abstract void draw();
}

class Rectangle extends Shapes{
    void draw(){
        System.out.println("Need length and breadth.");
    }
}

class Circle extends Shapes{
    void draw(){
        System.out.println("You need diameter or radius to draw a circle");
    }
}

class Test{
    public static void main(String args[]){
        Shapes s1=new Rectangle();
        s1.draw();
        Shapes s2=new Circle();
        s2.draw();
    }
}