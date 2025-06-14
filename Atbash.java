public class Atbash implements Cipher {
    
    public String encrypt(String message){
        return atbashLogic(message);
    }

    public String decrypt(String message){
        return atbashLogic(message);
    }

    public String encrypt(String message, int key){
        return "Integer key is not needed for Atbash";
    }

    public String decrypt(String message, int key){
        return "Integer key is not needed for Atbash";
    }

    public String encrypt(String message, String key){
        return "String key is not needed for Atbash";
    }

    public String decrypt(String message, String key){
        return "String key is not needed for Atbash";
    }

    public void bruteForce( String encryptedMessage){
        System.out.println("Atbash Cipher does not have a Brute Force option.");
    }

    private String atbashLogic(String message){
        String encrypted = "";
        for (int i = 0; i < message.length(); i++){
            char c = message.charAt(i);
            if (65 <= (int)(c) && (int)(c) <= 90){
            encrypted += (char)('Z'-(c - 'A'));
            } else if (97 <= (int)(c) && (int)(c) <= 122) { 
            encrypted += (char)('z'-(c - 'a'));
            } else {
            encrypted += c;
            }
        }
        return encrypted;
    }
}
