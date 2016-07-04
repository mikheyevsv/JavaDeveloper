package ru.serg;

import javafx.util.Pair;
import org.junit.Test;

import java.util.LinkedList;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Created by Serg on 30.05.2016.
 */
public class TemplateTest {
    @Test
    public void whenTakeTextWithDataShouldReplaceParamsToData (){
        Template template = new Generator();
        LinkedList<Pair<String, String>> list = new LinkedList<Pair<String, String>>();
        String text = "Hello ${name}";
        list.add(new Pair<String, String>("${name}", "Serg"));
        String checked = "Hello Serg";

        String result = template.generate(text, list);

        assertThat(result, is(checked));
    }
}