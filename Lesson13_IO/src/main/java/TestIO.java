import java.io.*;
public class TestIO {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\JAVA\\R&J.txt"));
             PrintWriter romeoWriter = new PrintWriter(new FileWriter("C:\\JAVA\\Romeo.txt"));
             PrintWriter julietWriter = new PrintWriter(new FileWriter("C:\\JAVA\\Juliet.txt"))) {

            String line;
            boolean isRomeo = false;

            while ((line = reader.readLine()) != null) {
                if (line.startsWith("Romeo:")) {
                    isRomeo = true;
                    romeoWriter.println(line);
                } else if (line.startsWith("Juliet:")) {
                    isRomeo = false;
                    julietWriter.println(line);
                } else {
                    if (isRomeo) {
                        romeoWriter.println(line);
                    } else {
                        julietWriter.println(line);
                    }
                }
            }
        } catch (FileNotFoundException exc) {
            System.out.println("File not found: " + exc.getMessage());
        } catch (IOException exc) {
            System.out.println("exception input/output: " + exc.getMessage());
        }
    }
}