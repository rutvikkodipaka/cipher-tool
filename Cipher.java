public interface Cipher {

    //Caesar Cipher and Rail Fence Cipher
    String encrypt(String message, int key);
    String decrypt(String message, int key);

    //Vigenere Cipher and Substitution Cipher
    String encrypt(String message, String key);
    String decrypt(String message, String key);

    //Atbash Cipher
    String encrypt(String message);
    String decrypt(String message);
    
    void bruteForce(String encryptedMessage);
    
}