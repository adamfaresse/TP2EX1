public class Souris implements Evenement{

    public int x, y;
    public Bouton bouton;

    public enum Bouton { Aucun, Droite, Milieu, Gauche }
    public Souris(int x , int y , Bouton bouton){
        this.x = x;
        this.y = y;
        this.bouton = bouton;
    }

    @Override
    public void afficher() {
        System.out.println("Souris : "+ bouton +" "+ x +" "+ y);

    }
}
