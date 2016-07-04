package ru.serg;

import javafx.util.Pair;

import java.util.LinkedList;


/**
 * Created by Serg on 30.05.2016.
 */
public class Generator implements Template {

    public String generate(String template, LinkedList<Pair<String, String>> data) {

        for (Pair<String, String> temp : data) {
            template = template.replace(temp.getKey(), temp.getValue());
        }
        return template;
    }
}