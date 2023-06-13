import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileWrite {
    public static void fileWrite(String [] arr) throws fileNotExistException, IOException {
        
        try (FileWriter fw = new FileWriter("myfile.txt", true);
        BufferedWriter bw = new BufferedWriter(fw);
        PrintWriter out = new PrintWriter(bw)) {
            for (int i = 0; i < arr.length; i++) {
                if (i < arr.length - 1)
                out.print("< " + arr[i] + " > ");
                else {
                    out.print("< " + arr[i] + " >;");
                    bw.newLine();
                }
            }
            
        } catch (FileNotFoundException e) {
            throw new fileNotExistException("Указанный файл не существует или поврежден");
        }
    }
}
