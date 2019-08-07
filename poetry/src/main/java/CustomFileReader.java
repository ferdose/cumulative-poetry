import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

class CustomFileReader {
    List<String> readFromFile(String filePath) {
        List<String> lines = null;
        try {
            lines = Files.readAllLines(Paths.get(filePath),
                    Charset.defaultCharset());
            /*
            for (String line : lines) {
                System.out.println(line);
            }*/
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("File Not Found");
        }
        return lines;
    }
}
