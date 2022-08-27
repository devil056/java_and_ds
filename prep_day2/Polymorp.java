class GeoShapes{
    void sides(){
        System.out.println("Default func");
    }
}

class Rectangle extends GeoShapes{
    void sides(){
        System.out.println("Has 4 sides");
    }
}

class Pentagon extends GeoShapes{
    void sides(){
        System.out.println("has 5 sides");
    }
}

class Hexagon extends GeoShapes{
    void sides(){
        System.out.println("Has 6 sides");
    }
}

class Polymorp {
    public static void main(String[] args){
        GeoShapes g=new GeoShapes();
        g.sides();
        GeoShapes g1=new Rectangle();
        g1.sides();
        GeoShapes g2=new Pentagon();
        g2.sides();
        GeoShapes g3=new Hexagon();
        g3.sides();
    }
}
