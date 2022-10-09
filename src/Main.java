import java.io.File;
import java.io.IOException;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        String path = System.getProperty("user.dir") + "\\test.txt";
        if(args.length != 0) {
            path = args[0];
        } else {
            String [] tabPath = System.getProperty("user.dir").split(Pattern.quote(File.separator));
            if(tabPath[tabPath.length - 3].equals("out")) {
                path = "../../../test.txt";
            }
        }
        System.out.println("Basic display : \n");
        BasicTextFileReader btfr = new BasicTextFileReader(path);
        btfr.read();
        btfr.display();
        System.out.println("\nReverse display : \n");
        ReverseTextFileReader rtfr = new ReverseTextFileReader(path);
        rtfr.read();
        rtfr.display();
        System.out.println("\nPalindrom display : \n");
        PalindromTextFileReader ptfr = new PalindromTextFileReader(path);
        ptfr.read();
        ptfr.display();
    }
}
