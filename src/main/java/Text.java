import java.util.ArrayList;

public class Text {
    String text;
    int lengthWithoutPunctuation;

    public Text() {

    }

    public void getLength() {
        char[] cs = text.toCharArray();
        for(char c: cs){
            if(c != '.' && c != ',' && c != ';' && c != '!' && c != '?' && c != "'".toCharArray()[0]) {
                lengthWithoutPunctuation++;
            }
        }
    }

}
