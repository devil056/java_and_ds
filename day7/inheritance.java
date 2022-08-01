public class inheritance {

    //Super Class
    static class MessagingSystem{
        String number;
        String uName;
        public void messaging(){
            System.out.println("The common func");
        }
    }

    //Subclass or Child class
    static class whatsApp extends MessagingSystem{
        public void sentMessage(){
            System.out.println("Message sent successfully.");
        }
    }

    public static void main(String[] args){
        whatsApp w1=new whatsApp();
        w1.number="9963565602";
        w1.uName="Murari";
        w1.messaging();
        w1.sentMessage();
    }
}

//Multiple inheritance is not supported in JAVA
//There is a flaw in the above code so better make it again with single inheritance flow today.