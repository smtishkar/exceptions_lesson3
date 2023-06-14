import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class test {
    public static void main(String[] args) {
            String str = "02.10.2010";
            // String str = "2010-10-01";
            // LocalDate date =LocalDate.parse(str);
            // LocalDate a = LocalDate.parse(str, DateTimeFormatter.ofPattern("dd-MM-yyyy"));
            // LocalDate date2 = LocalDate.parse("07/17/2019", DateTimeFormatter.ofPattern("MM/dd/yyyy"));
            // LocalDate date2 = LocalDate.parse("07.17.2019", DateTimeFormatter.ofPattern("MM.dd.yyyy"));
            LocalDate date2 = LocalDate.parse(str, DateTimeFormatter.ofPattern("MM.dd.yyyy"));
            // System.out.println(a);
            System.out.println(date2);
    }
}
