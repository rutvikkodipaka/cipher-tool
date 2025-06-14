public class RailFenceCipher implements Cipher  {
    
    public String encrypt(String message, int rails){
        return railFenceLogic(message,rails,false);
    }

    public String decrypt(String message, int rails){
        return railFenceLogic(message,rails,true);
    }

    public String encrypt(String message, String key){
        return "Rail Fence doesn't support a string key";
    }

    public String decrypt(String message, String key){
        return "Rail Fence doesn't support a string key";
    }

    public String encrypt(String message){
        return "Rail Fence needs a key to work";
    }

    public String decrypt(String message){
        return "Rail Fence needs a key to work";
    }

    public void bruteForce(String encryptedMessage){
        System.out.println("This cipher doesn't have a brute force method");
    }
    
    private String railFenceLogic(String message, int rails, boolean decrypt){
        String encrypted = "";
        if (!decrypt){
        char [][] zigzag = new char [rails][message.length()];
        int row = 0;
        int direction = 1;
            for (int i = 0;i < message.length(); i++){
                zigzag[row][i] = message.charAt(i);
               if (row == 0){
                direction = 1;
               } else if (row == rails -1){
                direction = -1;
               }
               row += direction;
            }
             for (int r = 0; r < rails; r++){
                for (int c = 0; c < message.length(); c++){
                 if (zigzag[r][c] != '\0'){
                    encrypted+=zigzag[r][c];
                }
                
            }
        }
        return encrypted;
    
    } else if (decrypt){
        char [][] zigzag = new char [rails][message.length()];
        int row = 0;
        int direction = 1; 
            for (int i = 0; i < message.length(); i++){
                zigzag[row][i] = '*';
                if (row == 0){
                    direction = 1;
                } else if (row == rails - 1){
                    direction = -1;
                }
                row += direction;
            }
            int index = 0;
            for (int r = 0; r < rails; r++){
                for (int c = 0; c < message.length(); c++){
                    if (index < message.length()){
                    if (zigzag[r][c] == '*'){
                        zigzag[r][c] = message.charAt(index);
                        index++;
                    }
                }
                }
            }
        int row2 = 0;
        int direction2 = 1;
            for (int i = 0; i < message.length(); i++){
                if (zigzag[row2][i] != '\0'){
                    encrypted += zigzag[row2][i];
                    if (row2 == 0){
                        direction2 = 1;
                    } else if (row2 == rails-1){
                        direction2 = -1;
                    }
                    row2+=direction2;
                }
            }
            
    }
    return encrypted;
}
}