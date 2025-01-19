package ticket;
import java.lang.*;
import java.util.*;

public class LingeAchate {
    private Ticket ticket;
    private int quantity;

    public LingeAchate(Ticket ticket,int quantity){
        this.ticket = ticket;
        this.quantity = quantity;
    }

    public void Lire(Scanner scanner){
        this.quantity = scanner.nextInt();
        Ticket ticket = new Ticket(scanner.next(), scanner.nextInt());
    }

    public int Soin(){
        return quantity * ticket.getPrix();
    }

    public void afficher(){
        System.out.println("quantity" + quantity);
        ticket.Affiche();
    }
}
