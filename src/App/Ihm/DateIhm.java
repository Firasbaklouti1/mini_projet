package App.Ihm;
import App.Entities.*;
import java.util.Scanner;
public class DateIhm {
    public static Date saisiDate(){
        int j,m,a;
        try (Scanner sc = new Scanner(System.in)) {
            System.err.println("introduire le jour");
            j=sc.nextInt();
            System.err.println("introduire le moi");
            m=sc.nextInt();
            System.err.println("introduire le anne");
            a=sc.nextInt();
        }
        return new Date(j, m, a);

    }
}
