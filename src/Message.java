public class Message implements Evenement{

    public String message;

    public Message(String message){
        this.message = message;
    }

    @Override
    public void afficher() {
        System.out.println("Message : " + message);
    }
}
