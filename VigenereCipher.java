public class VigenereCipher implements Cipher {
    
    public String encrypt(String message, String key){
        return vigenereLogic(message, key, false);
    }

    public String decrypt(String message, String key){
        return vigenereLogic(message, key, true);
    }

    public void bruteForce(String encryptedMessage){
        System.out.println("Vigenere Cipher does not have a Brute Force option");
    }

    public String encrypt(String message, int key){
        return "Integer keys are not supported for the Vigenere Cipher";
    }

    public String decrypt(String message, int key){
        return "Integer keys are not supported for the Vigenere Cipher";
    }

    public String encrypt(String message){
        return "Vigenere Cipher needs a string key to encrypt.";
    }

    public String decrypt(String message){
        return "Vigenere Cipher needs a string key to decrypt.";
    }

    private String vigenereLogic(String message, String key, boolean decrypt){
        String encrypted = "";
        String vMessage = message.toUpperCase();
        String vKey = key.toUpperCase();
        int keyPosition = 0;
        for (int i = 0; i < vMessage.length(); i++){
            char c = vMessage.charAt(i);

            if (Character.isLetter(c)){
                char current = vKey.charAt(keyPosition % vKey.length());
                int messageVal = c - 'A';
                int keyVal = current - 'A';
                int shift;
                if (!decrypt){
                    shift = messageVal + keyVal;
                     if (shift >= 26){
                        shift = shift -= 26;
                     }
                }else{
                    shift = messageVal - keyVal;
                    if (shift < 0){
                        shift = shift + 26;
                    }
                }
                char position = (char)(shift + 'A');
                encrypted += position;
                keyPosition++;
                
            } else {
                encrypted += c;
            }
       

        }

        return encrypted;
    }
}
