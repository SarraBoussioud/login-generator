package geco;

import java.util.Random;

/**
 * Created by Dell Inspiron on 30/11/2016.
 */
public class PasswordGeneration {

    private static final String CHAR_LIST =
            "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";

    public String getRandomPassword(){
        int RANDOM_STRING_LENGTH = 8;
        StringBuffer randStr = new StringBuffer();
        for(int i=0; i<RANDOM_STRING_LENGTH; i++){
            int number = new Random().nextInt(CHAR_LIST.length());
            char ch = CHAR_LIST.charAt(number);
            randStr.append(ch);
        }
        return randStr.toString();
    }

}
