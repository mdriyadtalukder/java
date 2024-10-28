import java.text.*;
import java.util.*;

public class DateClasss {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat format = new SimpleDateFormat("dd/MM/YYYY");
        System.out.println(format.format(date));

    }
}
