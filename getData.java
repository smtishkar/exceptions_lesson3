import java.util.Scanner;

/**
 * getData
 */
public class getData {

    public static String[] getDataFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println(
                    "Введите следующие данные в указанном порядке и формате разделяя данные пробелом: ФИО, дата рождения (dd.mm.yyyy), номер телефона (79031253486), пол (f/m): ");
            String data = scanner.nextLine();
            String[] arr = data.split(" ");
            if (arr.length == 6){
                return arr;
            }
            else if (arr.length < 6 ) {
                 
                    System.out.println("Вы ввели не все данные");
            } else {
                System.out.println("Вы ввели больше данных чем нужно");
            }
            
        }
    }
}