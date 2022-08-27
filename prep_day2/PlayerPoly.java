import javax.sound.midi.Soundbank;

class Player{
    static String sport="cricket";
    void getData(){
        System.out.println("This is the base class for sport: "+sport);
    }
}

class Batsmen extends Player{
    String name;
    static String role="Batsmen";
    float strikeRate;
    Batsmen(String name,float strikeRate){
        this.name=name;
        this.strikeRate=strikeRate;
    }
    void setStrikeRate(float newRate){
        this.strikeRate=newRate;
        System.out.println("Change of strike rate successful");
    }

    void getStrikeRate(){
        System.out.println("The strike rate of the player is "+this.strikeRate);
    }

    void getData(){
        System.out.println("Player Name: "+this.name);
        System.out.println("Position: "+this.role);
        System.out.println("Strike Rate: "+this.strikeRate);
    }
}

class Bowler extends Player{
    String name;
    static String position="Bowler";
    int wicketCount;
    Bowler(String name,int wicketCount){
        this.name=name;
        this.wicketCount=wicketCount;
    }
    void setWicketCount(int updateCountTo){
        this.wicketCount=updateCountTo;
        System.out.println("Updated the wicket count to "+this.wicketCount);
    }
    void getWicketCount(){
        System.out.println("The wicket count is "+this.wicketCount);
    }

    void getData(){
        System.out.println("Name: "+this.name+" Position: "+this.position+" Wickets: "+this.wicketCount);
    }
}

class WicketKeeper extends Player{
    String name;
    static String position="Wicket keeper";
    int stumps;
    WicketKeeper(String name,int stumps){
        this.name=name;
        this.stumps=stumps;
    }
    void getStumpsCount(){
        System.out.println("The no of the stumps the keeper made is "+this.stumps);
    }

    void setStumpsCount(int countUpdate){
        this.stumps=countUpdate;
        System.out.println("Updated the stumps count to"+this.stumps);
    }

    void getData(){
        System.out.println("Player name: "+this.name+" Position: "+this.position+" Stumps: "+this.stumps);
    }
}
class PlayerPoly {
    public static void main(String[] args){
        Batsmen p=new Batsmen("MS Dhoni",150f);
        Bowler p1=new Bowler("Ashwin",634);
        WicketKeeper p2=new WicketKeeper("Adam Gilchrist",547);
        p.getData();
        p1.getData();
        p2.getData();
        p2.getStumpsCount();
    }
}
