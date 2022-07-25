import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.TimeZone;

public class Main {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        SimpleDateFormat sdf3 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        sdf2.setTimeZone(TimeZone.getTimeZone("GMT"));



        Date x1 = new Date();
        Date x2 = new Date(System.currentTimeMillis());

        Date y1 = sdf1.parse("24/06/2021");

        Date y2 = sdf2.parse("24/06/2022 21:03:00");

        Date y3 = Date.from(Instant.parse("2012-06-25T15:42:07Z"));

        System.out.println("Sdf1 = " + y1 + " Sdf2 + " + y2);
        System.out.println();
        System.out.println(sdf1.format(y1));
        System.out.println();
        System.out.println(sdf2.format(y2));

        System.out.println();
        System.out.println();
        System.out.println(sdf2.format(x1));

        System.out.println();
        System.out.println(sdf2.format(x2));

        System.out.println();
        System.out.println(sdf2.format(y3));

        System.out.println();
        System.out.println("________________________________________________");

        System.out.println();
        System.out.println(sdf3.format(y1));
        System.out.println();
        System.out.println(sdf3.format(y2));

        System.out.println();
        System.out.println();
        System.out.println(sdf3.format(x1));

        System.out.println();
        System.out.println(sdf3.format(x2));

        System.out.println();
        System.out.println(sdf3.format(y3));


    }
}