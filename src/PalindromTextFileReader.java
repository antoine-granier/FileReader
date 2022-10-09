public class PalindromTextFileReader extends TextFileReader {

    public PalindromTextFileReader(String path) {
        super(path);
    }

    @Override
    public void display() {
        for(String line: lines) {
            StringBuilder sb = new StringBuilder();
            sb.append(line);
            sb.reverse();
            System.out.println(sb.toString());
        }
    }
}
