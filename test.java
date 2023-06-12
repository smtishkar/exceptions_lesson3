import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class test {
    public static void main(String[] args) throws ParseException {
        String string = "02.10.2020";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd,MM,yyyy", Locale.ENGLISH);
        LocalDate date = LocalDate.parse(string, formatter);
        System.out.println(date); // 2010-01-02

    }
}
