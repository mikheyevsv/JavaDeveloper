package ru.serg;

import javafx.util.Pair;

import java.util.LinkedList;


/**
 * @author Serg
 */
public interface Template {
    /**
     * Hello ${name}.
     * @param temmplate
     * @param data
     * @return
     */
    String generate (String temmplate, LinkedList<Pair<String, String>> data);
}
