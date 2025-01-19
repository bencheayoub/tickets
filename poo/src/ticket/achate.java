package ticket;
import java.time.*;
import java.util.*;

public class achate{
    private static int compt;
    private LocalDate Date;
    private int num;
    private List<LingeAchate> linges;

    public achate(LocalDate Date){
        this.Date = Date;
        this.linges = new ArrayList<>();
        this.num = ++compt;
    }

    public void indate(){
        Date = LocalDate.now();
    }

    public void Innum(){
        num = 1;
    }

    public void Lire(Scanner scanner){
        int i;
        for(i = 1; i <= 5;i++ ){
            LingeAchate l = new LingeAchate(new Ticket(scanner.next(), scanner.nextInt()), scanner.nextInt());
        }
    }

    public int Total(){
        int sum = 0;
        for (LingeAchate i : linges){
            sum += i.Soin();
        }
        return sum;
    }
    
    public void Affiche(){
        for(LingeAchate i : linges){
            i.afficher();
        }
    }
}
