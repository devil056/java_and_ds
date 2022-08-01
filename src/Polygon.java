//Only by using the interfaces we can get the Multiple inheritance
interface Polygon{
    void getArea(int length,int breadth);
}
//rectangle1 doesn't extend it implements the interface
class Rectangle1 implements Polygon{

    //this is from the interface
    public void getArea(int len,int bd){
        System.out.println("Func from the Interface is implemented");
        System.out.println("The area of rectangle is : "+(float)(len*bd));
    }
    //this is from its own class just in case diff inputs were to be provided
    public void getArea(float len,float bd){
        System.out.println("It's own func is getting implemented");
        System.out.println("The area of rectangle is : "+(len*bd));
    }
}

class Test666{
    public static void main(String args[]){
        Polygon p1=new Rectangle1();
        p1.getArea(5,7);
        Rectangle1 r=new Rectangle1();
        r.getArea(8.3f,3.0f);
        r.getArea(6,8);
    }
}