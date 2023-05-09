import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        int shift = 3; // Set the shift value

        // Read the input file
        String inputFileName = "src/plain.txt";
        String plaintext = "";
        try {
            File file = new File(inputFileName);
            Scanner scanner = new Scanner(file);
            plaintext = scanner.nextLine();
            scanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error reading input file: " + e.getMessage());
            return;
        }

        // Encrypt the plaintext
        String ciphertext = "";
        for (int i = 0; i < plaintext.length(); i++) {
            char c = plaintext.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                c = (char) ('A' + (c - 'A' + shift) % 26);
            } else if (c >= 'a' && c <= 'z') {
                c = (char) ('a' + (c - 'a' + shift) % 26);
            }
            ciphertext += c;
        }

        // Print the results
        System.out.println("This program uses a Caesar cipher for encryption.");
        System.out.println("Plaintext: " + plaintext);
        System.out.println("Ciphertext: " + ciphertext);
    }
}
