package ru.serg;

/**
 * This class checks the entered keys.
 * @author Sergey Miheev
 * @version 1.0
 */
public class Validator {

    private final String[] validKeys = new String[]{"-d","-n","-m","-o","-f","-r"};


    private final String[] descKeys = new String[]{
            "Use for specify directory",
            "Use for for specify name of file, or regular expression, or mask of file",
            "Use for search file by mask",
            "Use for search file by name",
            "Use for search by regular expression",
            "Use for specify file for write result"
    };


    private int badKey = 0;


    private StringBuffer hint = new StringBuffer();


    public boolean valid(String[] keys) {
        boolean valid = false;
        for(String key : keys) {
            if(key.startsWith("-")) {
                valid = keyExist(key);
                if(!valid) {
                    badKey++;
                    hint.append(String.format("%s - it is bad key, please choose correct key\n", key));
                }
            }
        }
        if(badKey != 0) {
            System.out.println(hint.toString());
            showValidKeys();
        }
        return badKey == 0;
    }


    private boolean keyExist(String key) {
        boolean exist = false;
        for(String valid : validKeys) {
            if(key.equals(valid))
                exist = true;
        }
        return exist;
    }


    private void showValidKeys() {
        System.out.println("List of valid keys");
        for(int index = 0; index < validKeys.length; index++) {
            System.out.println(String.format("%s - %s",validKeys[index],descKeys[index]));
        }
    }

}
