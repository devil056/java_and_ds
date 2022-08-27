class MovieTicket {

    String name;
    String time;
    int price;
    int seatNumber;
    char rowNumber;
    String userEmail;

    public MovieTicket() {

    }

    public MovieTicket(String name, String time, int price, int seatNumber, char rowNumber) {
        this.name = name;
        this.time = time;
        this.price = price;
        this.seatNumber = seatNumber;
        this.rowNumber = rowNumber;
        userEmail = "";
    }

    public void payForTicket(int amount, User user) {

        if(userEmail.isEmpty()) {
            System.out.println("Paying for Movie: "+name);
            System.out.println("Thank you "+user.name+" to make a payment..");
            userEmail = user.email;
            System.out.println("Ticket with seat number #"+seatNumber+" Booked for "+user.email+" and Email Sent....");
            System.out.println();
        }else {
            System.out.println(user.name+" Sorry !! The ticket with seat# "+seatNumber+" is sold...");
        }
    }

    @Override
    public String toString() {
        return "MovieTicket [name=" + name + ", time=" + time + ", price=" + price + ", seatNumber=" + seatNumber
                + ", rowNumber=" + rowNumber + ", userEmail=" + userEmail + "]";
    }

}

class User {

    String name;
    String phone;
    String email;

    public User() {

    }

    public User(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "User [name=" + name + ", phone=" + phone + ", email=" + email + "]";
    }

}
class BookTicketTask extends Thread{

    MovieTicket ticketToBook;
    User userToBook;


    BookTicketTask(MovieTicket ticket, User user){
        ticketToBook = ticket;
        userToBook = user;
    }

    public void run() {

        synchronized (ticketToBook) {
            ticketToBook.payForTicket(ticketToBook.price, userToBook);
        }

    }

}

class BookMeTicketApp {

    public static void main(String[] args) {

        MovieTicket ticket1 = new MovieTicket("Rocketry", "12:00", 300, 1, 'A');
        MovieTicket ticket2 = new MovieTicket("Rocketry", "12:00", 300, 2, 'A');
        MovieTicket ticket3 = new MovieTicket("Rocketry", "12:00", 300, 3, 'A');
        MovieTicket ticket4 = new MovieTicket("Rocketry", "12:00", 300, 4, 'A');
        MovieTicket ticket5 = new MovieTicket("Rocketry", "12:00", 300, 5, 'A');

        User user1 = new User("John", "+91 99999 11111", "john@example.com");
        User user2 = new User("Dave", "+91 99999 22222", "dave@example.com");
        User user3 = new User("Fionna", "+91 99999 33333", "fonna@example.com");

        // Select Seat Option...
        BookTicketTask task1 = new BookTicketTask(ticket1, user2);

        // user1 and user3 wish to book the same movie ticket
        BookTicketTask task2 = new BookTicketTask(ticket3, user1);
        BookTicketTask task3 = new BookTicketTask(ticket3, user3);

        task1.start();
        task2.start();
        task3.start();
    }
}