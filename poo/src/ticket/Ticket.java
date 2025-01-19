package ticket;
import java.util.*;

public class Ticket {
    private String ref;
    private int prix;

    public Ticket(String ref, int prix){
        this.ref = ref;
        this.prix = prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }

    public int getPrix() {
        return prix;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getRef() {
        return ref;
    }

    public void lire(Scanner scanner){
        String ref = scanner.nextLine();
        String prix = scanner.nextLine();
    }

    public void Affiche(){
        System.out.println("refernce: " + ref + "prix:" + prix);
    }
}