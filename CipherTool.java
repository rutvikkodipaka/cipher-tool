public class CipherTool {
    public static void main(String[] args){
        StdOut.println("Welcome to the Cipher Tool");
        StdOut.println("What Cipher would you like to choose (Caesar/Vigenere/Atbash/Substitution/Rail Fence)?");
        String choice = StdIn.readLine();
        
        if (choice.equalsIgnoreCase("Caesar")){

        StdOut.print("Enter in your message: ");
        String message = StdIn.readLine();

        StdOut.print("Enter the amount of times you want to shift (1-25): ");
        int key = StdIn.readInt();

        StdIn.readLine();

        StdOut.print("Do you want to encrypt, decrypt, or Brute force the message? (E/D/B): ");
        String input = StdIn.readLine();

        Cipher cipher = new CaesarCipher();

        String output;

        if (input.equalsIgnoreCase("E")){
            output = cipher.encrypt(message,key);
            StdOut.println("Your encrypted message is: " + output);
        } else if (input.equalsIgnoreCase("D")){
            output = cipher.decrypt(message, key);
            StdOut.println("Your decrypted message is: " + output);
        } else if (input.equalsIgnoreCase("B")){
            StdOut.println("Brute Force Results: ");
            cipher.bruteForce(message);
        }else{
            StdOut.println("Invalid option");
        }
        
    } else if (choice.equalsIgnoreCase("Vigenere")){
        StdOut.print("Enter in your message: ");
        String message = StdIn.readLine();

        StdOut.print("Enter your key word: ");
        String key = StdIn.readLine();

        StdOut.print("Do you want to encrypt, decrypt, or Brute Force the message? (E/D/B): ");
        String input = StdIn.readLine();

        Cipher cipher = new VigenereCipher();

        String output;

        if(input.equalsIgnoreCase("E")){
            output = cipher.encrypt(message, key);
            StdOut.println("Your encrypted message is: " + output);
        } else if (input.equalsIgnoreCase("D")) {
            output = cipher.decrypt(message, key);
            StdOut.println("Your decrypted message is: " + output);
        } else if (input.equalsIgnoreCase("B")){
            cipher.bruteForce(message);
        } else{ 
            StdOut.println("Invalid option");
        }

    }else if(choice.equalsIgnoreCase("Atbash")){
        StdOut.print("Enter in your message: ");
        String message = StdIn.readLine();

        StdOut.print("Do you want to encrypt or decrypt? (E/D): ");
        String input = StdIn.readLine();

        Cipher cipher = new Atbash();

        String output;

        if (input.equalsIgnoreCase("E")){
            output = cipher.encrypt(message);
            StdOut.println("Your encrypted message is: " + output);
        } else if (input.equalsIgnoreCase("D")){
            output = cipher.decrypt(message);
            StdOut.println("Your decrypted message is: " + output);
        } else {
            StdOut.println("Invalid option");
        }

    } else if(choice.equalsIgnoreCase("Substitution")){

        StdOut.print("Enter in your message: ");
        String message = StdIn.readLine();

        StdOut.print("Enter your key. (Your key must be the alphabet scrambled up in order. Make sure it is 26 characters long and no letters repeat.): ");
        String key = StdIn.readLine();

        StdOut.print("Do you want to encrypt or decrypt? (E/D): ");
        String input = StdIn.readLine();

        Cipher cipher = new SubstitutionCipher();

        String output;

        if (input.equalsIgnoreCase("E")){
            output = cipher.encrypt(message, key);
            StdOut.println("Your encrypted message is: " + output);
        } else if (input.equalsIgnoreCase("D")){
            output = cipher.decrypt(message, key);
            StdOut.println("Your decrypted message is: " + output);
        } else {
            StdOut.println("Invalid option");
        }

    } else if(choice.equalsIgnoreCase("Rail Fence")){

        StdOut.print("Enter your message: ");
        String message = StdIn.readLine();

        StdOut.print("Enter the amount of rails you want: ");
        int rails = StdIn.readInt();
        StdIn.readLine();

        StdOut.print("Do you want to encrypt or decrypt? (E/D): ");
        String input = StdIn.readLine();

        Cipher cipher = new RailFenceCipher();

        String output;

        if(input.equalsIgnoreCase("E")){
            output = cipher.encrypt(message,rails);
            StdOut.println("Your encrypted message is: " + output);
        } else if (input.equalsIgnoreCase("D")){
            output = cipher.decrypt(message, rails);
            StdOut.println("Your decrypted message is: " + output);
        } else {
            StdOut.println("Invalid input.");
        }

    } else{
        StdOut.println("Cipher choice is invalid");
    }
    }
}