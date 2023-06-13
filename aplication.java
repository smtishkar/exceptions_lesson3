import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Напишите приложение, которое будет запрашивать у пользователя следующие
 * данные в произвольном порядке, разделенные пробелом:
 * ФИО, дата рождения, номер телефона, пол
 * 
 * Форматы данных:
 * фамилия, имя, отчество - строки
 * дата рождения - строка формата dd.mm.yyyy
 * номер телефона - целое беззнаковое число без форматирования
 * пол - символ латиницей f или m.
 * 
 * Приложение должно проверить введенные данные по количеству. Если количество
 * не совпадает с требуемым, вернуть код ошибки, обработать его и показать
 * пользователю сообщение, что он ввел меньше или больше данных, чем требуется.
 * 
 * Приложение должно попытаться распарсить полученные значения и выделить из них
 * требуемые параметры. Если форматы данных не совпадают, нужно бросить
 * исключение, соответствующее типу проблемы. Можно использовать встроенные типы
 * java или создать свои. Исключение должно быть корректно обработано,
 * пользователю выведено сообщение с информацией, что именно неверно.
 * 
 * Если всё введено и обработано верно, должен создаться файл с названием,
 * равным фамилии, в него в одну строку должны записаться полученные данные,
 * вида
 * 
 * <Фамилия><Имя><Отчество><дата рождения> <номер телефона><пол>
 * 
 * Однофамильцы должны записаться в один и тот же файл, в отдельные строки.
 * 
 * Не забудьте закрыть соединение с файлом.
 * 
 * При возникновении проблемы с чтением-записью в файл, исключение должно быть
 * корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */
public class aplication {

    public static void main(String[] args) throws fileNotExistException, IOException {

        ArrayList<userData> custdate = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Хотите ли вы создать нового пользователя: ");
        String answer = scanner.nextLine();
        while (answer == "y") {

            String[] arr = getData.getDataFromUser();
            String[] parsedArray = parseData.parsingOfData(arr);
            long telNumber = Long.parseLong(arr[4]);
            LocalDate dayOfBirthDate = LocalDate.parse(arr[3]);
            userData cust = new userData(parsedArray[0], parsedArray[1], parsedArray[2], dayOfBirthDate, telNumber,
                    parsedArray[5]);
            custdate.add(cust);
            fileWrite.fileWrite(parsedArray);
        }
    }

}
