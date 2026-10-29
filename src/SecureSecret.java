import java.util.Scanner;
import java.util.Random;

public class SecureSecret {
    // Prime modulus using Number Theory to prevent overflow and ensure cyclic mapping
    private static final int PRIME_MODULUS = 257;

    // Custom Encryption using Number Theory (Modular Arithmetic)
    public static String encrypt(String plaintext, int key) {
        StringBuilder ciphertext = new StringBuilder();
        for (int i = 0; i < plaintext.length(); i++) {
            int ch = plaintext.charAt(i);
            // Mathematical formula: c' = (c + key) mod PRIME_MODULUS
            int encryptedChar = (ch + key) % PRIME_MODULUS;
            ciphertext.append((char) encryptedChar);
        }
        return ciphertext.toString();
    }

    // Custom Decryption using Number Theory (Modular Inverse/Subtraction)
    public static String decrypt(String ciphertext, int key) {
        StringBuilder plaintext = new StringBuilder();
        for (int i = 0; i < ciphertext.length(); i++) {
            int ch = ciphertext.charAt(i);
            // Reversing the modular arithmetic operation safely
            int decryptedChar = (ch - key + PRIME_MODULUS) % PRIME_MODULUS;
            plaintext.append((char) decryptedChar);
        }
        return plaintext.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Please enter your secret code: ");
        String message = scanner.nextLine();

        System.out.print("Enter any secret key (like5): ");
        int mainKey = scanner.nextInt();

        // --- KEY SPLITTING (Additive Secret Sharing) ---
        int share1 = random.nextInt(mainKey) + 1;
        int share2 = mainKey - share1;

        System.out.println("\n--- Number Theory & Key Splitting Applied ---");
        System.out.println("Share 1 (Server Storage): " + share1);
        System.out.println("Share 2 (User Device): " + share2);

        // Encryption
        String encrypted = encrypt(message, mainKey);
        System.out.println("\nEncrypted Ciphertext: " + encrypted);

        // --- DECRYPTION WITH SHARES ---
        System.out.println("\n Enter both shares for decrypt the Message:");//
        System.out.print("please enter share 1: ");
        int enteredShare1 = scanner.nextInt();

        System.out.print("please enter share 2: ");
        int enteredShare2 = scanner.nextInt();

        int combinedKey = enteredShare1 + enteredShare2;

        if (combinedKey == mainKey) {
            String decrypted = decrypt(encrypted, combinedKey);
            System.out.println("Success! Decrypted Original Message: " + decrypted);
        } else {
            System.out.println("Error: wrong shares! Decryption Failed.");
        }

        scanner.close();
    }
}