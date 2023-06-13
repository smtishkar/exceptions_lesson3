import java.time.LocalDate;

public class parseData {

    public static String [] parsingOfData(String [] arr) {
        try {
        long telNumber = Long.parseLong(arr[4]);
        LocalDate dayOfBirthDate = LocalDate.parse(arr[3]);
        if (!arr[5].matches("[f,F,m,M]")){
            System.out.println("Не верно введен пол. Попробуйте еще раз");
            getData.getDataFromUser();
        }
        
        } catch (Exception e) {
        System.out.println("Данные введены не в корректном формате (телефон или дата рождения)");
        }
        return arr;
        
    }
    
}
