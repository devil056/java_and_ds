class Movies{
    String genre;
    String actor;
    Movies(String genre,String actor){
        this.genre=genre;
        this.actor=actor;
    }
    Movies(String actor){
        this.actor=actor;
    }
}

class Bollywood extends Movies{
    Bollywood(){
        super("Romance;)","Emraan Hashmi");
    }
    void printDetails(){
        System.out.println("Popular actor:"+this.actor);
        System.out.println("Genre you selected:"+this.genre);
    }
}

class Malayalam extends Movies{
    String category;
    Malayalam(){
        super("Salam Dulquer");
        this.category="Dream boat";
    }
    void printDetails(){
        System.out.println("Category: "+this.category);
        System.out.println("Actor: "+this.actor);
    }
}
class Test{
    public static void main(String[] args){
        Malayalam m=new Malayalam();
        m.printDetails();
    }
}