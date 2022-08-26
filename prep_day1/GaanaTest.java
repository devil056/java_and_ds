class Song{
    String name;
    String artists;
    float duration;
    Song next;
    Song prev;
    Song(String name,String artists,float duration){
        this.name=name;
        this.artists=artists;
        this.duration=duration;
    }

    void showDetails(){
        System.out.println("Track: "+this.name+" Artists: "+this.artists+" Duration: "+this.duration);
        System.out.println("---------------------");
    }
}

class GaanaTest {
    public static void main(String[] args){
        Song s1=new Song("Stay","Justin bieber",5.23f);
        Song s2=new Song("Rolex","Anirudh,Kamal Hassan",2.35f);
        Song s3=new Song("Kesariya","Ranbir, AR Rahman",4.30f);
        s1.showDetails();
        s2.showDetails();
        s3.showDetails();
        s1.prev=s3;
        s1.next=s2;
        s2.prev=s1;
        s2.next=s3;
        s3.prev=s2;
        s3.next=s1;
        Song song=s1;
        while(true){
            song.showDetails();
            song=song.next;

            if(song.next==s1){
                break;
            }
        }

        System.out.println("[Backward looping]");

        Song back=s3;
        while(true){
            song.showDetails();
            song=song.prev;
            if(song.prev==s3){
                song.showDetails();
                break;
            }
        }
    }
}
