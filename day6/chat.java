import java.sql.Timestamp;
import java.time.Instant;

//Implement List Data Structure to create a chat conversation using OOPS.
// You must create a class Message with suitable attributes and a class Chat
// with suitable attributes. Chat has 1-many relation with Messages.
class Assg5th {
    public static void main(String[] args){
        Chat chat1=new Chat(10);
        Message msg1=new Message("Ram","Hello",Timestamp.from(Instant.now()));
        Message msg2=new Message("Tonmoy","GM",Timestamp.from(Instant.now()));
        Message msg3=new Message("Tany","Hi",Timestamp.from(Instant.now()));
        Message msg4=new Message("Nagendra","Hey",Timestamp.from(Instant.now()));
        Message msg5=new Message("Biswas","Namaste",Timestamp.from(Instant.now()));
        chat1.addMessage(msg1);
        chat1.addMessage(msg2);
        chat1.addMessage(msg3);
        chat1.addMessage(msg4);
        chat1.addMessage(msg5);
        chat1.show();
    }
}
class Chat{
    int numberOfMessages=10;
    int messageCount=0;
    Message[] messages=new Message[numberOfMessages];
    Chat(int numberOfMessages){
       // this.numberOfMessages=numberOfMessages;
    }
    void addMessage(Message msg){
        messages[messageCount]=msg;
        messageCount++;
    }
    void show(){
        for (int i = 0; i < messageCount; i++) {
            System.out.println(messages[i].user+":"+messages[i].message+" "+messages[i].time);
        }
    }
}
class Message{
    String user;
    String message;
    Timestamp time;
    Message(String user, String message,Timestamp t){
        this.user=user;
        this.message=message;
	this.time=t;
    }
}
