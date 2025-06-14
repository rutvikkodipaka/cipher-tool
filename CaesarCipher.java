public class CaesarCipher implements Cipher{
   
    public String encrypt(String message, int key){
        return caesarLogic(message, key, false);
    }

    public String decrypt(String message, int key){
        return caesarLogic(message, key, true);
    }

    public String encrypt(String message, String key){
        return encrypt(message, Integer.parseInt(key));
    }

    public String decrypt(String message, String key){
        return decrypt(message, Integer.parseInt(key));
    }

    public String encrypt(String message){
        return "Caesar Cipher needs a numerical key to encrypt.";
    }

    public String decrypt(String message){
        return "Caesar Cipher needs a numerical key to decrypt.";
    }

    public void bruteForce(String encryptedMessage){
        for (int shift = 1; shift <= 25; shift++){
            String attempt = decrypt(encryptedMessage, shift);
            System.out.println("Shift " + shift + ": " + attempt);
        }
    }

    private String caesarLogic(String message, int shifts, boolean decrypt){
        if (1 > shifts || shifts > 25){
            return "Cipher cannot be done";
        }
        String output = "";
        for (int i = 0; i < message.length(); i++){
            char current = message.charAt(i);
            int ascii = (int)(current);
            int shift;
            if (decrypt){
                shift = -shifts;
            } else {
                shift = shifts;
            }

            if (ascii >= 65 && ascii <= 90 ){
                ascii = ascii + shift;
                    if (ascii > 90){
                        ascii = ascii - 26;
                    }
                    if (ascii < 65){
                        ascii = ascii + 26;
                    }
                    output += (char)ascii;
            }
                else if  (97 <= ascii && ascii <= 122){
                    ascii = ascii + shift;
                    if (ascii > 122){
                        ascii = ascii - 26;
                    }
                    if (ascii < 97){
                        ascii = ascii + 26;
                    }
                    output += (char)ascii;
                }
                else{
                    output += current;
            }
                
        }
            
        
        return output; 
    }

}
