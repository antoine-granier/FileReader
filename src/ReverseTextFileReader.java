import java.util.Collections;

public class ReverseTextFileReader extends TextFileReader{

    public ReverseTextFileReader(String path) {
        super(path);
    }

    @Override
    public void display() {
        Collections.reverse(lines);
        for(String line: lines) {
            System.out.println(line);
        }
    }
}
