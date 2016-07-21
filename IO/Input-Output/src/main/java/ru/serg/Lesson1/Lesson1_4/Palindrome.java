package ru.serg.Lesson1.Lesson1_4;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by Serg on 21.07.2016.
 */
public class Palindrome {

    private BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public String askOne() throws IOException {
        System.out.println("Enter a word");
        return reader.readLine();
    }

    public String input(String value) {
        return String.format(value);
    }

    private void close(){
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String reverse(String string){
        String res = "";
        for (int i = string.length() -1; i >= 0 ; i--) {
             res += (char)string.charAt(i);
        }
        return res;
    }

    public boolean isPalindrome(String string){
        return string.equals(reverse(string));
    }


    public static void main(String[] args) throws IOException {
        Palindrome palindrome = new Palindrome();

        try {
            String val = palindrome.input(palindrome.askOne());
            palindrome.isPalindrome(val);
            palindrome.close();

        }catch (NumberFormatException nfe){
            System.out.println("Not a String");
        }
    }
}
