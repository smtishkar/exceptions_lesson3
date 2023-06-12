import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом:
ФИО, дата рождения, номер телефона, пол

Форматы данных:
фамилия, имя, отчество - строки
дата рождения - строка формата dd.mm.yyyy
номер телефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше или больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java или создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><дата рождения> <номер телефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */
public class aplication {

    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
    ArrayList<userData> custdate = new ArrayList<>();
        
    String [] arr = getData.getDataFromUser();
    long a = Long.parseLong(arr[4]);
    LocalDate b = LocalDate.parse(arr[3]);
    userData cust = new userData(arr[0],arr[1],arr[2],b,a,arr[5]); 

    custdate.add(cust);
    cust = new userData("dffs","dsfsdfsd","dsfsdf",b,a,arr[5]); 
    custdate.add(cust);
    
    System.out.println(custdate);

     try(FileWriter fw = new FileWriter("myfile.txt", true);
     BufferedWriter bw = new BufferedWriter(fw);
     PrintWriter out = new PrintWriter(bw))
 {
        for (int i = 0; i < arr.length; i++) {
        if (i < arr.length - 1) out.print("< " + arr[i]+ " > ");
        else {
            out.print("< " + arr[i]+ " >;");
            bw.newLine();
        }
        }

 } catch (IOException e) {
     //exception handling left as an exercise for the reader
 }


     
    }





}


