public class Clavier implements Evenement{

    public char car;

    public Clavier(char c){
        this.car = c;
    }

    @Override
    public void afficher() {
        System.out.println("Clavier : " + car);
    }
}
