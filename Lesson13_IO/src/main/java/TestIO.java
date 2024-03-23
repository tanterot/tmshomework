import java.io.*;
public class TestIO {
    public static void main(String[] args) {
        String sourceFile = "C:\\JAVA\\R&J.txt";
        String romeoFile = "C:\\JAVA\\Romeo.txt";
        String julietFile = "C:\\JAVA\\Juliet.txt";
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             PrintWriter romeoWriter = new PrintWriter(new FileWriter(romeoFile));
             PrintWriter julietWriter = new PrintWriter(new FileWriter(julietFile))) {

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
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("exception input/output: " + e.getMessage());
        }
    }
}