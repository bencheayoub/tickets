package ticket;
import java.time.*;
import java.util.*;
//public static void main(String[] args) {
//        LocalDate currentDate = LocalDate.now();
//        System.out.println("Current Date: " + currentDate);
//    }

public class achate{
    private static int compt;
    private String Date;
    private int num;
    private List<Ticket> linges;

    public achate(String Date){
        this.Date = Date;
        this.linges = new ArrayList<>();
        this.num = ++compt;
    }

    public void Innum(){
        num = 0;
    }


}
