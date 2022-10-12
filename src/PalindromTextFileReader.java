public class PalindromTextFileReader extends TextFileReader {

    public PalindromTextFileReader(String path) {
        super(path);
    }

    @Override
    public void display() {
        StringBuilder sb = new StringBuilder();
        for(String line: lines) {
            sb.append(line).append("\n");
            System.out.println(line);
        }
        sb.reverse();
        System.out.println(sb.toString());
    }
}
