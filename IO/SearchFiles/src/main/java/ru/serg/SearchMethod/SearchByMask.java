package ru.serg.SearchMethod;

import java.io.File;
import java.nio.file.FileSystems;
import java.nio.file.PathMatcher;
import java.nio.file.Paths;

/**
 * Created by Serg on 05.08.2016.
 */
public class SearchByMask implements Chek {
    @Override
    public boolean chek(File file, String param) {
        PathMatcher matcher = FileSystems.getDefault().getPathMatcher(String.format("Global %s", param));
        return matcher.matches(Paths.get(file.getName()));
    }
}
