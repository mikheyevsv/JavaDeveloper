package ru.serg.Lesson1.Lesson1_4;

import org.junit.BeforeClass;
import org.junit.Test;
import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

/**
 * Created by Serg on 21.07.2016.
 */
public class PalindromeTest {


    private static Palindrome palindrome;
    @BeforeClass
    public static void initialise(){
        palindrome = new Palindrome();
    }


    @Test
    public void isPalindromeTest() throws Exception {
        boolean res = palindrome.isPalindrome("aba");
        assertThat(true, is(equalTo(res)));
    }

    @Test
    public void reverseTest() throws Exception {
        String res = palindrome.reverse("bc");
        assertThat("cb", is(equalTo(res)));

    }
}