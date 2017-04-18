package example.codeclan.com.wordcountapp;

/**
 * Created by user on 18/04/2017.
 */

public class TextEntry {
    private String textEntry;

    public TextEntry(String enteredText){
        textEntry = enteredText;
    }

    public String getTextEntry(){
        int wordCount = 0;
        String[] words = textEntry.split(" ");
        wordCount = wordCount + words.length;
        return "Number of words entered is: " +String.valueOf(wordCount);
    }

}