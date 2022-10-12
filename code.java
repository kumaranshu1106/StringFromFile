import java.io.IOException;
import java.nio.charset.Charset;
import java.util.List;

public class FileString {

    public static void main(String[] args) throws IOException {

        String path = System.getProperty("user.dir") + "\\src\\test.txt";
        Charset encoding

        List<String> lines = Files.readAllLines(Paths.get(path), encoding);
        System.out.println(lines);
    }
}
