interface Event {
    public void start();
}

interface Sports{
    public void play();
}

interface Hockey extends Sports,Event{
    public void show();
}

class Strawhats{
    public static void main(String arsg[]){
        Hockey h=new Hockey() {
            @Override
            public void start() {
                System.out.println("We are starting the Hockey tournament");
            }

            @Override
            public void play() {
                System.out.println("Hockey game started");
            }
            public void show(){
                System.out.println("The game is on live as well");
            }
        };
        h.start();
        h.play();
        h.show();
    }
}