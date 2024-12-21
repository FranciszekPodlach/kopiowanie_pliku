import java.io.*;

public class File {
    public static void main(String[] args) {
        // Ścieżki do plików wejściowego i wyjściowego
        String inputFile = "C:/Users/podla/Desktop/input.txt";
        String outputFile = "C:/Users/podla/Desktop/output.txt";

        // Mechanizm automatycznego zarządzania zasobami
        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {

            String line;
            while ((line = reader.readLine()) != null) {
                // Zastąpienie spacji myślnikami
                line = line.replace(" ", "-");
                writer.write(line);
                writer.newLine(); // Dodanie nowej linii w pliku wyjściowym
            }

            System.out.println("Done.");

        } catch (IOException e) {
            System.err.println("Wystąpił błąd podczas kopiowania pliku: " + e.getMessage());
        }
    }
}
