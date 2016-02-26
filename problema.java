import java.io.*

public class Main {
    public static void main(String[] args) throws IOException {
        File file = new File(args[0]);
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;
        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            voltear(line);
        }
    }

    public static void voltear(String line) {
        String[] palabras = line.split(" ");
        String output = "";
        for (int i = palabras.length - 1; i >= 0; i--) {
            output = output + palabras[i] + " ";
        }
        System.out.println(output.trim());
    }
}
