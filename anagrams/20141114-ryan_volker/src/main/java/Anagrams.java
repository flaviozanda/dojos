import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Write a program to generate all potential
 * anagrams of an input string.
 * <p/>
 * For example, the potential anagrams of "biro" are
 * <p/>
 * biro bior brio broi boir bori
 * ibro ibor irbo irob iobr iorb
 * rbio rboi ribo riob roib robi
 * obir obri oibr oirb orbi orib
 */
public class Anagrams {
    public List<String> of(String startText) {
        if (startText.length() <= 1) {
            return Collections.singletonList(startText);
        }
        char firstChar = startText.charAt(0);
        String remaining = startText.substring(1);
        List<String> baseTexts = of(remaining);
        ArrayList<String> anas = new ArrayList<String>();
        for (String baseText : baseTexts) {
            for (int i = 0; i < startText.length(); i++) {
                anas.add(insertCharAtPosition(firstChar, i, baseText));
            }
        }
        return anas;
    }

    private String insertCharAtPosition(char character, int position, String text) {
        StringBuilder builder = new StringBuilder();
        builder.append(text.substring(0, position));
        builder.append(character);
        builder.append(text.substring(position));
        return builder.toString();
    }
}

