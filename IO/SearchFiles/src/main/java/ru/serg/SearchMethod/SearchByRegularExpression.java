package ru.serg.SearchMethod;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Serg
 */
public class SearchByRegularExpression implements Chek {

    @Override
    public boolean chek(File file, String param) {
        Pattern pattern = Pattern.compile(param);
        Matcher matcher = pattern.matcher(file.getName());
        return matcher.matches();
    }
}

