class Player{
    String name;
    String id;
    String position;
    Player(String name,String id){
        this.name=name;
        this.id=id;
        this.position="On bench";
    }
    void printStat(){
        System.out.println("Player yet to play---");
        System.out.println("ID: "+this.id+" Name: "+this.name+" Position: "+this.position);
    }
}

class Batsmen extends Player{
    int runs;
    Batsmen(String name,String id,int runs){
        super(name,id);
        this.position="Batsmen";
        this.runs=runs;
    }

    void printStat(){
        System.out.println("ID: "+this.id+" Name: "+this.name+" Position: "+this.position);
        System.out.println("Runs: "+this.runs);
    }
}

class Bowler extends Player{
    int wickets;
    Bowler(String name,String id,int wickets){
        super(name, id);
        this.position="Bowler";
        this.wickets=wickets;
    }

    void printStat(){
        System.out.println("ID: "+this.id+" Name: "+this.name+" Position: "+this.position);
        System.out.println("Wickets: "+this.wickets);
    }
}

class Allrounder extends Player{
    int wickets;
    int runs;
    Allrounder(String name,String id,int wickets,int runs){
        super(name,id);
        this.position="Allrounder";
        this.wickets=wickets;
        this.runs=runs;
    }

    void printStat(){
        System.out.println("ID: "+this.id+" Name: "+this.name+" Position: "+this.position);
        System.out.println("Wickets: "+this.wickets+" Runs: "+this.runs);
    }
}

class TestPoly{
    public static void main(String args[]){
        Player p1=new Batsmen("Dhoni","7",78564);
        p1.printStat();
        Player p2=new Bowler("Ashwin","12",785);
        p2.printStat();
        Player p3=new Allrounder("Yuvraj","19",785,2529);
        p3.printStat();
        Player p4=new Player("Muthuswami","65");
        p4.printStat();
    }
}