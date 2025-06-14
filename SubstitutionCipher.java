public class SubstitutionCipher implements Cipher {
    
    public String encrypt(String message, String key){
        return substitutionLogic(message,key, false);
    }

    public String decrypt(String message, String key){
        return substitutionLogic(message,key, true);
    }

    public String encrypt(String message, int key){
        return "Substitution Cipher needs a key of 26 letters";
    }

    public String decrypt(String message, int key){
        return "Substitution Cipher needs a key of 26 letters";
    }

    public String encrypt(String message){
        return "Substitution Cipher needs a key of 26 letters";
    }

    public String decrypt(String message){
        return "Substitution Cipher needs a key of 26 letters";
    }

    public void bruteForce(String encryptedMessage){
        System.out.println("Substitution Cipher does not support a brute force method.");
    }
    
    private String substitutionLogic(String message, String key, boolean decrypt){ 
        if (key.length() > 26 || key.length() < 26){
            return "Invalid key";
        }
        else{
        String encrypted = "";
        message = message.toUpperCase();
        key = key.toUpperCase();
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        for (int j = 0; j < message.length(); j++){
                char c = message.charAt(j);
               
            if (Character.isLetter(c)){ 
                  if (!decrypt){
                    if (message.charAt(j) == c){
                        int index = alphabet.indexOf(c);
                        encrypted += key.charAt(index);
                    }
                  } else {
                    if (message.charAt(j) == c){
                        int index = key.indexOf(c);
                        encrypted += alphabet.charAt(index);
                    }
                }
            } else {
                encrypted += message.charAt(j);
             }
            
        } 
            return encrypted;    
     }
     
   }
}
        
    


