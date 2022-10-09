import java.io.*;
import java.util.ArrayList;

public abstract class TextFileReader implements Filereader{

    private final String path;
    protected final ArrayList<String> lines;

    protected TextFileReader(String path) {
        this.path = path;
        this.lines = new ArrayList<String>();
    }

    @Override
    public void read() throws IOException {
        Closeable ressource = null;
        try {
            File file = new File(path);
            BufferedReader br = new BufferedReader(new FileReader(file));
            ressource = br;
            System.out.println("\u001B[42m" + " The " + path + " file has been opened " + "\u001B[0m");
            String line = "";
            while((line = br.readLine()) != null) {
                lines.add(line);
            }
        } catch(Exception e) {
            System.out.println("\u001B[41m" + "File : " + path + " could not be found" + "\u001B[0m");
            //e.printStackTrace();
        } finally {
            if(ressource != null) {
                ressource.close();
            }
        }
    }

    @Override
    public abstract void display();
}
