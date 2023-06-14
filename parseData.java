
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class parseData {

    public static String[] parsingOfData(String[] arr) {
        try {
            LocalDate.parse(arr[3], DateTimeFormatter.ofPattern("MM.dd.yyyy"));
            Long.parseLong(arr[4]);
        } catch (RuntimeException e) {
            System.out.println(e + " Данные введены не в корректном формате (телефон или дата рождения)");
        }
        return arr;
    }

}
