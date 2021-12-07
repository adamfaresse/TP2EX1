import java.util.ArrayList;
import java.util.List;

public class Main {
    //Question 1 : Il faut rajouter un type Message plus un constructeur Evenement adapté au Message et modifier la méthode afficher .
    //Question 2 : Le principe violé ici est le principe OCP. En effet la classe Evenement n'est pas ouverte à la modification sans modifier la classe.
    //Question 6 : Dans cette nouvelle organisation le code n'a pas besoin d'être modifier il suffit de créer une nouvelle classe Message qui implemente Evenement.
    public static void main(String[] args) {
        List<Evenement> evenements = new ArrayList<Evenement>();
        evenements.add(new Souris(10,10, Souris.Bouton.Gauche));
        evenements.add(new Clavier('a'));
        evenements.add(new Clavier('z'));
        evenements.add(new Souris(40,20, Souris.Bouton.Aucun));
        evenements.add(new Message("Ce message fonctionne correctement"));
        for (Evenement e : evenements)
            e.afficher();

    }
}
