public class BasicTextFileReader extends TextFileReader {

    public BasicTextFileReader(String path) {
        super(path);
    }

    @Override
    public void display() {
        for(String line: lines) {
            System.out.println(line);
        }
    }
}
