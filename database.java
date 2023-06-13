import java.util.ArrayList;
import java.util.Scanner;

/**
 * database
 */
public class database {

    ArrayList<userData> custdate = new ArrayList<>(); 

    public static ArrayList<userData> database(ArrayList<userData> custdate) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите ли вы создать новую базу клиентов Y/N (ВНИМАНИЕ ЕСЛИ ОТВЕТ 'Y' СТАРАЯ БАЗА БУДЕТ УДАЛЕНА): ");
        String data = scanner.nextLine();
        if (data.matches("y")) {
            custdate = new ArrayList<>(); 
            return custdate;     
        }
        
        return custdate;         
    }

}