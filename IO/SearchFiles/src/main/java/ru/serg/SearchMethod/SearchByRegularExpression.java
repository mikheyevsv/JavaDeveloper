package ru.serg.SearchMethod;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Sergey Miheev
 * @version 1.0
 */
public class SearchByRegularExpression extends SearchByFileName{

    /**
     *
     * @param file
     * @param param check regular expression
     * @return
     *
     */

    @Override
    public boolean chek(File file, String param) {
        Pattern pattern = Pattern.compile(param);
        Matcher matcher = pattern.matcher(file.getName());
        return matcher.matches();
    }
}

